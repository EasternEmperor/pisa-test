package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IUserAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.RedisUtils;
import com.research.pisatest.dto.UserDTO;
import com.research.pisatest.entity.User;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.exception.TokenException;
import com.research.pisatest.exception.UserNameFormatException;
import com.research.pisatest.repository.IUserAnswerRepository;
import com.research.pisatest.repository.IUserRepository;
import com.research.pisatest.service.UserService;
import io.micrometer.common.util.StringUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


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
    private RedisUtils redisUtils;

    @Autowired
    private IUserAnswerRepository userAnswerRepository;


    /**
     * 输入用户名登录，判断用户名格式是否正确，如果正确则查询用户信息，如果不存在则插入新用户
     * @param userName
     * @return
     */
    @Override
    public UserDTO login(String userName) {
        // 只要输入符合格式便可
        if (userName.matches(Constants.USER_PATTERN)) {
            User user = userRepository.selectByUserName(userName);
            UserDTO userDTO = null;
            if (user != null) {
                userDTO = userAssembler.toUserDTO(user);
            } else {
                // 插入用户
                User newUser = new User();
                newUser.setUserName(userName);
                newUser.setRole(Integer.valueOf(Constants.COMMON_USER));
                userRepository.insert(newUser);
                userDTO = userAssembler.toUserDTO(newUser);
            }
            String token = setToken(userName, String.valueOf(userDTO.getRole()));
            userDTO.setToken(token);
            return userDTO;
        } else {
            throw new UserNameFormatException("用户名格式错误");
        }
    }

    /**
     * 设置token
     * @param userName
     * @param role
     * @return
     */
    private String setToken(String userName, String role) {
        try {
            String token = System.currentTimeMillis() + userName;
            Map<String, String> map = new HashMap<>();
            map.put("userName", userName);
            map.put("role", role);
            redisUtils.setMapWithExpiry(token, map, Constants.TTL, TimeUnit.DAYS);
            return token;
        } catch (Exception e) {
            throw new TokenException("设置token失败");
        }

    }

    @Override
    public void logout(HttpServletRequest request) {
        String token = request.getHeader("token");
        if (StringUtils.isNotBlank(token)) {
            redisUtils.deleteValue(token);
        }
    }

    @Override
    public List<UserAnswer> getAnswerHistory(String userName) {
        List<UserAnswer> userAnswerList = userAnswerRepository.selectUserAnswerByUserName(userName);
        return userAnswerList;
    }
}
