package com.lzf.service;

import com.lzf.domain.User;
import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/9
 * @Description:com.qst.service
 * @version:1.0
 */
public interface UserService {
    /**
     * 定义查询所有用户的方法
     * @return
     */
    List<User> findAll();
}
