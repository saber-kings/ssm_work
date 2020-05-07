package com.lzf.service;

/**
 * @Author: Saber污妖王
 * TODO: 转账业务层接口
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/27
 * @Package: com.lzf.service
 * @Version: 0.0.1
 */
public interface AccountService {
    //转账
    void transfer(String outAccount, String inAccount, Double money);
}
