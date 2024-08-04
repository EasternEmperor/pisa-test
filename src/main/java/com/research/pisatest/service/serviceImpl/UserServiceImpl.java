package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IUserAnswerAssembler;
import com.research.pisatest.assembler.IUserAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.dto.UserAnswerDTO;
import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.entity.User;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.exception.UserNameFormatException;
import com.research.pisatest.repository.IUserRepository;
import com.research.pisatest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author zhongqilong
 * @date 2024/7/26 19:21
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IUserAssembler userAssembler;

    @Autowired
    private IUserAnswerAssembler userAnswerAssembler;

    /**
     * 输入用户名登录，判断用户名格式是否正确，如果正确则查询用户信息，如果不存在则插入新用户
     * @param userName
     * @return
     */
    @Override
    public User login(String userName) {
        // 只要输入符合格式便可
        if (userName.matches(Constants.USERPATTERN)) {
            User user = userRepository.selectByUserName(userName);
            if (user != null) {
                return user;
            } else {
                // 插入用户
                User newUser = new User();
                newUser.setUserName(userName);
                newUser.setRole(Constants.COMMON);
                userRepository.insert(newUser);
                return newUser;
            }
        } else {
            throw new UserNameFormatException("用户名格式错误");
        }
    }

    /**
     * 查询所有用户的答题记录
     * @return
     */
    @Override
    public List<UserAnswerDTO> selectAllUserAnswer() {
        List<UserAnswer> userAnswers = userRepository.selectAllUserAnswer();
        List<UserAnswerDTO> userAnswerDTOS = userAnswerAssembler.ToUserAnswerDTOList(userAnswers);
        return userAnswerDTOS;
    }

    @Override
    public DescInfo getDescInfo() {
        return userRepository.getSystemDescInfo();
    }


}
