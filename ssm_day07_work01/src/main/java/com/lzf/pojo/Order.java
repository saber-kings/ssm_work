package com.lzf.pojo;

import lombok.Data;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/18
 * @Description:com.lzf.pojo
 * @version:1.0
 */
@Data
public class Order {
    private String id;   //唯一主键
    private String orderNumber; //订单号
    private String orderNumberName; //订单名
}
