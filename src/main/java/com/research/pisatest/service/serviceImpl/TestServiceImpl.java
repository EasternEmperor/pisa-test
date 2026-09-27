package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IAnswerDataAssembler;
import com.research.pisatest.assembler.IQuestionAssembler;
import com.research.pisatest.assembler.IUserAnswerAssembler;
import com.research.pisatest.common.DataTableEnum;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.entity.Question;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.exception.TestException;
import com.research.pisatest.mapper.AnswerSessionExtMapper;
import com.research.pisatest.mapper.QuestionDOMapper;
import com.research.pisatest.pojo.*;
import com.research.pisatest.repository.IAnswerDataRepository;
import com.research.pisatest.repository.IQuestionRepository;
import com.research.pisatest.repository.IUserAnswerRepository;
import com.research.pisatest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/22 21:38
 * @description
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private IQuestionRepository questionRepository;

    @Autowired
    private IQuestionAssembler questionAssembler;

    @Autowired
    private IAnswerDataRepository answerDataRepository;

    @Autowired
    private IAnswerDataAssembler answerDataAssembler;

    @Autowired
    private IUserAnswerRepository userAnswerRepository;

    @Autowired
    private QuestionDOMapper questionDOMapper;

    @Autowired
    private AnswerSessionExtMapper answerSessionExtMapper;

    @Autowired
    private IUserAnswerAssembler userAnswerAssembler;

    /**
     * 根据题目编号获取题目
     * @param no
     * @return
     */
    @Override
    public Question getQuestion(Integer no) {
        QuestionDO questionDO = questionRepository.getQuestionByNo(no);
        if (questionDO == null) {
            questionDO = new QuestionDO();
            questionDO.setHtmlName("finished");
        }
        return questionAssembler.DOToQuestion(questionDO);
    }

    /**
     * 提交答案
     * @param answerDatas
     */
    @Override
    public void submitAnswer(List<AnswerData> answerDatas) {
        if (CollectionUtils.isEmpty(answerDatas)) {
            throw new TestException("提交的答案为空！");
        }
        // 获取该题目答题数据表名
        QuestionDOExample example = new QuestionDOExample();
        example.createCriteria().andHtmlNameEqualTo(answerDatas.get(0).getHtmlName());
        String tableName = questionDOMapper.selectByExample(example).get(0).getDataTable();
        DataTableEnum dataTableEnum = DataTableEnum.getEnumByTableName(tableName);
        // 插入答题数据
        switch (dataTableEnum) {
            case AIR_CONDITIONER_DATA -> {
                List<AirControllerDataDO> airControllerDataDOs = answerDataAssembler.toAirControllerDataDOList(answerDatas);
                answerDataRepository.batchInsertAirControllerData(airControllerDataDOs);
            }
            case TICKETS_SALE_DATA -> {
                List<TicketsSaleDataDO> ticketSaleDataDOs = answerDataAssembler.toTicketsSaleDataDOList(answerDatas);
                answerDataRepository.batchInsertTicketsSaleData(ticketSaleDataDOs);
            }
            case CAT_FEED_DATA -> {
                List<CatFeedDataDO> catFeedDataDOs = answerDataAssembler.toCatFeedDataDOList(answerDatas);
                answerDataRepository.batchInsertCatFeedData(catFeedDataDOs);
            }
            default -> throw new TestException("题目错误！");
        }
    }

    @Override
    public void exploreData(AnswerData answerData) {
        if (answerData == null) {
            throw new TestException("提交的答案为空！");
        }
        // 时区调整：UTC -> 系统时间
        ZonedDateTime utcZoneDateTime = answerData.getEventStartTime().atZone(ZoneId.of("UTC"));
        ZonedDateTime systemZoneDateTime = utcZoneDateTime.withZoneSameInstant(ZoneId.systemDefault());
        answerData.setEventStartTime(systemZoneDateTime.toLocalDateTime());
        // 获取该题目答题数据表名
        QuestionDOExample example = new QuestionDOExample();
        example.createCriteria().andHtmlNameEqualTo(answerData.getHtmlName());
        String tableName = questionDOMapper.selectByExample(example).get(0).getDataTable();
        DataTableEnum dataTableEnum = DataTableEnum.getEnumByTableName(tableName);
        if (dataTableEnum == DataTableEnum.UNKNOWN_TABLE) {
            throw new TestException("题目错误！");
        }
        // 防重：本次答题中该题已完成（存在 END_ITEM / TIME_UP）后，拒绝再保存任何作答事件
        if (answerSessionExtMapper.countCompletedEvents(tableName, answerData.getUserName(), answerData.getIthAnswer(), answerData.getHtmlName()) > 0) {
            throw new TestException("该题已作答过，本次操作未保存");
        }
        // 插入答题数据
        switch (dataTableEnum) {
            case AIR_CONDITIONER_DATA -> {
                AirControllerDataDO airControllerDataDO = answerDataAssembler.toAirControllerDataDO(answerData);
                answerDataRepository.insertAirControllerData(airControllerDataDO);
            }
            case TICKETS_SALE_DATA -> {
                TicketsSaleDataDO ticketsSaleDataDO = answerDataAssembler.toTicketsSaleDataDO(answerData);
                answerDataRepository.insertTicketsSaleData(ticketsSaleDataDO);
            }
            case CAT_FEED_DATA -> {
                CatFeedDataDO catFeedDataDO = answerDataAssembler.toCatFeedDataDO(answerData);
                answerDataRepository.insertCatFeedData(catFeedDataDO);
            }
            case PROJECTION_CONTROLLER_DATA -> {
                ProjectionControllerDataDO projectionControllerDataDO = answerDataAssembler.toProjectionControllerDataDO(answerData);
                answerDataRepository.insertProjectionControllerData(projectionControllerDataDO);
            }
            case CAMERA_CONTROLLER_DATA -> {
                CameraControllerDataDO cameraControllerDataDO = answerDataAssembler.toCameraControllerDataDO(answerData);
                answerDataRepository.insertCameraControllerData(cameraControllerDataDO);
            }
            case WATER_DISPENSER_DATA -> {
                WaterDispenserDataDO waterDispenserDataDO = answerDataAssembler.toWaterDispenserDataDO(answerData);
                answerDataRepository.insertWaterDispenserData(waterDispenserDataDO);
            }
            case COFFEE_MACHINE_DATA -> {
                CoffeeMachineDataDO coffeeMachineDataDO = answerDataAssembler.toCoffeeMachineDataDO(answerData);
                answerDataRepository.insertCoffeeMachineData(coffeeMachineDataDO);
            }
            case PERFUME_MAKER_DATA -> {
                PerfumeMakerDataDO perfumeMakerDataDO = answerDataAssembler.toPerfumeMakerDataDO(answerData);
                answerDataRepository.insertPerfumeMakerData(perfumeMakerDataDO);
            }
            case FLOWER_GARDEN_DATA -> {
                FlowerGardenDataDO flowerGardenDataDO = answerDataAssembler.toFlowerGardenDataDO(answerData);
                answerDataRepository.insertFlowerGardenData(flowerGardenDataDO);
            }
            case VIDEO_PLAYER_DATA -> {
                VideoPlayerDataDO videoPlayerDataDO = answerDataAssembler.toVideoPlayerDataDO(answerData);
                answerDataRepository.insertVideoPlayerData(videoPlayerDataDO);
            }
            case FLASHLIGHT_DATA -> {
                FlashlightDataDO flashlightDataDO = answerDataAssembler.toFlashlightDataDO(answerData);
                answerDataRepository.insertFlashlightData(flashlightDataDO);
            }
            case RICE_COOKER_DATA -> {
                RiceCookerDataDO riceCookerDataDO = answerDataAssembler.toRiceCookerDataDO(answerData);
                answerDataRepository.insertRiceCookerData(riceCookerDataDO);
            }
            case FRUIT_TEA_DATA -> {
                FruitTeaDataDO fruitTeaDataDO = answerDataAssembler.toFruitTeaDataDO(answerData);
                answerDataRepository.insertFruitTeaData(fruitTeaDataDO);
            }
            case BIG_AIR_DATA -> {
                BigAirControllerDataDO bigAirControllerDataDO = answerDataAssembler.toBigAirControllerDataDO(answerData);
                answerDataRepository.insertBigAirControllerData(bigAirControllerDataDO);
            }
            case SEATS_SCHEDULE_DATA -> {
                SeatsScheduleDataDO seatsScheduleDataDO = answerDataAssembler.toSeatsScheduleDataDO(answerData);
                answerDataRepository.insertSeatsScheduleData(seatsScheduleDataDO);
            }
            case SUNLIGHT_CONTROLLER_DATA -> {
                SunlightControllerDataDO sunlightControllerDataDO = answerDataAssembler.toSunlightControllerDataDO(answerData);
                answerDataRepository.insertSunlightControllerData(sunlightControllerDataDO);
            }
            case SAUNA_CONTROLLER_DATA -> {
                SaunaControllerDataDO saunaControllerDataDO = answerDataAssembler.toSaunaControllerDataDO(answerData);
                answerDataRepository.insertSaunaControllerData(saunaControllerDataDO);
            }
            default -> throw new TestException("题目错误！");
        }
    }

    /**
     * 完成测试
     * @param userAnswer
     */
    @Override
    public void finishTest(UserAnswer userAnswer) {
        UserAnswerDO userAnswerDO = userAnswerAssembler.toDO(userAnswer);
        // 时区调整：UTC -> 系统时间
        // testBegin
        ZonedDateTime utcZoneDateTime = userAnswerDO.getTestBegin().atZone(ZoneId.of("UTC"));
        ZonedDateTime systemZoneDateTime = utcZoneDateTime.withZoneSameInstant(ZoneId.systemDefault());
        userAnswerDO.setTestBegin(systemZoneDateTime.toLocalDateTime());
        // testEnd
        utcZoneDateTime = userAnswerDO.getTestEnd().atZone(ZoneId.of("UTC"));
        systemZoneDateTime = utcZoneDateTime.withZoneSameInstant(ZoneId.systemDefault());
        userAnswerDO.setTestEnd(systemZoneDateTime.toLocalDateTime());

        userAnswerRepository.insertUserAnswer(userAnswerDO);
    }

    /**
     * 根据当前题目的 htmlName 获取下一题（要求当前题已完成作答，防止跳题与重复作答）
     */
    @Override
    public Question getNextQuestion(String userName, Integer ithAnswer, String htmlName) {
        QuestionDOExample htmlExample = new QuestionDOExample();
        htmlExample.createCriteria().andHtmlNameEqualTo(htmlName);
        java.util.List<QuestionDO> currentList = questionDOMapper.selectByExample(htmlExample);
        if (currentList.isEmpty()) {
            throw new TestException("未找到题目：" + htmlName);
        }
        QuestionDO current = currentList.get(0);
        if (current.getNo() == null || current.getNo() < 0) {
            throw new TestException("该题目不在测验流程中");
        }
        DataTableEnum currentEnum = DataTableEnum.getEnumByTableName(current.getDataTable());
        if (currentEnum == DataTableEnum.UNKNOWN_TABLE) {
            throw new TestException("题目错误！");
        }
        // 防跳题：当前题必须已完成作答
        int completed = answerSessionExtMapper.countCompletedEvents(current.getDataTable(), userName, ithAnswer, htmlName);
        if (completed <= 0) {
            throw new TestException("该题尚未完成作答，无法进入下一题");
        }
        // 取题号更大的下一题
        QuestionDOExample nextExample = new QuestionDOExample();
        nextExample.createCriteria().andNoGreaterThan(current.getNo());
        nextExample.setOrderByClause("no asc");
        java.util.List<QuestionDO> nextList = questionDOMapper.selectByExample(nextExample);
        QuestionDO next = nextList.isEmpty() ? null : nextList.get(0);
        if (next == null) {
            next = new QuestionDO();
            next.setHtmlName("finished");
        }
        return questionAssembler.DOToQuestion(next);
    }

}
