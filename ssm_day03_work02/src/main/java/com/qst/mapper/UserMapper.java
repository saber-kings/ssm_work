package com.qst.mapper;

import com.qst.domain.User;

import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/12
 * @Description:com.qst.domain.com.qst.mapper
 * @version:1.0
 */
public interface UserMapper {
    //根据编号 查询用户
    User queryById(Long id);
    //查询所有用户
    List<User> findAll();
}
