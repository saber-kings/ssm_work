package com.lzf.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Saber污妖王
 * TODO: Mapper 接口测试类
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/27
 * @Package: com.lzf.mapper
 * @Version: 0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void out() {
        accountMapper.out("Tom",50.0);
    }

    @Test
    public void in() {
        accountMapper.in("Cat",50.0);
    }
}