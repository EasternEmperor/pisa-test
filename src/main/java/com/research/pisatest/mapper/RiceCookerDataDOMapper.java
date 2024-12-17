package com.research.pisatest.mapper;

import com.research.pisatest.pojo.RiceCookerDataDO;
import com.research.pisatest.pojo.RiceCookerDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiceCookerDataDOMapper {
    long countByExample(RiceCookerDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RiceCookerDataDO record);

    int insertSelective(RiceCookerDataDO record);

    List<RiceCookerDataDO> selectByExample(RiceCookerDataDOExample example);

    RiceCookerDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RiceCookerDataDO record, @Param("example") RiceCookerDataDOExample example);

    int updateByExample(@Param("record") RiceCookerDataDO record, @Param("example") RiceCookerDataDOExample example);

    int updateByPrimaryKeySelective(RiceCookerDataDO record);

    int updateByPrimaryKey(RiceCookerDataDO record);
}