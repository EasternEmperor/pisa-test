package com.research.pisatest.service;

import com.research.pisatest.dto.UserAnswerDTO;
import com.research.pisatest.entity.DescInfo;
import java.util.List;

/**
 * @author zhongqilong
 * @date 2024/8/9 00:33
 * @description
 */
public interface AdminService {
    List<UserAnswerDTO> getUserAnswerList(String userName, Integer ith);

    DescInfo getDescInfo();

    List<String> getAllUserName();

    List<String> getAllAnswerNo();
}
