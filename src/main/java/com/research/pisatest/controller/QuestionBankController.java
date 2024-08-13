package com.research.pisatest.controller;

import com.research.pisatest.assembler.IQuestionAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.common.utils.Result;
import com.research.pisatest.dto.QuestionDTO;
import com.research.pisatest.entity.Question;
import com.research.pisatest.pojo.QuestionDOExample;
import com.research.pisatest.service.QuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/12 00:09
 * @description
 */
@RestController
@RequestMapping("/questionBank")
public class QuestionBankController {

    @Autowired
    private QuestionBankService questionBankService;

    @Autowired
    private IQuestionAssembler questionAssembler;

    /**
     * 获取所有题目
     * @return
     */
    @GetMapping("/getAllQuestions")
    public Result getAllQuestions() {
        try {
            List<QuestionDTO> questionDTOList = questionAssembler.toQuestionDTOList(questionBankService.getAllQuestions());
            return Result.success(questionDTOList, "获取问题列表成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, "获取问题列表失败：" + e.getMessage());
        }
    }

    /**
     * 将某题从试卷中删除
     * @param questionDTO
     * @return
     */
    @PostMapping("/deleteQuestion")
    public Result deleteQuestion(@RequestBody QuestionDTO questionDTO) {
        try {
            Question question = questionAssembler.DTOToQuestion(questionDTO);
            Boolean success = questionBankService.deleteQuestion(question);
            if (success) {
                return Result.success("删除成功");
            } else {
                return Result.error(Constants.ERROR_CODE, "删除失败");
            }
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, "删除失败：" + e.getMessage());
        }
    }

    /**
     * 修改题目顺序
     * @param questionDTOList
     * @return
     */
    @PostMapping("/modifyQuestionNo")
    public Result modifyQuestionNo(@RequestBody List<QuestionDTO> questionDTOList) {
        try {
            List<Question> questionList = questionAssembler.DTOListToQuestionList(questionDTOList);
            questionBankService.modifyQuestionNo(questionList);
            return Result.success("修改成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, "修改失败：" + e.getMessage());
        }
    }

    /**
     * 获取所有题目名称
     * @return
     */
    @GetMapping("/getAllQuestionName")
    public Result getAllQuestionName() {
        try {
            List<String> questionNameList = questionBankService.getAllQuestionName();
            return Result.success(questionNameList, "获取问题名称列表成功");
        } catch (Exception e) {
            return Result.error(Constants.ERROR_CODE, "获取问题名称列表失败：" + e.getMessage());
        }
    }

}
