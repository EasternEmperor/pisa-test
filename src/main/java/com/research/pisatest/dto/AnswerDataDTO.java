package com.research.pisatest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zhongqilong
 * @date 2024/8/19 22:33
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDataDTO {
    private Long id;

    private Integer tableName;

    private String htmlName;

    private String userName;

    private Integer ithAnswer;

    private String event;

    private String eventType;

    private LocalDateTime eventStartTime;

    private Integer eventNumber;

    private String topSetting;

    private String centralSetting;

    private String bottomSetting;

    private String lastSetting;

    // 空调
    private String tempValue;
    private String humidValue;

    // 铁路购票
    private String network;
    private String fareType;
    private String ticketType;
    private String numberTrips;

    // 喂猫器
    private String foodValue;
    private String waterValue;

    // 香水
    private String concentrationValue;
    private String lastTimeValue;

    // 投影
    private String definitionValue;
    private String projectionValue;

    // 饮水机
    private String volumeValue;
//    private String tempValue;
    private String speedValue;

    // 视频播放器
//    private String speedValue;
//    private String volumeValue;
    private String qualityValue;

    // 大空调
//    private String tempValue;
//    private String humidValue;
    private String windValue;

    // 花园
//    private String tempValue;
//    private String waterValue;
    private String fertilizerValue;

    // 手电筒
    private String distanceValue;
    private String brightnessValue;
    private String areaValue;

    // 电饭煲
    private String hardnessValue;
    private String sweetnessValue;
    private String cookTimeValue;

    // 咖啡机
    private String capacityValue;
    private String bitternessValue;
//    private String sweetnessValue;
    private String consistenceValue;

    // 果茶
//    private String capacityValue;
//    private String tempValue;
//    private String sweetnessValue;
    private String pulpValue;

    // 照相机
//    private String brightnessValue;
//    private String definitionValue;
    private String virtualizationValue;
    private String rangeValue;

    // 座位安排
    private String choosePool;

    // 图表状态
    private String diagramState;

}
