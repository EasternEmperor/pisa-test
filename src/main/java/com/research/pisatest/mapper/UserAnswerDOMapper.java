package com.research.pisatest.mapper;

import com.research.pisatest.pojo.UserAnswerDO;
import com.research.pisatest.pojo.UserAnswerDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAnswerDOMapper {
    long countByExample(UserAnswerDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAnswerDO record);

    int insertSelective(UserAnswerDO record);

    List<UserAnswerDO> selectByExample(UserAnswerDOExample example);

    UserAnswerDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAnswerDO record, @Param("example") UserAnswerDOExample example);

    int updateByExample(@Param("record") UserAnswerDO record, @Param("example") UserAnswerDOExample example);

    int updateByPrimaryKeySelective(UserAnswerDO record);

    int updateByPrimaryKey(UserAnswerDO record);
}