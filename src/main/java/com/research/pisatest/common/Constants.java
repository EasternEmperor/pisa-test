package com.research.pisatest.common;

/**
 * @author zhongqilong
 * @date 2024/7/26 19:30
 * @description
 */
public class Constants {
    public static final String USER_PATTERN = "[a-z]+[0-9]{8}";
    public static final String COMMON_USER = "0";
    public static final String ADMIN = "1";

    public static final String ERROR_CODE = "-1";
    public static final String SUCCESS_CODE = "0";

    // 登录身份有效时间：1天
    public static final int TTL = 1;

    // 筛选器的全部
    public static final String ALL = "-1";

    // 被删除的题目题号
    public static final int DELETE_QUESTION_NO = -1;

}
