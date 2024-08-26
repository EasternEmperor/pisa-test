package com.research.pisatest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhongqilong
 * @date 2024/8/12 00:31
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionDTO {
    private Long id;

    private Integer no;

    private String htmlName;

    private String dataTable;
}
