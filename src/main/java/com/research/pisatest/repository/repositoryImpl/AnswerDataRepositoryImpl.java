package com.research.pisatest.repository.repositoryImpl;

import com.research.pisatest.mapper.*;
import com.research.pisatest.pojo.*;
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
    // 空调
    @Autowired
    private AirControllerDataDOMapper airControllerDataDOMapper;
    @Autowired
    private AirControllerDataDOExtMapper airControllerDataDOExtMapper;

    // 购票
    @Autowired
    private TicketsSaleDataDOMapper ticketsSaleDataDOMapper;
    @Autowired
    private TicketsSaleDataDOExtMapper ticketsSaleDataDOExtMapper;

    // 猫粮
    @Autowired
    private CatFeedDataDOMapper catFeedDataDOMapper;
    @Autowired
    private CatFeedDataDOExtMapper catFeedDataDOExtMapper;


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
    public void batchInsertAirControllerData(List<AirControllerDataDO> airControllerDataDOs) {
        airControllerDataDOExtMapper.batchInsert(airControllerDataDOs);
    }

    @Override
    public void insertAirControllerData(AirControllerDataDO airControllerDataDO) {
        airControllerDataDOMapper.insert(airControllerDataDO);
    }

    @Override
    public void insertTicketsSaleData(TicketsSaleDataDO ticketsSaleDataDO) {
        ticketsSaleDataDOMapper.insert(ticketsSaleDataDO);
    }

    @Transactional
    @Override
    public void batchInsertTicketsSaleData(List<TicketsSaleDataDO> ticketsSaleDataDOs) {
        ticketsSaleDataDOExtMapper.batchInsert(ticketsSaleDataDOs);
    }

    @Override
    public List<CatFeedDataDO> getCatFeedData(String htmlName) {
        CatFeedDataDOExample example = new CatFeedDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return catFeedDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CatFeedDataDO> getCatFeedData(String htmlName, String userName) {
        CatFeedDataDOExample example = new CatFeedDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return catFeedDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CatFeedDataDO> getCatFeedData(String htmlName, Integer ith) {
        CatFeedDataDOExample example = new CatFeedDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return catFeedDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CatFeedDataDO> getCatFeedData(String htmlName, String userName, Integer ith) {
        CatFeedDataDOExample example = new CatFeedDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return catFeedDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertCatFeedData(List<CatFeedDataDO> catFeedDataDOs) {
        catFeedDataDOExtMapper.batchInsert(catFeedDataDOs);
    }

    @Override
    public void insertCatFeedData(CatFeedDataDO catFeedDataDO) {
        catFeedDataDOMapper.insert(catFeedDataDO);
    }
}
