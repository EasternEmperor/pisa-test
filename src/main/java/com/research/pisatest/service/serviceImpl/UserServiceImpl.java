package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IUserAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.domain.User;
import com.research.pisatest.exception.UserNameFormatException;
import com.research.pisatest.mapper.UserDOMapper;
import com.research.pisatest.pojo.UserDO;
import com.research.pisatest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

/**
 * @author zhongqilong
 * @date 2024/7/26 19:21
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private IUserAssembler userAssembler;

    @Override
    public User login(String userName) {
        // 只要输入符合格式便可
        if (userName.matches(Constants.USERPATTERN)) {
            UserDO user = checkUser(userName);
            if (user != null) {
                return userAssembler.UserDOToUser(user);
            } else {
                // 插入用户
                UserDO newUser = new UserDO();
                newUser.setUserName(userName);
                newUser.setRole(Constants.COMMON);
                userDOMapper.insert(newUser);
                return userAssembler.UserDOToUser(newUser);
            }
        } else {
            throw new UserNameFormatException("用户名格式错误");
        }
    }

    private UserDO checkUser(String userName) {
        return userDOMapper.selectByUserName(userName);
    }
}
