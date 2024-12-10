package com.research.pisatest.mapper;

import com.research.pisatest.pojo.TicketsSaleDataDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/29 21:07
 * @description
 */
public interface TicketsSaleDataDOExtMapper {
    int batchInsert(@Param("ticketsSaleDataDOList") List<TicketsSaleDataDO> ticketsSaleDataDOList);
}
