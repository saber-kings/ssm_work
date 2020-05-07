package com.lzf.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @Author: Saber污妖王
 * TODO: 账户操作接口
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/27
 * @Package: com.lzf.mapper
 * @Version: 0.0.1
 */
public interface AccountMapper {
    //出账
    void out(@Param("outAccount") String outAccount, @Param("money") Double money);

    //入账
    void in(@Param("inAccount") String inAccount, @Param("money") Double money);
}
