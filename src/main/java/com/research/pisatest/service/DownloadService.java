package com.research.pisatest.service;

import com.research.pisatest.query.DownloadInfo;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/10 21:40
 * @description
 */
public interface DownloadService {
    XSSFWorkbook dataPrepare(List<Object> datas, DownloadInfo downloadInfo);

    void dataExport(HttpServletResponse response, List<Object> datas, DownloadInfo downloadInfo);
}
