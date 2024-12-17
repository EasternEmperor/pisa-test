package com.research.pisatest.mapper;

import com.research.pisatest.pojo.BigAirControllerDataDO;
import com.research.pisatest.pojo.BigAirControllerDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BigAirControllerDataDOMapper {
    long countByExample(BigAirControllerDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BigAirControllerDataDO record);

    int insertSelective(BigAirControllerDataDO record);

    List<BigAirControllerDataDO> selectByExample(BigAirControllerDataDOExample example);

    BigAirControllerDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BigAirControllerDataDO record, @Param("example") BigAirControllerDataDOExample example);

    int updateByExample(@Param("record") BigAirControllerDataDO record, @Param("example") BigAirControllerDataDOExample example);

    int updateByPrimaryKeySelective(BigAirControllerDataDO record);

    int updateByPrimaryKey(BigAirControllerDataDO record);
}