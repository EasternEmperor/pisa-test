package com.research.pisatest.exception;

/**
 * @author zhongqilong
 * @date 2024/9/1 11:31
 * @description
 */
public class DownloadException extends RuntimeException {
    public DownloadException(String message, Throwable cause) {
        super(message, cause);
    }
}
