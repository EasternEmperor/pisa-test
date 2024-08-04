package com.research.pisatest.controller;

import com.research.pisatest.assembler.IUserAnswerAssembler;
import com.research.pisatest.assembler.IUserAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.entity.User;
import com.research.pisatest.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.research.pisatest.service.UserService;

import java.util.List;

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

    @Autowired
    private IUserAssembler userAssembler;

    @Autowired
    private IUserAnswerAssembler userAnswerAssembler;

    @PostMapping("/login")
    public Result login(@RequestParam String userName) {
        try {
            User user = userService.login(userName);
            return Result.success(userAssembler.toUserDTO(user), "登录成功");
        } catch (Exception e) {
            return Result.error(Constants.ERRORCODE, e.getMessage());
        }
    }

    @GetMapping("/getDescInfo")
    public Result getDescInfo() {
        try {
            DescInfo descInfo = userService.getDescInfo();
            return Result.success(descInfo, "获取系统信息成功");
        } catch (Exception e) {
            return Result.error(Constants.ERRORCODE, e.getMessage());
        }
    }

    @GetMapping("/getUserAnswerList")
    public Result getUserAnswerList() {
        try {
            return Result.success(userService.selectAllUserAnswer(), "获取所有用户答题信息成功");
        } catch (Exception e) {
            return Result.error(Constants.ERRORCODE, e.getMessage());
        }
    }
}
