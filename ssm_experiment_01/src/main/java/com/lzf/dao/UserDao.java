package com.lzf.dao;

import com.lzf.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/9
 * @Description:com.qst.dao
 * @version:1.0
 */
public interface UserDao {
    /**
     * 定义查询所有用户信息的方法
     * @return
     * @throws SQLException
     */
    List<User> findAll() throws SQLException;
}
