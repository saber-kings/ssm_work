package com.qst.mapper;

import com.qst.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/12
 * @Description:com.qst.mapper
 * @version:1.0
 */
public class UserMapperTest {

    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //使用sqlSession对象创建mapper接口代理对象
        userMapper = sqlSession.getMapper(UserMapper.class);
        //UserMapper的代理类：org.apache.ibatis.binding.MapperProxy@3e57cd70
        System.out.println(userMapper);
    }

    @Test
    public void queryById() {
        User user = userMapper.queryById(1L);
        System.out.println(user);
    }

    @Test
    public void findAll() {
        List<User> userList = userMapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void deleteUser() {
        userMapper.deleteUser(3L);
    }

    @Test
    public void findUP() {
        User user = userMapper.findUP("Saber", "saber_king");
        System.out.println(user);
    }

    @Test
    public void findByName() {
        List<User> userList = userMapper.findByName("吉");
        for (User user : userList) {
            System.out.println(user);
        }
    }
}






