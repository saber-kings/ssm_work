package com.lzf.service.impl;

import com.lzf.dao.UserDao;
import com.lzf.dao.impl.UserDaoImpl;
import com.lzf.domain.User;
import com.lzf.service.UserService;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/10
 * @Description:com.lzf.service.impl
 * @version:1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        //实例化Dao数据访问层对象，用于访问数据库，对数据库中的数据进行操作
        UserDao ud = new UserDaoImpl();

        //定义一个用户List集合，用于接收从数据库中查询出来的用户信息
        List<User> list = null;
        try {
            //执行UserDao中的findAll()方法，去数据库中查询所有用户
            list = ud.findAll();
        } catch (SQLException e) {
            //捕获异常
            e.printStackTrace();
        }

        //返回用户List集合
        return list;
    }
}
