package com.research.pisatest.service;

import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.entity.Question;
import com.research.pisatest.entity.UserAnswer;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/22 21:37
 * @description
 */
public interface TestService {

    Question getQuestion(Integer no);

    void submitAnswer(List<AnswerData> answerDatas);

    void exploreData(AnswerData answerData);

    void finishTest(UserAnswer userAnswer);
}
