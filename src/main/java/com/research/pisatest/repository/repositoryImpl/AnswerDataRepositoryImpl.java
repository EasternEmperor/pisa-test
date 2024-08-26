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
import org.springframework.transaction.annotation.Transactional;

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
    public List<AirControllerDataDO> getAirControllerData(String htmlName, String userName) {
        AirControllerDataDOExample example = new AirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return airControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<AirControllerDataDO> getAirControllerData(String htmlName, Integer ith) {
        AirControllerDataDOExample example = new AirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return airControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<AirControllerDataDO> getAirControllerData(String htmlName, String userName, Integer ith) {
        AirControllerDataDOExample example = new AirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return airControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName) {
        TicketsSaleDataDOExample example = new TicketsSaleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return ticketsSaleDataDOMapper.selectByExample(example);
    }

    @Override
    public List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, Integer ith) {
        TicketsSaleDataDOExample example = new TicketsSaleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return ticketsSaleDataDOMapper.selectByExample(example);
    }

    @Override
    public List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName, Integer ith) {
        TicketsSaleDataDOExample example = new TicketsSaleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return ticketsSaleDataDOMapper.selectByExample(example);
    }

    @Override
    public List<TicketsSaleDataDO> getTicketsSaleData(String htmlName) {
        TicketsSaleDataDOExample example = new TicketsSaleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return ticketsSaleDataDOMapper.selectByExample(example);
    }

    @Transactional
    @Override
    public void insertAirControllerData(AirControllerDataDO airControllerDataDO) {
        airControllerDataDOMapper.insert(airControllerDataDO);
    }

    @Transactional
    @Override
    public void insertTicketsSaleData(TicketsSaleDataDO ticketsSaleDataDO) {
        ticketsSaleDataDOMapper.insert(ticketsSaleDataDO);
    }
}
