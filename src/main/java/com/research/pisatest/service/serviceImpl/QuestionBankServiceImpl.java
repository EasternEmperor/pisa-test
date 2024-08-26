package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IQuestionAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.dto.QuestionDTO;
import com.research.pisatest.entity.Question;
import com.research.pisatest.exception.QuestionException;
import com.research.pisatest.pojo.QuestionDO;
import com.research.pisatest.repository.IQuestionRepository;
import com.research.pisatest.service.QuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhongqilong
 * @date 2024/8/12 00:13
 * @description
 */
@Service
public class QuestionBankServiceImpl implements QuestionBankService {

    @Autowired
    private IQuestionRepository questionRepository;

    @Autowired
    private IQuestionAssembler questionAssembler;

    /**
     * 查询题库中所有的问题
     * @return
     */
    @Override
    public List<Question> getAllQuestions() {
        List<QuestionDO> questionDOList = questionRepository.getAllQuestions();
        return questionAssembler.DOListToQuestionList(questionDOList);
    }

    /**
     * 删除问题
     * @param question
     * @return
     */
    @Override
    public Boolean deleteQuestion(Question question) {
        QuestionDO questionDO = questionAssembler.toQuestionDO(question);
        return questionRepository.deleteQuestion(questionDO);
    }

    /**
     * 修改问题序号
     * @param questionList
     * @return
     */
    @Override
    public void modifyQuestionNo(List<Question> questionList) {
        // 有相同题号则抛出异常
        Map<Integer, Boolean> noMap = new HashMap<>();
        for (Question question : questionList) {
            if (question.getNo() == null) {
                throw new QuestionException("问题序号不能为空");
            }
            if (noMap.containsKey(question.getNo()) && question.getNo() != Constants.DELETE_QUESTION_NO) {
                throw new QuestionException("问题序号不能重复");
            }
            noMap.put(question.getNo(), true);
        }
        // 保证题目序号是从1开始连续的，且不能有重复题号
        List<Integer> noList = new ArrayList<>(noMap.keySet());
        noList.sort(Integer::compareTo);
        // 被删除的题目不计入题号
        noList = noList.stream().filter(no -> no != Constants.DELETE_QUESTION_NO).toList();
        for (int i = 0; i < noList.size(); i++) {
            if (noList.get(i) != i + 1) {
                throw new QuestionException("问题序号不连续");
            }
        }
        List<QuestionDO> questionDOList = questionAssembler.toQuestionDOList(questionList);
        questionRepository.modifyQuestionNo(questionDOList);
    }

    /**
     * 查询所有问题名称
     * @return
     */
    @Override
    public List<String> getAllQuestionName() {
        List<QuestionDO> questionDOList = questionRepository.getAllQuestionName();
        List<String> res = questionDOList.stream().map(QuestionDO::getHtmlName).toList();
        return res;
    }
}
