package com.research.pisatest.repository;

import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.entity.User;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.pojo.QuestionDO;
import com.research.pisatest.pojo.UserAnswerDO;
import com.research.pisatest.pojo.UserDO;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/3 10:51
 * @description
 */
public interface IUserRepository {

    User selectByUserName(String userName);

    void insert(User user);

    List<UserDO> selectAllUserName();

    List<UserAnswerDO> selectAllAnswerNo();

    List<UserAnswer> selectAllUserAnswer();

    List<UserAnswer> selectUserAnswerByUserName(String userName);

    List<UserAnswer> selectUserAnswerByIth(Integer ith);

    List<UserAnswer> selectUserAnswerByUserNameAndIth(String userName, Integer ith);

    DescInfo getSystemDescInfo();

}
