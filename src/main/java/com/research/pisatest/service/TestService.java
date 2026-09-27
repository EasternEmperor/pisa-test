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

    /**
     * 根据当前题目的 htmlName 获取下一题（要求当前题已完成作答，防止跳题与重复作答）
     * @param userName 用户名
     * @param ithAnswer 第几次答题
     * @param htmlName 当前题目前端页面名
     * @return 下一题；若无下一题则返回 htmlName=finished
     */
    Question getNextQuestion(String userName, Integer ithAnswer, String htmlName);

    /**
     * 获取本次答题的续答位置：最远已作答题若已完成则返回其下一题，未完成则返回该题继续作答
     * @param userName 用户名
     * @param ithAnswer 第几次答题
     * @return 续答题目；全部完成则返回 htmlName=finished
     */
    Question getResumeQuestion(String userName, Integer ithAnswer);

    /**
     * 计算下一轮答题的轮次号：基于实际作答数据（含中断轮次）的最大轮次 + 1
     * @param userName 用户名
     * @return 新轮次号（从未作答过则返回 1）
     */
    Integer getNextIthAnswer(String userName);

    void finishTest(UserAnswer userAnswer);
}
