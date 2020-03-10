package com.lzf.domain;

import lombok.Data;

/**
 * javabean组件
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/9
 * @Description:com.qst.domain
 * @version:1.0
 */
//Lombok插件提供的注解，帮助该类生成Getter和Setter方法、
// equals()、hashCode()、toString() 这些方法
@Data
public class User {
    private int id;
    private String name;
    private int age;
}
