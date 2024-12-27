package com.research.pisatest.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zhongqilong
 * @date 2024/8/3 11:32
 * @description
 */
@Data
public class UserAnswer {
    private Long id;

    private String userName;

    private Integer ithAnswer;

    private LocalDateTime testBegin;

    private LocalDateTime testEnd;
}
