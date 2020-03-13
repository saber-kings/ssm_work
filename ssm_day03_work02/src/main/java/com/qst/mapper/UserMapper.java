package com.qst.mapper;

import com.qst.domain.User;
import org.apache.ibatis.annotations.Param;

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
    //根据id 删除用户
    void deleteUser(Long id);
    //根据用户名和密码查询
    User findUP(@Param("userName") String userName, @Param("password") String password);
    //模糊查询
    List<User> findByName(@Param("name") String name);
}
