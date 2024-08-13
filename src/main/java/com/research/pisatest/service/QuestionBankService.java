package com.research.pisatest.service;

import com.research.pisatest.entity.Question;
import com.research.pisatest.pojo.QuestionDO;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/12 00:13
 * @description
 */
public interface QuestionBankService {

    List<Question> getAllQuestions();

    Boolean deleteQuestion(Question question);

    void modifyQuestionNo(List<Question> questionList);
}
