package com.research.pisatest.mapper;

import com.research.pisatest.pojo.AirControllerData;
import com.research.pisatest.pojo.AirControllerDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirControllerDataMapper {
    long countByExample(AirControllerDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AirControllerData record);

    int insertSelective(AirControllerData record);

    List<AirControllerData> selectByExample(AirControllerDataExample example);

    AirControllerData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AirControllerData record, @Param("example") AirControllerDataExample example);

    int updateByExample(@Param("record") AirControllerData record, @Param("example") AirControllerDataExample example);

    int updateByPrimaryKeySelective(AirControllerData record);

    int updateByPrimaryKey(AirControllerData record);
}