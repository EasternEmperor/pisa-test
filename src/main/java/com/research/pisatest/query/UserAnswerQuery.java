package com.research.pisatest.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhongqilong
 * @date 2024/9/1 10:42
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAnswerQuery {
    private String userName;

    private Integer ith;

    private DownloadInfo downloadInfo;
}
