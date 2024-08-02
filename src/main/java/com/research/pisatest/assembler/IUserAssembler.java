package com.research.pisatest.assembler;

import com.research.pisatest.domain.User;
import com.research.pisatest.pojo.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author zhongqilong
 * @date 2024/7/27 00:45
 * @description
 */
@Mapper(componentModel = "spring")
public interface IUserAssembler {
    IUserAssembler INSTANCE = Mappers.getMapper(IUserAssembler.class);

    User UserDOToUser(UserDO userDO);
}
