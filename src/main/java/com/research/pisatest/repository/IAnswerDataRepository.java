package com.research.pisatest.repository;

import com.research.pisatest.pojo.*;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/19 23:23
 * @description
 */
public interface IAnswerDataRepository {
    // AirControllerData
    List<AirControllerDataDO> getAirControllerData(String htmlName);
    List<AirControllerDataDO> getAirControllerData(String htmlName, String userName);
    List<AirControllerDataDO> getAirControllerData(String htmlName, Integer ith);
    List<AirControllerDataDO> getAirControllerData(String htmlName, String userName, Integer ith);
    void batchInsertAirControllerData(List<AirControllerDataDO> airControllerDataDOs);
    void insertAirControllerData(AirControllerDataDO airControllerDataDO);

    // TicketsSaleData
    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName);
    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName);
    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, Integer ith);
    List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName, Integer ith);
    void batchInsertTicketsSaleData(List<TicketsSaleDataDO> ticketsSaleDataDOs);
    void insertTicketsSaleData(TicketsSaleDataDO ticketsSaleDataDO);

    // CatFeedData
    List<CatFeedDataDO> getCatFeedData(String htmlName);
    List<CatFeedDataDO> getCatFeedData(String htmlName, String userName);
    List<CatFeedDataDO> getCatFeedData(String htmlName, Integer ith);
    List<CatFeedDataDO> getCatFeedData(String htmlName, String userName, Integer ith);
    void batchInsertCatFeedData(List<CatFeedDataDO> catFeedDataDOs);
    void insertCatFeedData(CatFeedDataDO catFeedDataDO);

    // PerfumeMakerData
    List<PerfumeMakerDataDO> getPerfumeMakerData(String htmlName);
    List<PerfumeMakerDataDO> getPerfumeMakerData(String htmlName, String userName);
    List<PerfumeMakerDataDO> getPerfumeMakerData(String htmlName, Integer ith);
    List<PerfumeMakerDataDO> getPerfumeMakerData(String htmlName, String userName, Integer ith);
    void batchInsertPerfumeMakerData(List<PerfumeMakerDataDO> perfumeMakerDataDOs);
    void insertPerfumeMakerData(PerfumeMakerDataDO perfumeMakerDataDO);

    // ProjectionControllerData
    List<ProjectionControllerDataDO> getProjectionControllerData(String htmlName);
    List<ProjectionControllerDataDO> getProjectionControllerData(String htmlName, String userName);
    List<ProjectionControllerDataDO> getProjectionControllerData(String htmlName, Integer ith);
    List<ProjectionControllerDataDO> getProjectionControllerData(String htmlName, String userName, Integer ith);
    void batchInsertProjectionControllerData(List<ProjectionControllerDataDO> projectionControllerDataDOs);
    void insertProjectionControllerData(ProjectionControllerDataDO projectionControllerDataDO);

    // WaterDispenserData
    List<WaterDispenserDataDO> getWaterDispenserData(String htmlName);
    List<WaterDispenserDataDO> getWaterDispenserData(String htmlName, String userName);
    List<WaterDispenserDataDO> getWaterDispenserData(String htmlName, Integer ith);
    List<WaterDispenserDataDO> getWaterDispenserData(String htmlName, String userName, Integer ith);
    void batchInsertWaterDispenserData(List<WaterDispenserDataDO> waterDispenserDataDOs);
    void insertWaterDispenserData(WaterDispenserDataDO waterDispenserDataDO);

    // VideoPlayerData
    List<VideoPlayerDataDO> getVideoPlayerData(String htmlName);
    List<VideoPlayerDataDO> getVideoPlayerData(String htmlName, String userName);
    List<VideoPlayerDataDO> getVideoPlayerData(String htmlName, Integer ith);
    List<VideoPlayerDataDO> getVideoPlayerData(String htmlName, String userName, Integer ith);
    void batchInsertVideoPlayerData(List<VideoPlayerDataDO> videoPlayerDataDOs);
    void insertVideoPlayerData(VideoPlayerDataDO videoPlayerDataDO);

    // BigAirControllerData
    List<BigAirControllerDataDO> getBigAirControllerData(String htmlName);
    List<BigAirControllerDataDO> getBigAirControllerData(String htmlName, String userName);
    List<BigAirControllerDataDO> getBigAirControllerData(String htmlName, Integer ith);
    List<BigAirControllerDataDO> getBigAirControllerData(String htmlName, String userName, Integer ith);
    void batchInsertBigAirControllerData(List<BigAirControllerDataDO> bigAirControllerDataDOs);
    void insertBigAirControllerData(BigAirControllerDataDO bigAirControllerDataDO);

    // FlowerGarden
    List<FlowerGardenDataDO> getFlowerGardenData(String htmlName);
    List<FlowerGardenDataDO> getFlowerGardenData(String htmlName, String userName);
    List<FlowerGardenDataDO> getFlowerGardenData(String htmlName, Integer ith);
    List<FlowerGardenDataDO> getFlowerGardenData(String htmlName, String userName, Integer ith);
    void batchInsertFlowerGardenData(List<FlowerGardenDataDO> flowerGardenDataDOs);
    void insertFlowerGardenData(FlowerGardenDataDO flowerGardenDataDO);

    // FlashlightData
    List<FlashlightDataDO> getFlashlightData(String htmlName);
    List<FlashlightDataDO> getFlashlightData(String htmlName, String userName);
    List<FlashlightDataDO> getFlashlightData(String htmlName, Integer ith);
    List<FlashlightDataDO> getFlashlightData(String htmlName, String userName, Integer ith);
    void batchInsertFlashlightData(List<FlashlightDataDO> flashlightDataDOs);
    void insertFlashlightData(FlashlightDataDO flashlightDataDO);

    // RiceCookerData
    List<RiceCookerDataDO> getRiceCookerData(String htmlName);
    List<RiceCookerDataDO> getRiceCookerData(String htmlName, String userName);
    List<RiceCookerDataDO> getRiceCookerData(String htmlName, Integer ith);
    List<RiceCookerDataDO> getRiceCookerData(String htmlName, String userName, Integer ith);
    void batchInsertRiceCookerData(List<RiceCookerDataDO> riceCookerDataDOs);
    void insertRiceCookerData(RiceCookerDataDO riceCookerDataDO);

    // CoffeeMachineData
    List<CoffeeMachineDataDO> getCoffeeMachineData(String htmlName);
    List<CoffeeMachineDataDO> getCoffeeMachineData(String htmlName, String userName);
    List<CoffeeMachineDataDO> getCoffeeMachineData(String htmlName, Integer ith);
    List<CoffeeMachineDataDO> getCoffeeMachineData(String htmlName, String userName, Integer ith);
    void batchInsertCoffeeMachineData(List<CoffeeMachineDataDO> coffeeMachineDataDOs);
    void insertCoffeeMachineData(CoffeeMachineDataDO coffeeMachineDataDO);

    // FruitTeaData
    List<FruitTeaDataDO> getFruitTeaData(String htmlName);
    List<FruitTeaDataDO> getFruitTeaData(String htmlName, String userName);
    List<FruitTeaDataDO> getFruitTeaData(String htmlName, Integer ith);
    List<FruitTeaDataDO> getFruitTeaData(String htmlName, String userName, Integer ith);
    void batchInsertFruitTeaData(List<FruitTeaDataDO> fruitTeaDataDOs);
    void insertFruitTeaData(FruitTeaDataDO fruitTeaDataDO);

    // CameraControllerData
    List<CameraControllerDataDO> getCameraControllerData(String htmlName);
    List<CameraControllerDataDO> getCameraControllerData(String htmlName, String userName);
    List<CameraControllerDataDO> getCameraControllerData(String htmlName, Integer ith);
    List<CameraControllerDataDO> getCameraControllerData(String htmlName, String userName, Integer ith);
    void batchInsertCameraControllerData(List<CameraControllerDataDO> cameraControllerDataDOs);
    void insertCameraControllerData(CameraControllerDataDO cameraControllerDataDO);

    // SeatsScheduleData
    List<SeatsScheduleDataDO> getSeatsScheduleData(String htmlName);
    List<SeatsScheduleDataDO> getSeatsScheduleData(String htmlName, String userName);
    List<SeatsScheduleDataDO> getSeatsScheduleData(String htmlName, Integer ith);
    List<SeatsScheduleDataDO> getSeatsScheduleData(String htmlName, String userName, Integer ith);
    void batchInsertSeatsScheduleData(List<SeatsScheduleDataDO> seatsScheduleDataDOs);
    void insertSeatsScheduleData(SeatsScheduleDataDO seatsScheduleDataDO);

    // SunlightControllerData
    List<SunlightControllerDataDO> getSunlightControllerData(String htmlName);
    List<SunlightControllerDataDO> getSunlightControllerData(String htmlName, String userName);
    List<SunlightControllerDataDO> getSunlightControllerData(String htmlName, Integer ith);
    List<SunlightControllerDataDO> getSunlightControllerData(String htmlName, String userName, Integer ith);
    void batchInsertSunlightControllerData(List<SunlightControllerDataDO> sunlightControllerDataDOs);
    void insertSunlightControllerData(SunlightControllerDataDO sunlightControllerDataDO);

    // SaunaControllerData
    List<SaunaControllerDataDO> getSaunaControllerData(String htmlName);
    List<SaunaControllerDataDO> getSaunaControllerData(String htmlName, String userName);
    List<SaunaControllerDataDO> getSaunaControllerData(String htmlName, Integer ith);
    List<SaunaControllerDataDO> getSaunaControllerData(String htmlName, String userName, Integer ith);
    void batchInsertSaunaControllerData(List<SaunaControllerDataDO> saunaControllerDataDOs);
    void insertSaunaControllerData(SaunaControllerDataDO saunaControllerDataDO);
}
