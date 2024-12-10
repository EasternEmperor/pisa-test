package com.research.pisatest.mapper;

import com.research.pisatest.pojo.CatFeedDataDO;
import com.research.pisatest.pojo.CatFeedDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatFeedDataDOMapper {
    long countByExample(CatFeedDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CatFeedDataDO record);

    int insertSelective(CatFeedDataDO record);

    List<CatFeedDataDO> selectByExample(CatFeedDataDOExample example);

    CatFeedDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CatFeedDataDO record, @Param("example") CatFeedDataDOExample example);

    int updateByExample(@Param("record") CatFeedDataDO record, @Param("example") CatFeedDataDOExample example);

    int updateByPrimaryKeySelective(CatFeedDataDO record);

    int updateByPrimaryKey(CatFeedDataDO record);
}