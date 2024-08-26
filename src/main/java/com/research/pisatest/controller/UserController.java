package com.research.pisatest.controller;

import com.research.pisatest.assembler.IUserAnswerAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.dto.UserAnswerDTO;
import com.research.pisatest.dto.UserDTO;
import com.research.pisatest.common.utils.Result;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
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
    private IUserAnswerAssembler userAnswerAssembler;

    /**
     * 用户登录
     * @param userName
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestParam String userName) {
        try {
            UserDTO userDTO = userService.login(userName);
            return Result.success(userDTO, "登录成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }

    /**
     * 用户登出
     * @param request
     * @return
     */
    @PostMapping("/logout")
    public Result logout(HttpServletRequest request) {
        try {
            userService.logout(request);
            return Result.success();
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }

    }

    @GetMapping("/getAnswerHistory")
    public Result getAnswerHistory(@Valid String userName) {
        try {
            List<UserAnswerDTO> userAnswerDTOList = userAnswerAssembler.toUserAnswerDTOList(userService.getAnswerHistory(userName));
            return Result.success(userAnswerDTOList, "获取用户答题历史成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }

}
