package com.lzf.domain;

import java.util.List;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/19
 * @Description:com.lzf.domain
 * @version:1.0
 */
public class Dogs {
    private List<Dog> dogs;

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "dogs=" + dogs +
                '}';
    }
}
