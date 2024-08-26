package com.research.pisatest.repository;

import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.pojo.UserAnswerDO;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/26 17:32
 * @description
 */
public interface IUserAnswerRepository {
    List<UserAnswerDO> selectAllAnswerNo();

    List<UserAnswer> selectAllUserAnswer();

    List<UserAnswer> selectUserAnswerByUserName(String userName);

    List<UserAnswer> selectUserAnswerByIth(Integer ith);

    List<UserAnswer> selectUserAnswerByUserNameAndIth(String userName, Integer ith);

    void insertUserAnswer(UserAnswerDO userAnswerDO);
}
