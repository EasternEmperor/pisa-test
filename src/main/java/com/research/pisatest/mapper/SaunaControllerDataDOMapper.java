package com.research.pisatest.mapper;

import com.research.pisatest.pojo.SaunaControllerDataDO;
import com.research.pisatest.pojo.SaunaControllerDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaunaControllerDataDOMapper {
    long countByExample(SaunaControllerDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SaunaControllerDataDO record);

    int insertSelective(SaunaControllerDataDO record);

    List<SaunaControllerDataDO> selectByExample(SaunaControllerDataDOExample example);

    SaunaControllerDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SaunaControllerDataDO record, @Param("example") SaunaControllerDataDOExample example);

    int updateByExample(@Param("record") SaunaControllerDataDO record, @Param("example") SaunaControllerDataDOExample example);

    int updateByPrimaryKeySelective(SaunaControllerDataDO record);

    int updateByPrimaryKey(SaunaControllerDataDO record);
}