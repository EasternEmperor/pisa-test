package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IAnswerDataAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.common.DataTableEnum;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.exception.AnswerDataException;
import com.research.pisatest.exception.PisaTestException;
import com.research.pisatest.exception.QuestionException;
import com.research.pisatest.mapper.QuestionDOMapper;
import com.research.pisatest.pojo.AirControllerDataDO;
import com.research.pisatest.pojo.QuestionDO;
import com.research.pisatest.pojo.QuestionDOExample;
import com.research.pisatest.pojo.TicketsSaleDataDO;
import com.research.pisatest.repository.IAnswerDataRepository;
import com.research.pisatest.service.AnswerDataService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerDataServiceImpl implements AnswerDataService {

    @Autowired
    private QuestionDOMapper questionDOMapper;

    @Autowired
    private IAnswerDataRepository answerDataRepository;

    @Autowired
    private IAnswerDataAssembler answerDataAssembler;

    /**
     * 获取所有用户对于题目htmlName的答题数据
     * @param htmlName
     * @return
     */
    @Override
    public List<AnswerData> getAnswerData(String htmlName, String userName, Integer ithAnswer) {
        if (StringUtils.isBlank(userName) || ithAnswer == null) {
            throw new AnswerDataException("获取题目数据失败：userName 或 ithAnswer 为空");
        }
        // 获取该题目答题数据表名
        QuestionDOExample example = new QuestionDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        List<QuestionDO> questionDOList = questionDOMapper.selectByExample(example);
        if (questionDOList.isEmpty()) {
            throw new QuestionException("没有找到题目：" + htmlName);
        }
        String tableName = questionDOList.get(0).getDataTable();
        // 查询该题目答题数据
        DataTableEnum dataTableEnum = DataTableEnum.getEnumByTableName(tableName);
        List<AnswerData> answerDataList = switch (dataTableEnum) {
            case AIR_CONDITIONER_DATA -> {
                List<AirControllerDataDO> airControllerDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        airControllerDataDOList = answerDataRepository.getAirControllerData(htmlName);
                    } else {
                        airControllerDataDOList = answerDataRepository.getAirControllerData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        airControllerDataDOList = answerDataRepository.getAirControllerData(htmlName, userName);
                    } else {
                        airControllerDataDOList = answerDataRepository.getAirControllerData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.airConditionerDataDOListToEntityList(airControllerDataDOList);
            }
            case TICKETS_SALE_DATA -> {
                List<TicketsSaleDataDO> ticketsSaleDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        ticketsSaleDataDOList = answerDataRepository.getTicketsSaleData(htmlName);
                    } else {
                        ticketsSaleDataDOList = answerDataRepository.getTicketsSaleData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        ticketsSaleDataDOList = answerDataRepository.getTicketsSaleData(htmlName, userName);
                    } else {
                        ticketsSaleDataDOList = answerDataRepository.getTicketsSaleData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.ticketsSaleDataDOListToEntityList(ticketsSaleDataDOList);
            }
            default -> throw new AnswerDataException("没有符合的题目：" + htmlName);
        };
        // 设置每个AnswerData对象的表名属性为dataTableEnum的索引值
        for (AnswerData answerData : answerDataList) {
            answerData.setTableName(dataTableEnum.getIndex());
        }
        return answerDataList;
    }
}
