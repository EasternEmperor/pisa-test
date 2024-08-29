package com.research.pisatest.mapper;

import com.research.pisatest.pojo.AirControllerDataDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/29 20:08
 * @description
 */
public interface AirControllerDataDOExtMapper {
    int batchInsert(@Param("airControllerDataDOList") List<AirControllerDataDO> airControllerDataDOList);
}
