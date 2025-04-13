package com.research.pisatest.mapper;

import com.research.pisatest.pojo.SunlightControllerDataDO;
import com.research.pisatest.pojo.SunlightControllerDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SunlightControllerDataDOMapper {
    long countByExample(SunlightControllerDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SunlightControllerDataDO record);

    int insertSelective(SunlightControllerDataDO record);

    List<SunlightControllerDataDO> selectByExample(SunlightControllerDataDOExample example);

    SunlightControllerDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SunlightControllerDataDO record, @Param("example") SunlightControllerDataDOExample example);

    int updateByExample(@Param("record") SunlightControllerDataDO record, @Param("example") SunlightControllerDataDOExample example);

    int updateByPrimaryKeySelective(SunlightControllerDataDO record);

    int updateByPrimaryKey(SunlightControllerDataDO record);
}