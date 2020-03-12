package com.qst.dao;
import com.qst.domain.User;
import java.util.List;
public interface UserDao {
    //根据编号 查询用户
    User queryUserById(Long id);
     //查询所有用户
    List<User> queryUserList();
     //添加用户
    void insertUser(User user);
     // 修改用户
    void updateUser(User user);
   //根据编号 删除客户
    void deleteById(Long id);
}

