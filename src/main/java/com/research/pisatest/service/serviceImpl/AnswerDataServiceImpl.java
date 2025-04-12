package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IAnswerDataAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.common.DataTableEnum;
import com.research.pisatest.entity.AnswerData;
import com.research.pisatest.exception.AnswerDataException;
import com.research.pisatest.exception.PisaTestException;
import com.research.pisatest.exception.QuestionException;
import com.research.pisatest.mapper.QuestionDOMapper;
import com.research.pisatest.pojo.*;
import com.research.pisatest.repository.IAnswerDataRepository;
import com.research.pisatest.service.AnswerDataService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerDataServiceImpl implements AnswerDataService {

    @Autowired
    private QuestionDOMapper questionDOMapper;

    @Autowired
    private IAnswerDataRepository answerDataRepository;

    @Autowired
    private IAnswerDataAssembler answerDataAssembler;

    /**
     * 获取所有用户对于题目htmlName的答题数据
     * @param htmlName
     * @return
     */
    @Override
    public List<AnswerData> getAnswerData(String htmlName, String userName, Integer ithAnswer) {
        if (StringUtils.isBlank(userName) || ithAnswer == null) {
            throw new AnswerDataException("获取题目数据失败：userName 或 ithAnswer 为空");
        }
        // 获取该题目答题数据表名
        QuestionDOExample example = new QuestionDOExample();
        example.createCriteria().andHtmlNameEqualTo(htmlName);
        List<QuestionDO> questionDOList = questionDOMapper.selectByExample(example);
        if (questionDOList.isEmpty()) {
            throw new QuestionException("没有找到题目：" + htmlName);
        }
        String tableName = questionDOList.get(0).getDataTable();
        // 查询该题目答题数据
        DataTableEnum dataTableEnum = DataTableEnum.getEnumByTableName(tableName);
        List<AnswerData> answerDataList = switch (dataTableEnum) {
            case AIR_CONDITIONER_DATA -> {
                List<AirControllerDataDO> airControllerDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        airControllerDataDOList = answerDataRepository.getAirControllerData(htmlName);
                    } else {
                        airControllerDataDOList = answerDataRepository.getAirControllerData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        airControllerDataDOList = answerDataRepository.getAirControllerData(htmlName, userName);
                    } else {
                        airControllerDataDOList = answerDataRepository.getAirControllerData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.airConditionerDataDOListToEntityList(airControllerDataDOList);
            }
            case TICKETS_SALE_DATA -> {
                List<TicketsSaleDataDO> ticketsSaleDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        ticketsSaleDataDOList = answerDataRepository.getTicketsSaleData(htmlName);
                    } else {
                        ticketsSaleDataDOList = answerDataRepository.getTicketsSaleData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        ticketsSaleDataDOList = answerDataRepository.getTicketsSaleData(htmlName, userName);
                    } else {
                        ticketsSaleDataDOList = answerDataRepository.getTicketsSaleData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.ticketsSaleDataDOListToEntityList(ticketsSaleDataDOList);
            }
            case CAT_FEED_DATA -> {
                List<CatFeedDataDO> catFeedDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        catFeedDataDOList = answerDataRepository.getCatFeedData(htmlName);
                    } else {
                        catFeedDataDOList = answerDataRepository.getCatFeedData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        catFeedDataDOList = answerDataRepository.getCatFeedData(htmlName, userName);
                    } else {
                        catFeedDataDOList = answerDataRepository.getCatFeedData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.catFeedDataDOListToEntityList(catFeedDataDOList);
            }
            case BIG_AIR_DATA -> {
                List<BigAirControllerDataDO> bigAirControllerDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        bigAirControllerDataDOList = answerDataRepository.getBigAirControllerData(htmlName);
                    } else {
                        bigAirControllerDataDOList = answerDataRepository.getBigAirControllerData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        bigAirControllerDataDOList = answerDataRepository.getBigAirControllerData(htmlName, userName);
                    } else {
                        bigAirControllerDataDOList = answerDataRepository.getBigAirControllerData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.bigAirControllerDataDOListToEntityList(bigAirControllerDataDOList);
            }
            case FLASHLIGHT_DATA -> {
                List<FlashlightDataDO> flashlightDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        flashlightDataDOList = answerDataRepository.getFlashlightData(htmlName);
                    } else {
                        flashlightDataDOList = answerDataRepository.getFlashlightData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        flashlightDataDOList = answerDataRepository.getFlashlightData(htmlName, userName);
                    } else {
                        flashlightDataDOList = answerDataRepository.getFlashlightData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.flashlightDataDOListToEntityList(flashlightDataDOList);
            }
            case FRUIT_TEA_DATA -> {
                List<FruitTeaDataDO> fruitTeaDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        fruitTeaDataDOList = answerDataRepository.getFruitTeaData(htmlName);
                    } else {
                        fruitTeaDataDOList = answerDataRepository.getFruitTeaData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        fruitTeaDataDOList = answerDataRepository.getFruitTeaData(htmlName, userName);
                    } else {
                        fruitTeaDataDOList = answerDataRepository.getFruitTeaData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.fruitTeaDataDOListToEntityList(fruitTeaDataDOList);
            }
            case RICE_COOKER_DATA -> {
                List<RiceCookerDataDO> riceCookerDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        riceCookerDataDOList = answerDataRepository.getRiceCookerData(htmlName);
                    } else {
                        riceCookerDataDOList = answerDataRepository.getRiceCookerData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        riceCookerDataDOList = answerDataRepository.getRiceCookerData(htmlName, userName);
                    } else {
                        riceCookerDataDOList = answerDataRepository.getRiceCookerData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.riceCookerDataDOListToEntityList(riceCookerDataDOList);
            }
            case VIDEO_PLAYER_DATA -> {
                List<VideoPlayerDataDO> videoPlayerDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        videoPlayerDataDOList = answerDataRepository.getVideoPlayerData(htmlName);
                    } else {
                        videoPlayerDataDOList = answerDataRepository.getVideoPlayerData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        videoPlayerDataDOList = answerDataRepository.getVideoPlayerData(htmlName, userName);
                    } else {
                        videoPlayerDataDOList = answerDataRepository.getVideoPlayerData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.videoPlayerDataDOListToEntityList(videoPlayerDataDOList);
            }
            case FLOWER_GARDEN_DATA -> {
                List<FlowerGardenDataDO> flowerGardenDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        flowerGardenDataDOList = answerDataRepository.getFlowerGardenData(htmlName);
                    } else {
                        flowerGardenDataDOList = answerDataRepository.getFlowerGardenData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        flowerGardenDataDOList = answerDataRepository.getFlowerGardenData(htmlName, userName);
                    } else {
                        flowerGardenDataDOList = answerDataRepository.getFlowerGardenData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.flowerGardenDataDOListToEntityList(flowerGardenDataDOList);
            }
            case PERFUME_MAKER_DATA -> {
                List<PerfumeMakerDataDO> perfumeMakerDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        perfumeMakerDataDOList = answerDataRepository.getPerfumeMakerData(htmlName);
                    } else {
                        perfumeMakerDataDOList = answerDataRepository.getPerfumeMakerData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        perfumeMakerDataDOList = answerDataRepository.getPerfumeMakerData(htmlName, userName);
                    } else {
                        perfumeMakerDataDOList = answerDataRepository.getPerfumeMakerData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.perfumeMakerDataDOListToEntityList(perfumeMakerDataDOList);
            }
            case COFFEE_MACHINE_DATA -> {
                List<CoffeeMachineDataDO> coffeeMachineDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        coffeeMachineDataDOList = answerDataRepository.getCoffeeMachineData(htmlName);
                    } else {
                        coffeeMachineDataDOList = answerDataRepository.getCoffeeMachineData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        coffeeMachineDataDOList = answerDataRepository.getCoffeeMachineData(htmlName, userName);
                    } else {
                        coffeeMachineDataDOList = answerDataRepository.getCoffeeMachineData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.coffeeMachineDataDOListToEntityList(coffeeMachineDataDOList);
            }
            case WATER_DISPENSER_DATA -> {
                List<WaterDispenserDataDO> waterDispenserDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        waterDispenserDataDOList = answerDataRepository.getWaterDispenserData(htmlName);
                    } else {
                        waterDispenserDataDOList = answerDataRepository.getWaterDispenserData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        waterDispenserDataDOList = answerDataRepository.getWaterDispenserData(htmlName, userName);
                    } else {
                        waterDispenserDataDOList = answerDataRepository.getWaterDispenserData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.waterDispenserDataDOListToEntityList(waterDispenserDataDOList);
            }
            case CAMERA_CONTROLLER_DATA -> {
                List<CameraControllerDataDO> cameraControllerDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        cameraControllerDataDOList = answerDataRepository.getCameraControllerData(htmlName);
                    } else {
                        cameraControllerDataDOList = answerDataRepository.getCameraControllerData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        cameraControllerDataDOList = answerDataRepository.getCameraControllerData(htmlName, userName);
                    } else {
                        cameraControllerDataDOList = answerDataRepository.getCameraControllerData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.cameraControllerDataDOListToEntityList(cameraControllerDataDOList);
            }
            case PROJECTION_CONTROLLER_DATA -> {
                List<ProjectionControllerDataDO> projectionControllerDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        projectionControllerDataDOList = answerDataRepository.getProjectionControllerData(htmlName);
                    } else {
                        projectionControllerDataDOList = answerDataRepository.getProjectionControllerData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        projectionControllerDataDOList = answerDataRepository.getProjectionControllerData(htmlName, userName);
                    } else {
                        projectionControllerDataDOList = answerDataRepository.getProjectionControllerData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.projectionControllerDataDOListToEntityList(projectionControllerDataDOList);
            }
            case SEATS_SCHEDULE_DATA -> {
                List<SeatsScheduleDataDO> seatsScheduleDataDOList = null;
                if (Constants.ALL.equals(userName)) {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        seatsScheduleDataDOList = answerDataRepository.getSeatsScheduleData(htmlName);
                    } else {
                        seatsScheduleDataDOList = answerDataRepository.getSeatsScheduleData(htmlName, ithAnswer);
                    }
                } else {
                    if (Constants.ALL.equals(String.valueOf(ithAnswer))) {
                        seatsScheduleDataDOList = answerDataRepository.getSeatsScheduleData(htmlName, userName);
                    } else {
                        seatsScheduleDataDOList = answerDataRepository.getSeatsScheduleData(htmlName, userName, ithAnswer);
                    }
                }
                yield answerDataAssembler.seatsScheduleDataDOListToEntityList(seatsScheduleDataDOList);
            }
            default -> throw new AnswerDataException("没有符合的题目：" + htmlName);
        };
        // 设置每个AnswerData对象的表名属性为dataTableEnum的索引值
        for (AnswerData answerData : answerDataList) {
            answerData.setTableName(dataTableEnum.getIndex());
        }
        return answerDataList;
    }
}
