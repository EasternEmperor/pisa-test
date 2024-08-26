package com.research.pisatest.repository;

import com.research.pisatest.pojo.QuestionDO;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/12 13:01
 * @description
 */
public interface IQuestionRepository {
    List<QuestionDO> getAllQuestions();

    Boolean deleteQuestion(QuestionDO questionDO);

    void modifyQuestionNo(List<QuestionDO> questionDOList);

    List<QuestionDO> getAllQuestionName();

    QuestionDO getQuestionByNo(Integer questionNo);
}
