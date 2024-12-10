package com.research.pisatest.mapper;

import com.research.pisatest.pojo.CatFeedDataDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/12/8 21:23
 * @description
 */
public interface CatFeedDataDOExtMapper {
    int batchInsert(@Param("catFeedDataDOList") List<CatFeedDataDO> airControllerDataDOList);
}
