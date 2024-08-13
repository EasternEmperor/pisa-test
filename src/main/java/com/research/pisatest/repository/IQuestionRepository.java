package com.research.pisatest.repository;

import com.research.pisatest.pojo.QuestionDO;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/12 13:01
 * @description
 */
public interface IQuestionRepository {
    public List<QuestionDO> getAllQuestions();

    public Boolean deleteQuestion(QuestionDO questionDO);

    public void modifyQuestionNo(List<QuestionDO> questionDOList);

    public List<QuestionDO> getAllQuestionName();
}
