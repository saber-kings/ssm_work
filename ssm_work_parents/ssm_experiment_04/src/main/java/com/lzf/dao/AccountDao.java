package com.lzf.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: Saber污妖王
 * TODO:类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/23
 * @Description: Dao 数据交换
 * @Package: com.lzf.dao
 * @Version: 0.0.1
 */
@Repository
public class AccountDao {
    /**
     * 转入操作
     *
     * @param inUser 收钱方
     * @param money  转账额度
     */
    public void in(String inUser, double money) {
        System.out.println(inUser + "收到 " + money);
    }

    /**
     * 转出操作
     *
     * @param outUser 转钱方
     * @param money   转账额度
     */
    public void out(String outUser, double money) {
        System.out.println(outUser + "转出 " + money);
//        int i = 1 / 0;
    }
}
