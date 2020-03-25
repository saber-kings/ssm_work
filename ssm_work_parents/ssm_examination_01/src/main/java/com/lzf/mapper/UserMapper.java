package com.lzf.mapper;

import com.lzf.domain.User;

import java.util.List;

/**
 * @Author: Saber污妖王
 * TODO: userMapper 接口
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/25
 * @Package: com.lzf.mapper
 * @Version: 0.0.1
 */
public interface UserMapper {
    /**
     * 查询所有用户
     * @return 用户List集合
     */
    List<User> findAll();
}
