package com.research.pisatest.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author zhongqilong
 * @description 答题会话级通用查询（跨题库数据表的动态查询）
 */
public interface AnswerSessionExtMapper {

    /**
     * 统计某次答题中某题的已完成事件数（END_ITEM / TIME_UP）
     * @param tableName 题目答题数据表名（服务端从题库配置中解析，非外部输入）
     */
    int countCompletedEvents(@Param("tableName") String tableName,
                             @Param("userName") String userName,
                             @Param("ithAnswer") Integer ithAnswer,
                             @Param("htmlName") String htmlName);

    /**
     * 查询某次答题中最远的已作答题号（跨全部题库数据表）
     * @return 最大题号；本次答题尚无任何作答记录时返回 null
     */
    java.lang.Integer selectMaxAnsweredNo(@Param("userName") String userName,
                                          @Param("ithAnswer") Integer ithAnswer);

    /**
     * 查询用户出现过的最大答题轮次（跨全部题库数据表，含中断未完成的轮次）
     * @return 最大轮次；从未作答过返回 null
     */
    java.lang.Integer selectMaxIthAnswer(@Param("userName") String userName);
}
