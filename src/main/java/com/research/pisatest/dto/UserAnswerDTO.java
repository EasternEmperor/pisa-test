package com.research.pisatest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zhongqilong
 * @date 2024/8/4 17:38
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAnswerDTO {
    private Long id;

    private String userName;

    private Integer ithAnswer;

    private LocalDateTime testBegin;

    private LocalDateTime testEnd;
}
