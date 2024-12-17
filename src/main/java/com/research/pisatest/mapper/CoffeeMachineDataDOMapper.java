package com.research.pisatest.mapper;

import com.research.pisatest.pojo.CoffeeMachineDataDO;
import com.research.pisatest.pojo.CoffeeMachineDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoffeeMachineDataDOMapper {
    long countByExample(CoffeeMachineDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CoffeeMachineDataDO record);

    int insertSelective(CoffeeMachineDataDO record);

    List<CoffeeMachineDataDO> selectByExample(CoffeeMachineDataDOExample example);

    CoffeeMachineDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CoffeeMachineDataDO record, @Param("example") CoffeeMachineDataDOExample example);

    int updateByExample(@Param("record") CoffeeMachineDataDO record, @Param("example") CoffeeMachineDataDOExample example);

    int updateByPrimaryKeySelective(CoffeeMachineDataDO record);

    int updateByPrimaryKey(CoffeeMachineDataDO record);
}