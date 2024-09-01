package com.research.pisatest.controller;

import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.Result;
import com.research.pisatest.dto.UserAnswerDTO;
import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.query.DownloadInfo;
import com.research.pisatest.query.UserAnswerQuery;
import com.research.pisatest.service.AdminService;
import com.research.pisatest.service.DownloadService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.OutputStream;
import java.util.*;

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

    @Autowired
    private DownloadService downloadService;

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

    @PostMapping("/getUserAnswerList")
    public Result getUserAnswerList(HttpServletResponse response, @RequestBody UserAnswerQuery userAnswerQuery) {
        try {
            List<UserAnswerDTO> userAnswerDTOList = adminService.getUserAnswerList(userAnswerQuery.getUserName(), userAnswerQuery.getIth());
            // 查询请求
            if (userAnswerQuery.getDownloadInfo() == null) {
                return Result.success(userAnswerDTOList, "获取所有用户答题信息成功");
            } else {
                // 下载请求
                List<Object> datas = new ArrayList<>(userAnswerDTOList);
                downloadService.dataExport(response, datas, userAnswerQuery.getDownloadInfo());
                return Result.success(null, "下载成功");
            }
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }
}
