package com.research.pisatest.assembler;

import com.research.pisatest.dto.QuestionDTO;
import com.research.pisatest.entity.Question;
import com.research.pisatest.pojo.QuestionDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/12 13:15
 * @description
 */
@Mapper(componentModel = "spring")
public interface IQuestionAssembler {
    IQuestionAssembler INSTANCE = Mappers.getMapper(IQuestionAssembler.class);

    Question DOToQuestion(QuestionDO questionDO);

    List<Question> DOListToQuestionList(List<QuestionDO> questionDOList);

    Question DTOToQuestion(QuestionDTO questionDTO);

    List<Question> DTOListToQuestionList(List<QuestionDTO> questionDTOList);

    QuestionDTO toQuestionDTO(Question question);

    List<QuestionDTO> toQuestionDTOList(List<Question> questionList);

    QuestionDO toQuestionDO(Question question);
     List<QuestionDO> toQuestionDOList(List<Question> questionList);
}
