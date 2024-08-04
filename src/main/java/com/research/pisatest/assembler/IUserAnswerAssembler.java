package com.research.pisatest.assembler;

import com.research.pisatest.dto.UserAnswerDTO;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.pojo.UserAnswerDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/4 16:57
 * @description
 */
@Mapper(componentModel = "spring")
public interface IUserAnswerAssembler {
    IUserAnswerAssembler INSTANCE = Mappers.getMapper(IUserAnswerAssembler.class);

    UserAnswer DOToUserAnswer(UserAnswerDO userAnswerDO);

    List<UserAnswer> DOToUserAnswerList(List<UserAnswerDO> userAnswerDOList);

    UserAnswerDTO ToUserAnswerDTO(UserAnswer userAnswer);

    List<UserAnswerDTO> ToUserAnswerDTOList(List<UserAnswer> userAnswerList);
}
