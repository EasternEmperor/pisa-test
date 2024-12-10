package com.research.pisatest.assembler;

import com.research.pisatest.dto.AnswerDataDTO;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.pojo.AirControllerDataDO;
import com.research.pisatest.pojo.CatFeedDataDO;
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

    List<AnswerData> DTOListToAnswerDataList(List<AnswerDataDTO> answerDataDTOList);

    List<AnswerDataDTO> toDTOList(List<AnswerData> answerDataList);

    // 空调
    AnswerData airConditionerDataDOToEntity(AirControllerDataDO airControllerDataDO);
    List<AnswerData> airConditionerDataDOListToEntityList(List<AirControllerDataDO> airControllerDataDOList);
    AirControllerDataDO toAirControllerDataDO(AnswerData answerData);
    List<AirControllerDataDO> toAirControllerDataDOList(List<AnswerData> answerDataList);

    // 购票系统
    AnswerData ticketsSaleDataDOToEntity(TicketsSaleDataDO ticketsSaleDataDO);
    List<AnswerData> ticketsSaleDataDOListToEntityList(List<TicketsSaleDataDO> ticketsSaleDataDOList);
    TicketsSaleDataDO toTicketsSaleDataDO(AnswerData answerData);
    List<TicketsSaleDataDO> toTicketsSaleDataDOList(List<AnswerData> answerDataList);

    // 猫粮
    AnswerData catFeedDataDOToEntity(CatFeedDataDO catFeedDataDO);
    List<AnswerData> catFeedDataDOListToEntityList(List<CatFeedDataDO> catFeedDataDOList);
    CatFeedDataDO toCatFeedDataDO(AnswerData answerData);
    List<CatFeedDataDO> toCatFeedDataDOList(List<AnswerData> answerDataList);
}
