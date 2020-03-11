package com.lzf.mybatis;

import com.lzf.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/11
 * @Description:com.qst.domain.com.qst.mybatis
 * @version:1.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        //指定全局配置文件路径
        String resource = "mybatis-config.xml";
        //获取输入流，关联全局配置文件
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //构建 sqlSessionFactory 工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        /*
        参数：
        Mapper文件的namespace + SQL语句的id
        SQL语句需要的参数
         */
        User user = sqlSession.selectOne("userMapper.queryById", 3L);
        System.out.println(user);
    }
}
