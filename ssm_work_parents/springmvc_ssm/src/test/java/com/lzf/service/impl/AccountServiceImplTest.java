package com.lzf.service.impl;

import com.lzf.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author: Saber污妖王
 * TODO: 类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/27
 * @Package: com.lzf.service.impl
 * @Version: 0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void transfer() {
        accountService.transfer("Cat", "Tom", 50.0);
    }
}