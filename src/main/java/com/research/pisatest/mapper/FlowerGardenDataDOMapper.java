package com.research.pisatest.mapper;

import com.research.pisatest.pojo.FlowerGardenDataDO;
import com.research.pisatest.pojo.FlowerGardenDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowerGardenDataDOMapper {
    long countByExample(FlowerGardenDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlowerGardenDataDO record);

    int insertSelective(FlowerGardenDataDO record);

    List<FlowerGardenDataDO> selectByExample(FlowerGardenDataDOExample example);

    FlowerGardenDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlowerGardenDataDO record, @Param("example") FlowerGardenDataDOExample example);

    int updateByExample(@Param("record") FlowerGardenDataDO record, @Param("example") FlowerGardenDataDOExample example);

    int updateByPrimaryKeySelective(FlowerGardenDataDO record);

    int updateByPrimaryKey(FlowerGardenDataDO record);
}