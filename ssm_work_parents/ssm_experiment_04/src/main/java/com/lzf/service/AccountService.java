package com.lzf.service;

import com.lzf.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Saber污妖王
 * TODO:类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/23
 * @Description: Service 业务处理
 * @Package: com.lzf.service
 * @Version: 0.0.1
 */
@Service
public class AccountService {

    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outUser, String inUser, double money) {
        accountDao.out(outUser, money);
        accountDao.in(inUser, money);
    }
}
