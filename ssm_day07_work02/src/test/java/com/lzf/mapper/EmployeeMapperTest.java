package com.lzf.mapper;

import com.lzf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.lzf.mapper
 * @version:1.0
 */
public class EmployeeMapperTest {
    private EmployeeMapper employeeMapper;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
    }

    @Test
    public void queryEmp() {
        Employee employee = employeeMapper.queryEmp(1);
        System.out.println(employee);
    }
}