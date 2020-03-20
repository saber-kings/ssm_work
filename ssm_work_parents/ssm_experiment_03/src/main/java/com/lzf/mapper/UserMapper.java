package com.lzf.mapper;

import com.lzf.domain.User;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/20
 * @Description:com.lzf.mapper
 * @version:1.0
 */
public interface UserMapper {
    // 根据编号查询用户信息
    public User queryUserById(Integer id);
}
