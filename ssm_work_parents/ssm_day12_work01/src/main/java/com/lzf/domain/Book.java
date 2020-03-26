package com.lzf.domain;

/**
 * @Author: Saber污妖王
 * TODO: Book 实体类
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/26
 * @Package: com.qst.domain
 * @Version: 0.0.1
 */
public class Book {
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
