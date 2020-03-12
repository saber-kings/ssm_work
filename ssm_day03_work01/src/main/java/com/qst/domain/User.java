package com.qst.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/12
 * @Description:com.qst.domain
 * @version:1.0
 */
@Data
public class User {
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private Date created;
    private Date updated;
}
