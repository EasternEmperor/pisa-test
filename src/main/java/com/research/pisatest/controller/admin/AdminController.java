package com.research.pisatest.controller.admin;

import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.Result;
import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongqilong
 * @date 2024/8/6 20:43
 * @description
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/getDescInfo")
    public Result getDescInfo() {
        try {
            DescInfo descInfo = userService.getDescInfo();
            return Result.success(descInfo, "获取系统信息成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }

    @GetMapping("/getUserAnswerList")
    public Result getUserAnswerList() {
        try {
            return Result.success(userService.selectAllUserAnswer(), "获取所有用户答题信息成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }
}
