package com.research.pisatest.repository.repositoryImpl;

import com.research.pisatest.assembler.IQuestionAssembler;
import com.research.pisatest.mapper.QuestionDOExtMapper;
import com.research.pisatest.mapper.QuestionDOMapper;
import com.research.pisatest.pojo.QuestionDO;
import com.research.pisatest.pojo.QuestionDOExample;
import com.research.pisatest.repository.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhongqilong
 * @date 2024/8/12 13:01
 * @description
 */
@Repository
public class QuestionRepositoryImpl implements IQuestionRepository {

    @Autowired
    private QuestionDOMapper questionDOMapper;

    @Autowired
    private QuestionDOExtMapper questionDOExtMapper;

    /**
     * 获取数据库中所有题目
     * @return
     */
    @Override
    public List<QuestionDO> getAllQuestions() {
        QuestionDOExample example = new QuestionDOExample();
        example.createCriteria().andIdIsNotNull();
        return questionDOMapper.selectByExample(example);
    }

    /**
     * 删除题目：将no设置为-1
     * @param questionDO
     * @return
     */
    @Override
    @Transactional
    public Boolean deleteQuestion(QuestionDO questionDO) {
        questionDOExtMapper.updateQuestionNo(questionDO.getNo());
        if (questionDOExtMapper.deleteQuestionFromTest(questionDO.getId()) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 修改题目顺序
     * @param questionDOList
     * @return
     */
    @Override
    @Transactional
    public void modifyQuestionNo(List<QuestionDO> questionDOList) {
        for (QuestionDO questionDO : questionDOList) {
            QuestionDOExample example = new QuestionDOExample();
            example.createCriteria().andIdEqualTo(questionDO.getId());
            questionDOMapper.updateByExample(questionDO, example);
        }
    }

    /**
     * 获取所有题目名称
     * @return
     */
    @Override
    public List<QuestionDO> getAllQuestionName() {
        QuestionDOExample example = new QuestionDOExample();
        example.createCriteria().andIdIsNotNull();
        return questionDOMapper.selectByExample(example);
    }

    @Override
    public QuestionDO getQuestionByNo(Integer no) {
        QuestionDOExample example = new QuestionDOExample();
        example.createCriteria().andNoEqualTo(no);
        return questionDOMapper.selectByExample(example).get(0);
    }
}
