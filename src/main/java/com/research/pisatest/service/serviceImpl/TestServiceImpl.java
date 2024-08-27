package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IAnswerDataAssembler;
import com.research.pisatest.assembler.IQuestionAssembler;
import com.research.pisatest.assembler.IUserAnswerAssembler;
import com.research.pisatest.common.DataTableEnum;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.entity.Question;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.exception.TestException;
import com.research.pisatest.mapper.QuestionDOMapper;
import com.research.pisatest.pojo.*;
import com.research.pisatest.repository.IAnswerDataRepository;
import com.research.pisatest.repository.IQuestionRepository;
import com.research.pisatest.repository.IUserAnswerRepository;
import com.research.pisatest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private IUserAnswerAssembler userAnswerAssembler;

    /**
     * 根据题目编号获取题目
     * @param no
     * @return
     */
    @Override
    public Question getQuestion(Integer no) {
        QuestionDO questionDO = questionRepository.getQuestionByNo(no);
        return questionAssembler.DOToQuestion(questionDO);
    }

    /**
     * 提交答案
     * @param answerData
     */
    @Override
    public void submitAnswer(AnswerData answerData) {
        // 获取该题目答题数据表名
        QuestionDOExample example = new QuestionDOExample();
        example.createCriteria().andHtmlNameEqualTo(answerData.getHtmlName());
        String tableName = questionDOMapper.selectByExample(example).get(0).getDataTable();
        DataTableEnum dataTableEnum = DataTableEnum.getEnumByTableName(tableName);
        // 插入答题数据
        switch (dataTableEnum) {
            case AIR_CONDITIONER_DATA -> {
                AirControllerDataDO airControllerDataDO = answerDataAssembler.toAirControllerDataDO(answerData);
                answerDataRepository.insertAirControllerData(airControllerDataDO);
            }
            case TICKETS_SALE_DATA -> {
                TicketsSaleDataDO ticketSaleDataDO = answerDataAssembler.toTicketsSaleDataDO(answerData);
                answerDataRepository.insertTicketsSaleData(ticketSaleDataDO);
            }
            default -> throw new TestException("题目错误！");
        }
    }

    @Override
    public void finishTest(UserAnswer userAnswer) {
        UserAnswerDO userAnswerDO = userAnswerAssembler.toDO(userAnswer);
        userAnswerRepository.insertUserAnswer(userAnswerDO);
    }
}