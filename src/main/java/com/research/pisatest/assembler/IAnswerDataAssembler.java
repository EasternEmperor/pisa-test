package com.research.pisatest.assembler;

import com.research.pisatest.dto.AnswerDataDTO;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.pojo.*;
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

    // 1. 空调
    AnswerData airConditionerDataDOToEntity(AirControllerDataDO airControllerDataDO);
    List<AnswerData> airConditionerDataDOListToEntityList(List<AirControllerDataDO> airControllerDataDOList);
    AirControllerDataDO toAirControllerDataDO(AnswerData answerData);
    List<AirControllerDataDO> toAirControllerDataDOList(List<AnswerData> answerDataList);

    // 2. 购票系统
    AnswerData ticketsSaleDataDOToEntity(TicketsSaleDataDO ticketsSaleDataDO);
    List<AnswerData> ticketsSaleDataDOListToEntityList(List<TicketsSaleDataDO> ticketsSaleDataDOList);
    TicketsSaleDataDO toTicketsSaleDataDO(AnswerData answerData);
    List<TicketsSaleDataDO> toTicketsSaleDataDOList(List<AnswerData> answerDataList);

    // 3. 猫粮
    AnswerData catFeedDataDOToEntity(CatFeedDataDO catFeedDataDO);
    List<AnswerData> catFeedDataDOListToEntityList(List<CatFeedDataDO> catFeedDataDOList);
    CatFeedDataDO toCatFeedDataDO(AnswerData answerData);
    List<CatFeedDataDO> toCatFeedDataDOList(List<AnswerData> answerDataList);

    // 4. 香水
    AnswerData perfumeMakerDataDOToEntity(PerfumeMakerDataDO perfumeMakerDataDO);
    List<AnswerData> perfumeMakerDataDOListToEntityList(List<PerfumeMakerDataDO> perfumeMakerDataDOList);
    PerfumeMakerDataDO toPerfumeMakerDataDO(AnswerData answerData);
    List<PerfumeMakerDataDO> toPerfumeMakerDataDOList(List<AnswerData> answerDataList);

    // 5. 果茶
    AnswerData fruitTeaDataDOToEntity(FruitTeaDataDO fruitTeaDataDO);
    List<AnswerData> fruitTeaDataDOListToEntityList(List<FruitTeaDataDO> fruitTeaDataDOList);
    FruitTeaDataDO toFruitTeaDataDO(AnswerData answerData);
    List<FruitTeaDataDO> toFruitTeaDataDOList(List<AnswerData> answerDataList);

    // 6. 咖啡机
    AnswerData coffeeMachineDataDOToEntity(CoffeeMachineDataDO coffeeMachineDataDO);
    List<AnswerData> coffeeMachineDataDOListToEntityList(List<CoffeeMachineDataDO> coffeeMachineDataDOList);
    CoffeeMachineDataDO toCoffeeMachineDataDO(AnswerData answerData);
    List<CoffeeMachineDataDO> toCoffeeMachineDataDOList(List<AnswerData> answerDataList);

    // 7. 电饭煲
    AnswerData riceCookerDataDOToEntity(RiceCookerDataDO riceCookerDataDO);
    List<AnswerData> riceCookerDataDOListToEntityList(List<RiceCookerDataDO> riceCookerDataDOList);
    RiceCookerDataDO toRiceCookerDataDO(AnswerData answerData);
    List<RiceCookerDataDO> toRiceCookerDataDOList(List<AnswerData> answerDataList);

    // 8. 手电筒
    AnswerData flashlightDataDOToEntity(FlashlightDataDO flashlightDataDO);
    List<AnswerData> flashlightDataDOListToEntityList(List<FlashlightDataDO> flashlightDataDOList);
    FlashlightDataDO toFlashlightDataDO(AnswerData answerData);
    List<FlashlightDataDO> toFlashlightDataDOList(List<AnswerData> answerDataList);

    // 9. 花园
    AnswerData flowerGardenDataDOToEntity(FlowerGardenDataDO flowerGardenDataDO);
    List<AnswerData> flowerGardenDataDOListToEntityList(List<FlowerGardenDataDO> flowerGardenDataDOList);
    FlowerGardenDataDO toFlowerGardenDataDO(AnswerData answerData);
    List<FlowerGardenDataDO> toFlowerGardenDataDOList(List<AnswerData> answerDataList);

    // 10. 大空调
    AnswerData bigAirControllerDataDOToEntity(BigAirControllerDataDO bigAirControllerDataDO);
    List<AnswerData> bigAirControllerDataDOListToEntityList(List<BigAirControllerDataDO> bigAirControllerDataDOList);
    BigAirControllerDataDO toBigAirControllerDataDO(AnswerData answerData);
    List<BigAirControllerDataDO> toBigAirControllerDataDOList(List<AnswerData> answerDataList);

    // 11. 视频播放器
    AnswerData videoPlayerDataDOToEntity(VideoPlayerDataDO videoPlayerDataDO);
    List<AnswerData> videoPlayerDataDOListToEntityList(List<VideoPlayerDataDO> videoPlayerDataDOList);
    VideoPlayerDataDO toVideoPlayerDataDO(AnswerData answerData);
    List<VideoPlayerDataDO> toVideoPlayerDataDOList(List<AnswerData> answerDataList);

    // 12. 饮水机
    AnswerData waterDispenserDataDOToEntity(WaterDispenserDataDO waterDispenserDataDO);
    List<AnswerData> waterDispenserDataDOListToEntityList(List<WaterDispenserDataDO> waterDispenserDataDOList);
    WaterDispenserDataDO toWaterDispenserDataDO(AnswerData answerData);
    List<WaterDispenserDataDO> toWaterDispenserDataDOList(List<AnswerData> answerDataList);

    // 13. 投影机
    AnswerData projectionControllerDataDOToEntity(ProjectionControllerDataDO projectionControllerDataDO);
    List<AnswerData> projectionControllerDataDOListToEntityList(List<ProjectionControllerDataDO> projectionControllerDataDOList);
    ProjectionControllerDataDO toProjectionControllerDataDO(AnswerData answerData);
    List<ProjectionControllerDataDO> toProjectionControllerDataDOList(List<AnswerData> answerDataList);

    // 14. 照相机
    AnswerData cameraControllerDataDOToEntity(CameraControllerDataDO cameraControllerDataDO);
    List<AnswerData> cameraControllerDataDOListToEntityList(List<CameraControllerDataDO> cameraControllerDataDOList);
    CameraControllerDataDO toCameraControllerDataDO(AnswerData answerData);
    List<CameraControllerDataDO> toCameraControllerDataDOList(List<AnswerData> answerDataList);

    // 15. 座位分配
    AnswerData seatsScheduleDataDOToEntity(SeatsScheduleDataDO seatsScheduleDataDO);
    List<AnswerData> seatsScheduleDataDOListToEntityList(List<SeatsScheduleDataDO> seatsScheduleDataDOList);
    SeatsScheduleDataDO toSeatsScheduleDataDO(AnswerData answerData);
    List<SeatsScheduleDataDO> toSeatsScheduleDataDOList(List<AnswerData> answerDataList);
}
