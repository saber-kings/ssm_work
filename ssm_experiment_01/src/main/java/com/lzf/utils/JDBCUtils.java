package com.lzf.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/9
 * @Description:com.qst.utils
 * @version:1.0
 */
public class JDBCUtils {
    //实例化c3p0数据源ComboPooledDataSource类，用于得到数据库的链接
    static ComboPooledDataSource cpds = new ComboPooledDataSource();

    //得到c3p0数据源的接口
    public static DataSource getDataSource() {
        return cpds;
    }


    /**
     * 通过c3p0数据源得到数据库连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }
}
