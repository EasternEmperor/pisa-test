package com.research.pisatest.mapper;

import com.research.pisatest.pojo.VideoPlayerDataDO;
import com.research.pisatest.pojo.VideoPlayerDataDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoPlayerDataDOMapper {
    long countByExample(VideoPlayerDataDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VideoPlayerDataDO record);

    int insertSelective(VideoPlayerDataDO record);

    List<VideoPlayerDataDO> selectByExample(VideoPlayerDataDOExample example);

    VideoPlayerDataDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VideoPlayerDataDO record, @Param("example") VideoPlayerDataDOExample example);

    int updateByExample(@Param("record") VideoPlayerDataDO record, @Param("example") VideoPlayerDataDOExample example);

    int updateByPrimaryKeySelective(VideoPlayerDataDO record);

    int updateByPrimaryKey(VideoPlayerDataDO record);
}