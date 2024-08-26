package com.research.pisatest.assembler;

import com.research.pisatest.dto.AnswerDataDTO;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.pojo.AirControllerDataDO;
import com.research.pisatest.pojo.TicketsSaleDataDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/19 22:54
 * @description
 */
@Mapper(componentModel = "spring")
public interface IAnswerDataAssembler {
    IAnswerDataAssembler INSTANCE = Mappers.getMapper(IAnswerDataAssembler.class);

    AnswerDataDTO toDTO(AnswerData answerData);

    AnswerData DTOToAnswerData(AnswerDataDTO answerDataDTO);

    List<AnswerDataDTO> toDTOList(List<AnswerData> answerDataList);

    AnswerData airConditionerDataDOToEntity(AirControllerDataDO airControllerDataDO);

    List<AnswerData> airConditionerDataDOListToEntityList(List<AirControllerDataDO> airControllerDataDOList);

    AnswerData ticketsSaleDataDOToEntity(TicketsSaleDataDO ticketsSaleDataDO);

    List<AnswerData> ticketsSaleDataDOListToEntityList(List<TicketsSaleDataDO> ticketsSaleDataDOList);

    AirControllerDataDO toAirControllerDataDO(AnswerData answerData);

    TicketsSaleDataDO toTicketsSaleDataDO(AnswerData answerData);
}
