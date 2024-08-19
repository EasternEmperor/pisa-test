package com.research.pisatest.controller;

import com.research.pisatest.assembler.IAnswerDataAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.Result;
import com.research.pisatest.dto.AnswerDataDTO;
import com.research.pisatest.service.AnswerDataService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/getAnswerData")
    public Result getAnswerData(HttpServletRequest request, @Valid String htmlName) {
        try {
            List<AnswerDataDTO> answerDataDTOList = answerDataAssembler.toDTOList(answerDataService.getAnswerData(htmlName));
            return Result.success(answerDataDTOList, "获取用户答题数据成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }
}
