package com.qst.dao.impl;

import com.qst.dao.UserDao;
import com.qst.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/12
 * @Description:com.qst.dao.impl
 * @version:1.0
 */
public class UserDaoImpl implements UserDao {

    private SqlSession sqlSession;

    /**
     * 获取sqlSession对象
     * @param sqlSession
     */
    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User queryUserById(Long id) {
        return sqlSession.selectOne("userMapper.queryUserById", id);
    }

    @Override
    public List<User> queryUserList() {
        return sqlSession.selectList("userMapper.queryUserList");
    }

    @Override
    public void insertUser(User user) {
        sqlSession.insert("userMapper.insertUser", user);
    }

    @Override
    public void updateUser(User user) {
        sqlSession.update("userMapper.updateUser", user);
    }

    @Override
    public void deleteById(Long id) {
        sqlSession.delete("userMapper.deleteById", id);
    }
}
