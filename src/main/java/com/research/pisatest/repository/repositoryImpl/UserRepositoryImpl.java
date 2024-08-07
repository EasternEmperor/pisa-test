package com.research.pisatest.repository.repositoryImpl;

import com.research.pisatest.assembler.IUserAnswerAssembler;
import com.research.pisatest.assembler.IUserAssembler;
import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.entity.User;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.mapper.QuestionDOMapper;
import com.research.pisatest.mapper.UserAnswerDOMapper;
import com.research.pisatest.mapper.UserDOMapper;
import com.research.pisatest.pojo.*;
import com.research.pisatest.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/3 10:52
 * @description
 */
@Repository
public class UserRepositoryImpl implements IUserRepository {
    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private IUserAssembler userAssembler;

    @Autowired
    private UserAnswerDOMapper userAnswerDOMapper;

    @Autowired
    private IUserAnswerAssembler userAnswerAssembler;

    @Autowired
    private QuestionDOMapper questionDOMapper;

    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    @Override
    public User selectByUserName(String userName) {
        UserDOExample example = new UserDOExample();
        example.createCriteria().andUserNameEqualTo(userName);
        UserDO userDO = userDOMapper.selectByExample(example).get(0);
        return userAssembler.UserDOToUser(userDO);
    }

    /**
     * 插入用户
     * @param user
     */
    @Override
    @Transactional
    public void insert(User user) {
        UserDO userDO = userAssembler.toUserDO(user);
        userDOMapper.insert(userDO);
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
     * 获取用户和试题基本信息
     * @return
     */
    @Override
    public DescInfo getSystemDescInfo() {
        DescInfo descInfo = new DescInfo();
        // 用户数量
        UserDOExample userExample = new UserDOExample();
        userExample.createCriteria().andIdIsNotNull();
        descInfo.setUserCount(userDOMapper.countByExample(userExample));
        // 答题次数
        UserAnswerDOExample userAnswerExample = new UserAnswerDOExample();
        userAnswerExample.createCriteria().andIdIsNotNull();
        descInfo.setAnswerCount(userAnswerDOMapper.countByExample(userAnswerExample));
        // 试题数量
        QuestionDOExample questionExample = new QuestionDOExample();
        questionExample.createCriteria().andIdIsNotNull();
        descInfo.setQuestionCount(questionDOMapper.countByExample(questionExample));
        return descInfo;
    }

}
