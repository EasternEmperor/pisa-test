package com.research.pisatest.mapper;

import com.research.pisatest.pojo.TicketsSaleDataDO;
import com.research.pisatest.pojo.TicketsSaleDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketsSaleDataDOMapper {
    long countByExample(TicketsSaleDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TicketsSaleDataDO record);

    int insertSelective(TicketsSaleDataDO record);

    List<TicketsSaleDataDO> selectByExample(TicketsSaleDataDOExample example);

    TicketsSaleDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TicketsSaleDataDO record, @Param("example") TicketsSaleDataDOExample example);

    int updateByExample(@Param("record") TicketsSaleDataDO record, @Param("example") TicketsSaleDataDOExample example);

    int updateByPrimaryKeySelective(TicketsSaleDataDO record);

    int updateByPrimaryKey(TicketsSaleDataDO record);
}