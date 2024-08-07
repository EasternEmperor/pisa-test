package com.research.pisatest.controller.user;

import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.RedisUtils;
import com.research.pisatest.dto.UserDTO;
import com.research.pisatest.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.research.pisatest.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
            UserDTO userDTO = userService.login(userName);
            return Result.success(userDTO, "登录成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }

}
