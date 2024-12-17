package com.research.pisatest.mapper;

import com.research.pisatest.pojo.FruitTeaDataDO;
import com.research.pisatest.pojo.FruitTeaDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FruitTeaDataDOMapper {
    long countByExample(FruitTeaDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FruitTeaDataDO record);

    int insertSelective(FruitTeaDataDO record);

    List<FruitTeaDataDO> selectByExample(FruitTeaDataDOExample example);

    FruitTeaDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FruitTeaDataDO record, @Param("example") FruitTeaDataDOExample example);

    int updateByExample(@Param("record") FruitTeaDataDO record, @Param("example") FruitTeaDataDOExample example);

    int updateByPrimaryKeySelective(FruitTeaDataDO record);

    int updateByPrimaryKey(FruitTeaDataDO record);
}