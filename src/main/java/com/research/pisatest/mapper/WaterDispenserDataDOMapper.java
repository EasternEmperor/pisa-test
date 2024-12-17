package com.research.pisatest.mapper;

import com.research.pisatest.pojo.WaterDispenserDataDO;
import com.research.pisatest.pojo.WaterDispenserDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterDispenserDataDOMapper {
    long countByExample(WaterDispenserDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WaterDispenserDataDO record);

    int insertSelective(WaterDispenserDataDO record);

    List<WaterDispenserDataDO> selectByExample(WaterDispenserDataDOExample example);

    WaterDispenserDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WaterDispenserDataDO record, @Param("example") WaterDispenserDataDOExample example);

    int updateByExample(@Param("record") WaterDispenserDataDO record, @Param("example") WaterDispenserDataDOExample example);

    int updateByPrimaryKeySelective(WaterDispenserDataDO record);

    int updateByPrimaryKey(WaterDispenserDataDO record);
}