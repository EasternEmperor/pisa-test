package com.research.pisatest.mapper;

import com.research.pisatest.pojo.PerfumeMakerDataDO;
import com.research.pisatest.pojo.PerfumeMakerDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerfumeMakerDataDOMapper {
    long countByExample(PerfumeMakerDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerfumeMakerDataDO record);

    int insertSelective(PerfumeMakerDataDO record);

    List<PerfumeMakerDataDO> selectByExample(PerfumeMakerDataDOExample example);

    PerfumeMakerDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerfumeMakerDataDO record, @Param("example") PerfumeMakerDataDOExample example);

    int updateByExample(@Param("record") PerfumeMakerDataDO record, @Param("example") PerfumeMakerDataDOExample example);

    int updateByPrimaryKeySelective(PerfumeMakerDataDO record);

    int updateByPrimaryKey(PerfumeMakerDataDO record);
}