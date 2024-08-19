package com.research.pisatest.repository.repositoryImpl;

import com.research.pisatest.mapper.AirControllerDataDOMapper;
import com.research.pisatest.mapper.QuestionDOMapper;
import com.research.pisatest.mapper.TicketsSaleDataDOMapper;
import com.research.pisatest.pojo.AirControllerDataDO;
import com.research.pisatest.pojo.AirControllerDataDOExample;
import com.research.pisatest.pojo.TicketsSaleDataDO;
import com.research.pisatest.pojo.TicketsSaleDataDOExample;
import com.research.pisatest.repository.IAnswerDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/19 23:23
 * @description
 */
@Repository
public class AnswerDataRepositoryImpl implements IAnswerDataRepository {

    @Autowired
    private AirControllerDataDOMapper airControllerDataDOMapper;

    @Autowired
    private TicketsSaleDataDOMapper ticketsSaleDataDOMapper;


    @Override
    public List<AirControllerDataDO> getAirControllerData(String htmlName) {
        AirControllerDataDOExample example = new AirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return airControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<TicketsSaleDataDO> getTicketsSaleData(String htmlName) {
        TicketsSaleDataDOExample example = new TicketsSaleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return ticketsSaleDataDOMapper.selectByExample(example);
    }
}
