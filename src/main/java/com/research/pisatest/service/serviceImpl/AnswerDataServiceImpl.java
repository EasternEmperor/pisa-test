package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IAnswerDataAssembler;
import com.research.pisatest.common.DataTableEnum;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.exception.QuestionException;
import com.research.pisatest.mapper.QuestionDOMapper;
import com.research.pisatest.pojo.AirControllerDataDO;
import com.research.pisatest.pojo.QuestionDOExample;
import com.research.pisatest.pojo.TicketsSaleDataDO;
import com.research.pisatest.repository.IAnswerDataRepository;
import com.research.pisatest.service.AnswerDataService;
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
    public List<AnswerData> getAnswerData(String htmlName) {
        // 获取该题目答题数据表名
        QuestionDOExample example = new QuestionDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        String tableName = questionDOMapper.selectByExample(example).get(0).getDataTable();
        // 查询该题目答题数据
        DataTableEnum dataTableEnum = DataTableEnum.getEnumByTableName(tableName);
        List<AnswerData> answerDataList = switch (dataTableEnum) {
            case AIR_CONDITIONER_DATA -> {
                List<AirControllerDataDO> airControllerDataDOList = answerDataRepository.getAirControllerData(htmlName);
                yield answerDataAssembler.airConditionerDataDOListToEntityList(airControllerDataDOList);
            }
            case TICKETS_SALE_DATA -> {
                List<TicketsSaleDataDO> ticketsSaleDataDOList = answerDataRepository.getTicketsSaleData(htmlName);
                yield answerDataAssembler.ticketsSaleDataDOListToEntityList(ticketsSaleDataDOList);
            }
            default -> throw new QuestionException("没有符合的题目：" + htmlName);
        };
        return answerDataList;
    }
}
