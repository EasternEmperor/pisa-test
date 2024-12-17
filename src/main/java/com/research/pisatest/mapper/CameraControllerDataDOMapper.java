package com.research.pisatest.mapper;

import com.research.pisatest.pojo.CameraControllerDataDO;
import com.research.pisatest.pojo.CameraControllerDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CameraControllerDataDOMapper {
    long countByExample(CameraControllerDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CameraControllerDataDO record);

    int insertSelective(CameraControllerDataDO record);

    List<CameraControllerDataDO> selectByExample(CameraControllerDataDOExample example);

    CameraControllerDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CameraControllerDataDO record, @Param("example") CameraControllerDataDOExample example);

    int updateByExample(@Param("record") CameraControllerDataDO record, @Param("example") CameraControllerDataDOExample example);

    int updateByPrimaryKeySelective(CameraControllerDataDO record);

    int updateByPrimaryKey(CameraControllerDataDO record);
}