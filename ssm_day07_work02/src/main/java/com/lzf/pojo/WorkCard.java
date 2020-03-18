package com.lzf.pojo;

import lombok.Data;

/**
 * tb_work_card表的Pojo类
 */
@Data
public class WorkCard {
    private Integer cardId;
    private Employee employee;
}