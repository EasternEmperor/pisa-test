package com.research.pisatest.utils;

import com.research.pisatest.common.Constants;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhongqilong
 * @date 2024/7/26 19:47
 * @description
 */
@Data
@NoArgsConstructor
public class Result<T> {
    private String code;
    private String message;
    private T data;

    public Result(T data) {
        this.data = data;
    }

    public static Result success() {
        Result result = new Result<>();
        result.setCode("0");
        result.setMessage("成功");
        return result;
    }
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>(data);
        result.setCode(Constants.SUCCESSCODE);
        result.setMessage("成功");
        return result;
    }

    public static <T> Result<T> success(T data,String msg) {
        Result<T> result = new Result<>(data);
        result.setCode(Constants.SUCCESSCODE);
        result.setMessage(msg);
        return result;
    }

    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
