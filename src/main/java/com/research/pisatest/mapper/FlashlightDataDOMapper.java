package com.research.pisatest.mapper;

import com.research.pisatest.pojo.FlashlightDataDO;
import com.research.pisatest.pojo.FlashlightDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlashlightDataDOMapper {
    long countByExample(FlashlightDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlashlightDataDO record);

    int insertSelective(FlashlightDataDO record);

    List<FlashlightDataDO> selectByExample(FlashlightDataDOExample example);

    FlashlightDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlashlightDataDO record, @Param("example") FlashlightDataDOExample example);

    int updateByExample(@Param("record") FlashlightDataDO record, @Param("example") FlashlightDataDOExample example);

    int updateByPrimaryKeySelective(FlashlightDataDO record);

    int updateByPrimaryKey(FlashlightDataDO record);
}