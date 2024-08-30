package com.research.pisatest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private Date eventStartTime;

    private Integer eventNumber;

    private String topSetting;

    private String centralSetting;

    private String bottomSetting;

    private String tempValue;

    private String humidValue;

    private String diagramState;

    private String network;

    private String fareType;

    private String ticketType;

    private String numberTrips;
}
