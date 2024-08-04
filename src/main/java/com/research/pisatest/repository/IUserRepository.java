package com.research.pisatest.repository;

import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.entity.User;
import com.research.pisatest.entity.UserAnswer;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/3 10:51
 * @description
 */
public interface IUserRepository {

    User selectByUserName(String userName);

    void insert(User user);

    List<UserAnswer> selectAllUserAnswer();

    DescInfo getSystemDescInfo();

}
