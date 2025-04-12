package com.research.pisatest.mapper;

import com.research.pisatest.pojo.SeatsScheduleDataDO;
import com.research.pisatest.pojo.SeatsScheduleDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeatsScheduleDataDOMapper {
    long countByExample(SeatsScheduleDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SeatsScheduleDataDO record);

    int insertSelective(SeatsScheduleDataDO record);

    List<SeatsScheduleDataDO> selectByExample(SeatsScheduleDataDOExample example);

    SeatsScheduleDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SeatsScheduleDataDO record, @Param("example") SeatsScheduleDataDOExample example);

    int updateByExample(@Param("record") SeatsScheduleDataDO record, @Param("example") SeatsScheduleDataDOExample example);

    int updateByPrimaryKeySelective(SeatsScheduleDataDO record);

    int updateByPrimaryKey(SeatsScheduleDataDO record);
}