package com.research.pisatest.service.serviceImpl;

import com.research.pisatest.assembler.IUserAnswerAssembler;
import com.research.pisatest.common.Constants;
import com.research.pisatest.dto.UserAnswerDTO;
import com.research.pisatest.entity.DescInfo;
import com.research.pisatest.entity.UserAnswer;
import com.research.pisatest.exception.PisaTestException;
import com.research.pisatest.pojo.UserAnswerDO;
import com.research.pisatest.pojo.UserDO;
import com.research.pisatest.repository.IUserAnswerRepository;
import com.research.pisatest.repository.IUserRepository;
import com.research.pisatest.service.AdminService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zhongqilong
 * @date 2024/8/9 00:33
 * @description
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IUserAnswerAssembler userAnswerAssembler;

    @Autowired
    private IUserAnswerRepository userAnswerRepository;

    /**
     * 查询所有用户名
     * @return
     */
    @Override
    public List<String> getAllUserName() {
        List<UserDO> userDOList = userRepository.selectAllUserName();
        List<String> res = userDOList.stream().map(UserDO::getUserName).collect(Collectors.toList());
        res.add(Constants.ALL);
        return res;
    }

    /**
     * 查询所有答题记录
     * @return
     */
    @Override
    public Set<String> getUserAnswerNo(String userName) {
        List<UserAnswerDO> userAnswerDOList = new ArrayList<>();
        if (Constants.ALL.equals(userName)) {
            userAnswerDOList = userAnswerRepository.selectAllAnswerNo();
        } else {
            userAnswerDOList = userAnswerRepository.selectAnswerNo(userName);
        }
        Set<String> res =  userAnswerDOList.stream().map(userAnswerDO -> String.valueOf(userAnswerDO.getIthAnswer())).collect(Collectors.toSet());
        res.add(Constants.ALL);
        return res;
    }

    /**
     * 查询用户的答题记录
     * @return
     */
    @Override
    public List<UserAnswerDTO> getUserAnswerList(String userName, Integer ith) {
        if (StringUtils.isBlank(userName) || ith == null) {
            throw new PisaTestException("获取用户答题记录：userName 或 ith 为空");
        }
        List<UserAnswer> userAnswers = null;
        if (Constants.ALL.equals(userName)) {
            if (Constants.ALL.equals(String.valueOf(ith))) {
                userAnswers = userAnswerRepository.selectAllUserAnswer();
            } else {
                userAnswers = userAnswerRepository.selectUserAnswerByIth(ith);
            }
        } else {
            if (Constants.ALL.equals(String.valueOf(ith))) {
                userAnswers = userAnswerRepository.selectUserAnswerByUserName(userName);
            } else {
                userAnswers = userAnswerRepository.selectUserAnswerByUserNameAndIth(userName, ith);
            }
        }
        List<UserAnswerDTO> userAnswerDTOS = userAnswerAssembler.toUserAnswerDTOList(userAnswers);
        return userAnswerDTOS;
    }

    @Override
    public DescInfo getDescInfo() {
        return userRepository.getSystemDescInfo();
    }
}
