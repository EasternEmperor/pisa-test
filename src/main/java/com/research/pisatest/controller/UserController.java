package com.research.pisatest.controller;

import com.research.pisatest.common.Constants;
import com.research.pisatest.domain.User;
import com.research.pisatest.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import com.research.pisatest.service.UserService;

/**
 * @author zhongqilong
 * @date 2024/7/26 19:50
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestParam String userName) {
        try {
            User user = userService.login(userName);
            return Result.success(user, "登录成功");
        } catch (Exception e) {
            return Result.error(Constants.ERRORCODE, e.getMessage());
        }
    }
}
