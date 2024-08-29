package com.research.pisatest.repository;

import com.research.pisatest.pojo.AirControllerDataDO;
import com.research.pisatest.pojo.TicketsSaleDataDO;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/19 23:23
 * @description
 */
public interface IAnswerDataRepository {

    List<AirControllerDataDO> getAirControllerData(String htmlName);

    List<AirControllerDataDO> getAirControllerData(String htmlName, String userName);

    List<AirControllerDataDO> getAirControllerData(String htmlName, Integer ith);

    List<AirControllerDataDO> getAirControllerData(String htmlName, String userName, Integer ith);

    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName);

    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName);

     List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, Integer ith);

    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName, Integer ith);

    void insertAirControllerData(List<AirControllerDataDO> airControllerDataDOs);

    void insertTicketsSaleData(List<TicketsSaleDataDO> ticketsSaleDataDOs);
}
