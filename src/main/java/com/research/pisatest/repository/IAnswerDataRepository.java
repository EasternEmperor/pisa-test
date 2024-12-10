package com.research.pisatest.repository;

import com.research.pisatest.pojo.AirControllerDataDO;
import com.research.pisatest.pojo.CatFeedDataDO;
import com.research.pisatest.pojo.TicketsSaleDataDO;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/19 23:23
 * @description
 */
public interface IAnswerDataRepository {
    // AirControllerData
    List<AirControllerDataDO> getAirControllerData(String htmlName);
    List<AirControllerDataDO> getAirControllerData(String htmlName, String userName);
    List<AirControllerDataDO> getAirControllerData(String htmlName, Integer ith);
    List<AirControllerDataDO> getAirControllerData(String htmlName, String userName, Integer ith);
    void batchInsertAirControllerData(List<AirControllerDataDO> airControllerDataDOs);
    void insertAirControllerData(AirControllerDataDO airControllerDataDO);

    // TicketsSaleData
    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName);
    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName);
     List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, Integer ith);
    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName, Integer ith);
    void batchInsertTicketsSaleData(List<TicketsSaleDataDO> ticketsSaleDataDOs);
    void insertTicketsSaleData(TicketsSaleDataDO ticketsSaleDataDO);

    // CatFeedData
    List<CatFeedDataDO> getCatFeedData(String htmlName);
    List<CatFeedDataDO> getCatFeedData(String htmlName, String userName);
    List<CatFeedDataDO> getCatFeedData(String htmlName, Integer ith);
    List<CatFeedDataDO> getCatFeedData(String htmlName, String userName, Integer ith);
    void batchInsertCatFeedData(List<CatFeedDataDO> catFeedDataDOs);
    void insertCatFeedData(CatFeedDataDO catFeedDataDO);
}
