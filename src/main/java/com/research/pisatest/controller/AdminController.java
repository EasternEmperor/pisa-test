package com.research.pisatest.controller;

import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.Result;
import com.research.pisatest.dto.UserAnswerDTO;
import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.service.AdminService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Set;

/**
 * @author zhongqilong
 * @date 2024/8/6 20:43
 * @description
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/getDescInfo")
    public Result getDescInfo() {
        try {
            DescInfo descInfo = adminService.getDescInfo();
            return Result.success(descInfo, "获取系统信息成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }

    @GetMapping("/getAllUserName")
    public Result getAllUserName() {
        try {
            List<String> userNameList = adminService.getAllUserName();
            return Result.success(userNameList, "获取所有用户名成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }

    @GetMapping("/getAllAnswerNo")
    public Result getAllAnswerNo() {
        try {
            Set<String> userAnswerIthList = adminService.getAllAnswerNo();
            return Result.success(userAnswerIthList, "获取所有问题编号成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }

    @GetMapping("/getUserAnswerList")
    public Result getUserAnswerList(HttpServletRequest request, @Valid String userName, @Valid Integer ith) {
        try {
            List<UserAnswerDTO> userAnswerDTOList = adminService.getUserAnswerList(userName, ith);
            return Result.success(userAnswerDTOList, "获取所有用户答题信息成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }
}
