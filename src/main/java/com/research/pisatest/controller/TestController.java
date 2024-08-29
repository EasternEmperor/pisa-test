package com.research.pisatest.controller;

import com.research.pisatest.assembler.IAnswerDataAssembler;
import com.research.pisatest.assembler.IQuestionAssembler;
import com.research.pisatest.assembler.IUserAnswerAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.Result;
import com.research.pisatest.dto.AnswerDataDTO;
import com.research.pisatest.dto.QuestionDTO;
import com.research.pisatest.dto.UserAnswerDTO;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.entity.Question;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.service.TestService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/22 21:34
 * @description 提供测试
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @Autowired
    private IQuestionAssembler questionAssembler;

    @Autowired
    private IAnswerDataAssembler answerDataAssembler;

    @Autowired
    private IUserAnswerAssembler userAnswerAssembler;

    /**
     * 根据题目编号获取题目
     * @param no
     * @return
     */
    @GetMapping("/getQuestion")
    public Result getQuestion(@Valid Integer no){
        try {
            Question question = testService.getQuestion(no);
            QuestionDTO questionDTO = questionAssembler.toQuestionDTO(question);
            return Result.success(questionDTO, "获取下一题成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }

    @PostMapping("/submitAnswer")
    public Result submitAnswer(@RequestBody List<AnswerDataDTO> answerDataDTOs){
        try {
            List<AnswerData> answerDatas = answerDataAssembler.DTOListToAnswerDataList(answerDataDTOs);
            testService.submitAnswer(answerDatas);
            return Result.success("提交答案成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }

    @PostMapping("/finishTest")
    public Result finishTest(@RequestBody UserAnswerDTO userAnswerDTO){
        try {
            UserAnswer userAnswer = userAnswerAssembler.DTOToUserAnswer(userAnswerDTO);
            testService.finishTest(userAnswer);
            return Result.success("测验完成");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, e.getMessage());
        }
    }
}
