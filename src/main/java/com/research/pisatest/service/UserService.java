package com.research.pisatest.service;

import com.research.pisatest.dto.UserAnswerDTO;
import com.research.pisatest.dto.UserDTO;
import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.entity.User;
import com.research.pisatest.entity.UserAnswer;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/7/24 17:33
 * @description
 */
public interface UserService {
    /**
     * 输入用户名登录
     * @param userName
     * @return
     */
    UserDTO login(String userName);

    void logout(HttpServletRequest request);
}
