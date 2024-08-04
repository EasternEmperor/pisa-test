package com.research.pisatest.mapper;

import com.research.pisatest.pojo.AirControllerDataDO;
import com.research.pisatest.pojo.AirControllerDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirControllerDataDOMapper {
    long countByExample(AirControllerDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AirControllerDataDO record);

    int insertSelective(AirControllerDataDO record);

    List<AirControllerDataDO> selectByExample(AirControllerDataDOExample example);

    AirControllerDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AirControllerDataDO record, @Param("example") AirControllerDataDOExample example);

    int updateByExample(@Param("record") AirControllerDataDO record, @Param("example") AirControllerDataDOExample example);

    int updateByPrimaryKeySelective(AirControllerDataDO record);

    int updateByPrimaryKey(AirControllerDataDO record);
}