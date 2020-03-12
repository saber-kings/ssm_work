package com.qst.dao.impl;

import com.qst.dao.UserDao;
import com.qst.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/12
 * @Description:com.qst.dao.impl
 * @version:1.0
 */
public class UserDaoImplTest {

    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
        //指定全局配置文件路径
        String resource = "mybatis-config.xml";
        //获取输入流，关联全局配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //构建 sqlSessionFactory 工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //将 sqlSession 传给userDao实现类实例化
        userDao = new UserDaoImpl(sqlSession);
    }

    @Test
    public void queryUserById() {
        User user = userDao.queryUserById(1L);
        System.out.println(user);
    }

    @Test
    public void queryUserList() {
        List<User> users = userDao.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUserName("dongfangbubai");
        user.setPassword("dongfangjiaozhu");
        user.setName("东方不败");
        user.setAge(35);
        user.setSex(1);
        Date birthday = null;
        try {
            birthday = new SimpleDateFormat("yyyy-MM-dd").parse("1985-10-10");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setBirthday(birthday);
        Date date = new Date();
        user.setCreated(date);
        user.setUpdated(date);
        userDao.insertUser(user);
    }

    @Test
    public void updateUser() {
        User user = userDao.queryUserById(3L);
        user.setUserName("yqm");
        user.setName("叶轻眉");
        userDao.updateUser(user);
    }

    @Test
    public void deleteById() {
        userDao.deleteById(8L);
    }
}