package com.research.pisatest.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author zhongqilong
 * @date 2024/9/1 10:43
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DownloadInfo {
    /**
     * excel表头信息
     */
    private Map<String, String> headers;

    /**
     * excel文件名
     */
    private String fileName;

    /**
     * 文件类型，如：xls、xlsx、csv等
     */
    private String fileType;
}
