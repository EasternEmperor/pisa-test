package com.research.pisatest.repository.repositoryImpl;

import com.research.pisatest.assembler.IUserAnswerAssembler;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.mapper.UserAnswerDOMapper;
import com.research.pisatest.pojo.UserAnswerDO;
import com.research.pisatest.pojo.UserAnswerDOExample;
import com.research.pisatest.repository.IUserAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/26 17:33
 * @description
 */
@Repository
public class UserAnswerRepositoryImpl implements IUserAnswerRepository {
    @Autowired
    private UserAnswerDOMapper userAnswerDOMapper;

    @Autowired
    private IUserAnswerAssembler userAnswerAssembler;

    /**
     * 查询所有题目
     * @return
     */
    @Override
    public List<UserAnswerDO> selectAllAnswerNo() {
        UserAnswerDOExample example = new UserAnswerDOExample();
        example.createCriteria().andIdIsNotNull();
        return userAnswerDOMapper.selectByExample(example);
    }

    /**
     * 根据用户名查询答题次数
     * @param userName
     * @return
     */
    @Override
    public List<UserAnswerDO> selectAnswerNo(String userName) {
        UserAnswerDOExample example = new UserAnswerDOExample();
        example.createCriteria().andUserNameEqualTo(userName);
        return userAnswerDOMapper.selectByExample(example);
    }

    /**
     * 查询所有用户的所有答题记录
     * @return
     */
    @Override
    public List<UserAnswer> selectAllUserAnswer() {
        UserAnswerDOExample example = new UserAnswerDOExample();
        example.createCriteria().andIdIsNotNull();
        List<UserAnswerDO> userAnswerDOS = userAnswerDOMapper.selectByExample(example);
        return userAnswerAssembler.DOToUserAnswerList(userAnswerDOS);
    }

    /**
     * 根据用户名查询用户的所有答题记录
     * @param userName
     * @return
     */
    @Override
    public List<UserAnswer> selectUserAnswerByUserName(String userName) {
        UserAnswerDOExample example = new UserAnswerDOExample();
        example.createCriteria().andUserNameEqualTo(userName);
        List<UserAnswerDO> userAnswerDOS = userAnswerDOMapper.selectByExample(example);
        return userAnswerAssembler.DOToUserAnswerList(userAnswerDOS);
    }

    /**
     * 根据ith查询所有第i次答题记录
     * @param ith
     * @return
     */
    @Override
    public List<UserAnswer> selectUserAnswerByIth(Integer ith) {
        UserAnswerDOExample example = new UserAnswerDOExample();
        example.createCriteria().andIthAnswerEqualTo(ith);
        List<UserAnswerDO> userAnswerDOS = userAnswerDOMapper.selectByExample(example);
        return userAnswerAssembler.DOToUserAnswerList(userAnswerDOS);
    }

    /**
     * 根据用户名和ith查询用户的所有答题记录
     * @param userName
     * @param ith
     * @return
     */
    @Override
    public List<UserAnswer> selectUserAnswerByUserNameAndIth(String userName, Integer ith) {
        UserAnswerDOExample example = new UserAnswerDOExample();
        example.createCriteria().andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        List<UserAnswerDO> userAnswerDOS = userAnswerDOMapper.selectByExample(example);
        return userAnswerAssembler.DOToUserAnswerList(userAnswerDOS);
    }

    /**
     * 插入一条用户Test完成数据
     * @param userAnswerDO
     */
    @Transactional
    @Override
    public void insertUserAnswer(UserAnswerDO userAnswerDO) {
        userAnswerDOMapper.insert(userAnswerDO);
    }
}
