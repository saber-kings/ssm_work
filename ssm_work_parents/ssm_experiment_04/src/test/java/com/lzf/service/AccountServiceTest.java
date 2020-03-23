package com.lzf.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author: Saber污妖王
 * TODO:类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/23
 * @Description: 测试类
 * @Package: com.lzf.service
 * @Version: 0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void transfer() {
        accountService.transfer("马云","栾兆飞",1000000);
    }
}