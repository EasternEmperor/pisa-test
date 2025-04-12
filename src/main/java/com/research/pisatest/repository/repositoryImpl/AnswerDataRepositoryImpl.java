package com.research.pisatest.repository.repositoryImpl;

import com.research.pisatest.exception.AnswerDataException;
import com.research.pisatest.mapper.*;
import com.research.pisatest.pojo.*;
import com.research.pisatest.repository.IAnswerDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/19 23:23
 * @description
 */
@Repository
public class AnswerDataRepositoryImpl implements IAnswerDataRepository {
    // 空调
    @Autowired
    private AirControllerDataDOMapper airControllerDataDOMapper;
    @Autowired
    private AirControllerDataDOExtMapper airControllerDataDOExtMapper;

    // 购票
    @Autowired
    private TicketsSaleDataDOMapper ticketsSaleDataDOMapper;
    @Autowired
    private TicketsSaleDataDOExtMapper ticketsSaleDataDOExtMapper;

    // 猫粮
    @Autowired
    private CatFeedDataDOMapper catFeedDataDOMapper;
    @Autowired
    private CatFeedDataDOExtMapper catFeedDataDOExtMapper;

    // 香水
    @Autowired
    private PerfumeMakerDataDOMapper perfumeMakerDataDOMapper;

    // 投影仪
    @Autowired
    private ProjectionControllerDataDOMapper projectionControllerDataDOMapper;

    // 饮水机
    @Autowired
    private WaterDispenserDataDOMapper waterDispenserDataDOMapper;

    // 视频播放器
    @Autowired
    private VideoPlayerDataDOMapper videoPlayerDataDOMapper;

    // 大空调
    @Autowired
    private BigAirControllerDataDOMapper bigAirControllerDataDOMapper;

    // 花园
    @Autowired
    private FlowerGardenDataDOMapper flowerGardenDataDOMapper;

    // 手电筒
    @Autowired
    private FlashlightDataDOMapper flashlightDataDOMapper;

    // 电饭煲
    @Autowired
    private RiceCookerDataDOMapper riceCookerDataDOMapper;

    // 咖啡机
    @Autowired
    private CoffeeMachineDataDOMapper coffeeMachineDataDOMapper;

    // 果茶
    @Autowired
    private FruitTeaDataDOMapper fruitTeaDataDOMapper;

    // 照相机
    @Autowired
    private CameraControllerDataDOMapper cameraControllerDataDOMapper;

    // 座位分配
    @Autowired
    private SeatsScheduleDataDOMapper seatsScheduleDataDOMapper;


    @Override
    public List<AirControllerDataDO> getAirControllerData(String htmlName) {
        AirControllerDataDOExample example = new AirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return airControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<AirControllerDataDO> getAirControllerData(String htmlName, String userName) {
        AirControllerDataDOExample example = new AirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return airControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<AirControllerDataDO> getAirControllerData(String htmlName, Integer ith) {
        AirControllerDataDOExample example = new AirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return airControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<AirControllerDataDO> getAirControllerData(String htmlName, String userName, Integer ith) {
        AirControllerDataDOExample example = new AirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return airControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName) {
        TicketsSaleDataDOExample example = new TicketsSaleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return ticketsSaleDataDOMapper.selectByExample(example);
    }

    @Override
    public List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, Integer ith) {
        TicketsSaleDataDOExample example = new TicketsSaleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return ticketsSaleDataDOMapper.selectByExample(example);
    }

    @Override
    public List<TicketsSaleDataDO> getTicketsSaleData(String htmlName, String userName, Integer ith) {
        TicketsSaleDataDOExample example = new TicketsSaleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return ticketsSaleDataDOMapper.selectByExample(example);
    }

    @Override
    public List<TicketsSaleDataDO> getTicketsSaleData(String htmlName) {
        TicketsSaleDataDOExample example = new TicketsSaleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return ticketsSaleDataDOMapper.selectByExample(example);
    }

    @Transactional
    @Override
    public void batchInsertAirControllerData(List<AirControllerDataDO> airControllerDataDOs) {
        airControllerDataDOExtMapper.batchInsert(airControllerDataDOs);
    }

    @Override
    public void insertAirControllerData(AirControllerDataDO airControllerDataDO) {
        airControllerDataDOMapper.insert(airControllerDataDO);
    }

    @Override
    public void insertTicketsSaleData(TicketsSaleDataDO ticketsSaleDataDO) {
        ticketsSaleDataDOMapper.insert(ticketsSaleDataDO);
    }

    @Transactional
    @Override
    public void batchInsertTicketsSaleData(List<TicketsSaleDataDO> ticketsSaleDataDOs) {
        ticketsSaleDataDOExtMapper.batchInsert(ticketsSaleDataDOs);
    }

    @Override
    public List<CatFeedDataDO> getCatFeedData(String htmlName) {
        CatFeedDataDOExample example = new CatFeedDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return catFeedDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CatFeedDataDO> getCatFeedData(String htmlName, String userName) {
        CatFeedDataDOExample example = new CatFeedDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return catFeedDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CatFeedDataDO> getCatFeedData(String htmlName, Integer ith) {
        CatFeedDataDOExample example = new CatFeedDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return catFeedDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CatFeedDataDO> getCatFeedData(String htmlName, String userName, Integer ith) {
        CatFeedDataDOExample example = new CatFeedDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return catFeedDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertCatFeedData(List<CatFeedDataDO> catFeedDataDOs) {
        catFeedDataDOExtMapper.batchInsert(catFeedDataDOs);
    }

    @Override
    public void insertCatFeedData(CatFeedDataDO catFeedDataDO) {
        catFeedDataDOMapper.insert(catFeedDataDO);
    }

    @Override
    public List<PerfumeMakerDataDO> getPerfumeMakerData(String htmlName) {
        PerfumeMakerDataDOExample example = new PerfumeMakerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return perfumeMakerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<PerfumeMakerDataDO> getPerfumeMakerData(String htmlName, String userName) {
        PerfumeMakerDataDOExample example = new PerfumeMakerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return perfumeMakerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<PerfumeMakerDataDO> getPerfumeMakerData(String htmlName, Integer ith) {
        PerfumeMakerDataDOExample example = new PerfumeMakerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return perfumeMakerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<PerfumeMakerDataDO> getPerfumeMakerData(String htmlName, String userName, Integer ith) {
        PerfumeMakerDataDOExample example = new PerfumeMakerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return perfumeMakerDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertPerfumeMakerData(List<PerfumeMakerDataDO> perfumeMakerDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertPerfumeMakerData(PerfumeMakerDataDO perfumeMakerDataDO) {
        perfumeMakerDataDOMapper.insert(perfumeMakerDataDO);
    }

    @Override
    public List<ProjectionControllerDataDO> getProjectionControllerData(String htmlName) {
        ProjectionControllerDataDOExample example = new ProjectionControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return projectionControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<ProjectionControllerDataDO> getProjectionControllerData(String htmlName, String userName) {
        ProjectionControllerDataDOExample example = new ProjectionControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return projectionControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<ProjectionControllerDataDO> getProjectionControllerData(String htmlName, Integer ith) {
        ProjectionControllerDataDOExample example = new ProjectionControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return projectionControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<ProjectionControllerDataDO> getProjectionControllerData(String htmlName, String userName, Integer ith) {
        ProjectionControllerDataDOExample example = new ProjectionControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return projectionControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertProjectionControllerData(List<ProjectionControllerDataDO> projectionControllerDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertProjectionControllerData(ProjectionControllerDataDO projectionControllerDataDO) {
        projectionControllerDataDOMapper.insert(projectionControllerDataDO);
    }

    @Override
    public List<WaterDispenserDataDO> getWaterDispenserData(String htmlName) {
        WaterDispenserDataDOExample example = new WaterDispenserDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return waterDispenserDataDOMapper.selectByExample(example);
    }

    @Override
    public List<WaterDispenserDataDO> getWaterDispenserData(String htmlName, String userName) {
        WaterDispenserDataDOExample example = new WaterDispenserDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return waterDispenserDataDOMapper.selectByExample(example);
    }

    @Override
    public List<WaterDispenserDataDO> getWaterDispenserData(String htmlName, Integer ith) {
        WaterDispenserDataDOExample example = new WaterDispenserDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return waterDispenserDataDOMapper.selectByExample(example);
    }

    @Override
    public List<WaterDispenserDataDO> getWaterDispenserData(String htmlName, String userName, Integer ith) {
        WaterDispenserDataDOExample example = new WaterDispenserDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return waterDispenserDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertWaterDispenserData(List<WaterDispenserDataDO> waterDispenserDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertWaterDispenserData(WaterDispenserDataDO waterDispenserDataDO) {
        waterDispenserDataDOMapper.insert(waterDispenserDataDO);
    }

    @Override
    public List<VideoPlayerDataDO> getVideoPlayerData(String htmlName) {
        VideoPlayerDataDOExample example = new VideoPlayerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return videoPlayerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<VideoPlayerDataDO> getVideoPlayerData(String htmlName, String userName) {
        VideoPlayerDataDOExample example = new VideoPlayerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return videoPlayerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<VideoPlayerDataDO> getVideoPlayerData(String htmlName, Integer ith) {
        VideoPlayerDataDOExample example = new VideoPlayerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return videoPlayerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<VideoPlayerDataDO> getVideoPlayerData(String htmlName, String userName, Integer ith) {
        VideoPlayerDataDOExample example = new VideoPlayerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return videoPlayerDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertVideoPlayerData(List<VideoPlayerDataDO> videoPlayerDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertVideoPlayerData(VideoPlayerDataDO videoPlayerDataDO) {
        videoPlayerDataDOMapper.insert(videoPlayerDataDO);
    }

    @Override
    public List<BigAirControllerDataDO> getBigAirControllerData(String htmlName) {
        BigAirControllerDataDOExample example = new BigAirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return bigAirControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<BigAirControllerDataDO> getBigAirControllerData(String htmlName, String userName) {
        BigAirControllerDataDOExample example = new BigAirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return bigAirControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<BigAirControllerDataDO> getBigAirControllerData(String htmlName, Integer ith) {
        BigAirControllerDataDOExample example = new BigAirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return bigAirControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<BigAirControllerDataDO> getBigAirControllerData(String htmlName, String userName, Integer ith) {
        BigAirControllerDataDOExample example = new BigAirControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return bigAirControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertBigAirControllerData(List<BigAirControllerDataDO> bigAirControllerDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertBigAirControllerData(BigAirControllerDataDO bigAirControllerDataDO) {
        bigAirControllerDataDOMapper.insert(bigAirControllerDataDO);
    }

    @Override
    public List<FlowerGardenDataDO> getFlowerGardenData(String htmlName) {
        FlowerGardenDataDOExample example = new FlowerGardenDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return flowerGardenDataDOMapper.selectByExample(example);
    }

    @Override
    public List<FlowerGardenDataDO> getFlowerGardenData(String htmlName, String userName) {
        FlowerGardenDataDOExample example = new FlowerGardenDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return flowerGardenDataDOMapper.selectByExample(example);
    }

    @Override
    public List<FlowerGardenDataDO> getFlowerGardenData(String htmlName, Integer ith) {
        FlowerGardenDataDOExample example = new FlowerGardenDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return flowerGardenDataDOMapper.selectByExample(example);
    }

    @Override
    public List<FlowerGardenDataDO> getFlowerGardenData(String htmlName, String userName, Integer ith) {
        FlowerGardenDataDOExample example = new FlowerGardenDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return flowerGardenDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertFlowerGardenData(List<FlowerGardenDataDO> flowerGardenDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertFlowerGardenData(FlowerGardenDataDO flowerGardenDataDO) {
        flowerGardenDataDOMapper.insert(flowerGardenDataDO);
    }

    @Override
    public List<FlashlightDataDO> getFlashlightData(String htmlName) {
        FlashlightDataDOExample example = new FlashlightDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return flashlightDataDOMapper.selectByExample(example);
    }

    @Override
    public List<FlashlightDataDO> getFlashlightData(String htmlName, String userName) {
        FlashlightDataDOExample example = new FlashlightDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return flashlightDataDOMapper.selectByExample(example);
    }

    @Override
    public List<FlashlightDataDO> getFlashlightData(String htmlName, Integer ith) {
        FlashlightDataDOExample example = new FlashlightDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return flashlightDataDOMapper.selectByExample(example);
    }

    @Override
    public List<FlashlightDataDO> getFlashlightData(String htmlName, String userName, Integer ith) {
        FlashlightDataDOExample example = new FlashlightDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return flashlightDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertFlashlightData(List<FlashlightDataDO> flashlightDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertFlashlightData(FlashlightDataDO flashlightDataDO) {
        flashlightDataDOMapper.insert(flashlightDataDO);
    }

    @Override
    public List<RiceCookerDataDO> getRiceCookerData(String htmlName) {
        RiceCookerDataDOExample example = new RiceCookerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return riceCookerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<RiceCookerDataDO> getRiceCookerData(String htmlName, String userName) {
        RiceCookerDataDOExample example = new RiceCookerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return riceCookerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<RiceCookerDataDO> getRiceCookerData(String htmlName, Integer ith) {
        RiceCookerDataDOExample example = new RiceCookerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return riceCookerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<RiceCookerDataDO> getRiceCookerData(String htmlName, String userName, Integer ith) {
        RiceCookerDataDOExample example = new RiceCookerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return riceCookerDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertRiceCookerData(List<RiceCookerDataDO> riceCookerDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertRiceCookerData(RiceCookerDataDO riceCookerDataDO) {
        riceCookerDataDOMapper.insert(riceCookerDataDO);
    }

    @Override
    public List<CoffeeMachineDataDO> getCoffeeMachineData(String htmlName) {
        CoffeeMachineDataDOExample example = new CoffeeMachineDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return coffeeMachineDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CoffeeMachineDataDO> getCoffeeMachineData(String htmlName, String userName) {
        CoffeeMachineDataDOExample example = new CoffeeMachineDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return coffeeMachineDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CoffeeMachineDataDO> getCoffeeMachineData(String htmlName, Integer ith) {
        CoffeeMachineDataDOExample example = new CoffeeMachineDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return coffeeMachineDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CoffeeMachineDataDO> getCoffeeMachineData(String htmlName, String userName, Integer ith) {
        CoffeeMachineDataDOExample example = new CoffeeMachineDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return coffeeMachineDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertCoffeeMachineData(List<CoffeeMachineDataDO> coffeeMachineDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertCoffeeMachineData(CoffeeMachineDataDO coffeeMachineDataDO) {
        coffeeMachineDataDOMapper.insert(coffeeMachineDataDO);
    }

    @Override
    public List<FruitTeaDataDO> getFruitTeaData(String htmlName) {
        FruitTeaDataDOExample example = new FruitTeaDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return fruitTeaDataDOMapper.selectByExample(example);
    }

    @Override
    public List<FruitTeaDataDO> getFruitTeaData(String htmlName, String userName) {
        FruitTeaDataDOExample example = new FruitTeaDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return fruitTeaDataDOMapper.selectByExample(example);
    }

    @Override
    public List<FruitTeaDataDO> getFruitTeaData(String htmlName, Integer ith) {
        FruitTeaDataDOExample example = new FruitTeaDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return fruitTeaDataDOMapper.selectByExample(example);
    }

    @Override
    public List<FruitTeaDataDO> getFruitTeaData(String htmlName, String userName, Integer ith) {
        FruitTeaDataDOExample example = new FruitTeaDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return fruitTeaDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertFruitTeaData(List<FruitTeaDataDO> fruitTeaDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertFruitTeaData(FruitTeaDataDO fruitTeaDataDO) {
        fruitTeaDataDOMapper.insert(fruitTeaDataDO);
    }

    @Override
    public List<CameraControllerDataDO> getCameraControllerData(String htmlName) {
        CameraControllerDataDOExample example = new CameraControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return cameraControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CameraControllerDataDO> getCameraControllerData(String htmlName, String userName) {
        CameraControllerDataDOExample example = new CameraControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return cameraControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CameraControllerDataDO> getCameraControllerData(String htmlName, Integer ith) {
        CameraControllerDataDOExample example = new CameraControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return cameraControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public List<CameraControllerDataDO> getCameraControllerData(String htmlName, String userName, Integer ith) {
        CameraControllerDataDOExample example = new CameraControllerDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return cameraControllerDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertCameraControllerData(List<CameraControllerDataDO> cameraControllerDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertCameraControllerData(CameraControllerDataDO cameraControllerDataDO) {
        cameraControllerDataDOMapper.insert(cameraControllerDataDO);
    }

    @Override
    public List<SeatsScheduleDataDO> getSeatsScheduleData(String htmlName) {
        SeatsScheduleDataDOExample example = new SeatsScheduleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        return seatsScheduleDataDOMapper.selectByExample(example);
    }

    @Override
    public List<SeatsScheduleDataDO> getSeatsScheduleData(String htmlName, String userName) {
        SeatsScheduleDataDOExample example = new SeatsScheduleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName);
        return seatsScheduleDataDOMapper.selectByExample(example);
    }

    @Override
    public List<SeatsScheduleDataDO> getSeatsScheduleData(String htmlName, Integer ith) {
        SeatsScheduleDataDOExample example = new SeatsScheduleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andIthAnswerEqualTo(ith);
        return seatsScheduleDataDOMapper.selectByExample(example);
    }

    @Override
    public List<SeatsScheduleDataDO> getSeatsScheduleData(String htmlName, String userName, Integer ith) {
        SeatsScheduleDataDOExample example = new SeatsScheduleDataDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName).andUserNameEqualTo(userName).andIthAnswerEqualTo(ith);
        return seatsScheduleDataDOMapper.selectByExample(example);
    }

    @Override
    public void batchInsertSeatsScheduleData(List<SeatsScheduleDataDO> seatsScheduleDataDOs) {
        throw new AnswerDataException("暂不支持批量插入～");
    }

    @Override
    public void insertSeatsScheduleData(SeatsScheduleDataDO seatsScheduleDataDO) {
        seatsScheduleDataDOMapper.insert(seatsScheduleDataDO);
    }
}
