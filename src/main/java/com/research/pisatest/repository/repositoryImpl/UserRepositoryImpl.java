package com.research.pisatest.repository.repositoryImpl;

import com.research.pisatest.assembler.IUserAssembler;
import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.entity.User;
import com.research.pisatest.mapper.QuestionDOMapper;
import com.research.pisatest.mapper.UserAnswerDOMapper;
import com.research.pisatest.mapper.UserDOMapper;
import com.research.pisatest.pojo.QuestionDOExample;
import com.research.pisatest.pojo.UserAnswerDOExample;
import com.research.pisatest.pojo.UserDO;
import com.research.pisatest.pojo.UserDOExample;
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
        List<UserDO> userDOs = userDOMapper.selectByExample(example);
        if (userDOs.isEmpty()) {
            return null;
        }
        UserDO userDO = userDOs.get(0);
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
     * 查询所有用户名
     * @return
     */
    @Override
    public List<UserDO> selectAllUserName() {
        UserDOExample example = new UserDOExample();
        example.createCriteria().andUserNameIsNotNull();
        return userDOMapper.selectByExample(example);
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
