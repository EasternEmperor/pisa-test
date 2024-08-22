package com.research.pisatest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zhongqilong
 * @date 2024/8/19 22:50
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerData {
    private Long id;

    private Integer tableName;

    private String htmlName;

    private String userName;

    private Integer ithAnswer;

    private String event;

    private String eventType;

    private Date eventStartTime;

    private Integer eventNumber;

    private String topSetting;

    private String centralSetting;

    private String bottomSetting;

    private String tempValue;

    private String humidValue;

    private String network;

    private String fareType;

    private String ticketType;

    private String numberTrips;
}
