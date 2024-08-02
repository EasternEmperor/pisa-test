package com.research.pisatest.mapper;

import com.research.pisatest.pojo.UserDO;
import org.apache.ibatis.annotations.Param;

public interface UserDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Long id);

    UserDO selectByUserName(@Param("userName") String userName);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}