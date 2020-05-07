package com.lzf.service.impl;

import com.lzf.mapper.AccountMapper;
import com.lzf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Saber污妖王
 * TODO: 转账业务实现
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/27
 * @Package: com.lzf.service.impl
 * @Version: 0.0.1
 */
@Service
public class AccountServiceImpl implements AccountService {
    private AccountMapper accountMapper;

    @Autowired
    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    //给当前方法增加事务，讲方法内的操作作为一个整体，要么都成功，要么都失败
    @Transactional
    @Override
    public void transfer(String outAccount, String inAccount, Double money) {
        //出账
        accountMapper.out(outAccount, money);
        //测试事务有，加异常
        int i = 1 / 0;
        //入账
        accountMapper.in(inAccount, money);
    }
}
