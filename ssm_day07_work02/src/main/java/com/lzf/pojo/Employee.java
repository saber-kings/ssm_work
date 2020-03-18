package com.lzf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 表tb_employee的Pojo类
 */
@Data
public class Employee implements Serializable {
    private Integer empId;
    private String name;
    // 雇员和工牌 一对一关联
    private WorkCard workCard;
}