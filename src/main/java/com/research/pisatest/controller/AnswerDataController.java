package com.research.pisatest.controller;

import com.research.pisatest.assembler.IAnswerDataAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.Result;
import com.research.pisatest.dto.AnswerDataDTO;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.query.AnswerDataQuery;
import com.research.pisatest.query.DownloadInfo;
import com.research.pisatest.service.AnswerDataService;
import com.research.pisatest.service.DownloadService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author zhongqilong
 * @date 2024/8/13 19:42
 * @description
 */
@RestController
@RequestMapping("/answerData")
public class AnswerDataController {

    @Autowired
    private AnswerDataService answerDataService;

    @Autowired
    private IAnswerDataAssembler answerDataAssembler;

    @Autowired
    private DownloadService downloadService;

    @PostMapping("/getAnswerData")
    public Result getAnswerData(HttpServletResponse response, @RequestBody AnswerDataQuery answerDataQuery) {
        try {
            List<AnswerData> answerDataList = answerDataService.getAnswerData(answerDataQuery.getHtmlName(), answerDataQuery.getUserName(), answerDataQuery.getIthAnswer());
            List<AnswerDataDTO> answerDataDTOList = answerDataAssembler.toDTOList(answerDataList);
            if (answerDataQuery.getDownloadInfo() == null) {
                return Result.success(answerDataDTOList, "获取用户答题数据成功");
            } else {
                // 下载请求
                List<Object> datas = new ArrayList<>(answerDataDTOList);
                downloadService.dataExport(response, datas, answerDataQuery.getDownloadInfo());
                return Result.success(null, "下载成功");
            }
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }
}
