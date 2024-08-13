package com.research.pisatest.mapper;

/**
 * @author zhongqilong
 * @date 2024/8/12 19:59
 * @description
 */
public interface QuestionDOExtMapper {
    int deleteQuestionFromTest(Long questionId);

    int updateQuestionNo(Integer questionNo);
}
