package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.exception.DownloadException;
import com.research.pisatest.query.DownloadInfo;
import com.research.pisatest.service.DownloadService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author zhongqilong
 * @date 2024/8/10 21:40
 * @description
 */
@Service
public class DownloadServiceImpl implements DownloadService {
    @Override
    public XSSFWorkbook dataPrepare(List<Object> datas, DownloadInfo downloadInfo) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Data");
            // excel文件表头名和对应的数据库字段名
            List<String> headers = new ArrayList<>();
            List<String> fields = new ArrayList<>();
            downloadInfo.getHeaders().forEach((key, value) -> {
                headers.add(key);
                fields.add(value);
            });
            writeHeader(sheet, headers);
            // 写入数据
            int rowNum = 1;
            // 日期格式化
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for (Object data : datas) {
                Row row = sheet.createRow(rowNum);
                for (int i = 0; i < fields.size(); i++) {
                    Field field = data.getClass().getDeclaredField(fields.get(i));
                    field.setAccessible(true);
                    Object value = field.get(data);
                    // 处理日期格式
                    if (value instanceof Date) {
                        row.createCell(i).setCellValue(dateFormat.format((Date) value));
                    } else {
                        row.createCell(i).setCellValue(value != null ? value.toString() : "NULL");
                    }
                }
                rowNum++;
            }
            return workbook;
        } catch (Exception e) {
            throw new DownloadException("数据准备失败", e);
        }

    }

    @Override
    public void dataExport(HttpServletResponse response, List<Object> datas, DownloadInfo downloadInfo) {
        try {
            XSSFWorkbook workbook = dataPrepare(datas, downloadInfo);
            String fileName = URLEncoder.encode(downloadInfo.getFileName() + "." + downloadInfo.getFileType(), "UTF-8");
            OutputStream outputStream = response.getOutputStream();
            // 设置响应头
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            // 写入数据
            workbook.write(outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            throw new DownloadException(e.getMessage(), e);
        }
    }

    private void writeHeader(Sheet sheet, List<String> headers) {
        Row row = sheet.createRow(0);
        for (int i = 0; i < headers.size(); i++) {
            row.createCell(i).setCellValue(headers.get(i));
        }
    }
}
