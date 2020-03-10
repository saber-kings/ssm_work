package com.lzf.dao.impl;

import com.lzf.dao.UserDao;
import com.lzf.domain.User;
import com.lzf.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/10
 * @Description:com.lzf.dao.impl
 * @version:1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findAll() throws SQLException {
        //得到SQL语句的操作对象，可以设置查询结果集的封装策略，线程安全
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

        //定义SQL语句
        String sql = "select * from user;";
        //执行SQL语句操作对象的查询方法，去得到数据库执行select语句的结果集，
        //返回的是List集合，通过第二个参数可定义结果集（即List集合存储的是User对象）
        List<User> query = qr.query(sql, new BeanListHandler<User>(User.class));

        //返回结果集
        return query;
    }
}
