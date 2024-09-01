package com.research.pisatest.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhongqilong
 * @date 2024/9/1 11:42
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDataQuery {

    private String htmlName;

    private String userName;

    private Integer ithAnswer;

    private DownloadInfo downloadInfo;
}
