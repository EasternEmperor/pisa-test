package com.research.pisatest.mapper;

import com.research.pisatest.pojo.ProjectionControllerDataDO;
import com.research.pisatest.pojo.ProjectionControllerDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectionControllerDataDOMapper {
    long countByExample(ProjectionControllerDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectionControllerDataDO record);

    int insertSelective(ProjectionControllerDataDO record);

    List<ProjectionControllerDataDO> selectByExample(ProjectionControllerDataDOExample example);

    ProjectionControllerDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectionControllerDataDO record, @Param("example") ProjectionControllerDataDOExample example);

    int updateByExample(@Param("record") ProjectionControllerDataDO record, @Param("example") ProjectionControllerDataDOExample example);

    int updateByPrimaryKeySelective(ProjectionControllerDataDO record);

    int updateByPrimaryKey(ProjectionControllerDataDO record);
}