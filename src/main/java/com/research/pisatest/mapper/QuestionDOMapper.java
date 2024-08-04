package com.research.pisatest.mapper;

import com.research.pisatest.pojo.QuestionDO;
import com.research.pisatest.pojo.QuestionDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionDOMapper {
    long countByExample(QuestionDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QuestionDO record);

    int insertSelective(QuestionDO record);

    List<QuestionDO> selectByExample(QuestionDOExample example);

    QuestionDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuestionDO record, @Param("example") QuestionDOExample example);

    int updateByExample(@Param("record") QuestionDO record, @Param("example") QuestionDOExample example);

    int updateByPrimaryKeySelective(QuestionDO record);

    int updateByPrimaryKey(QuestionDO record);
}