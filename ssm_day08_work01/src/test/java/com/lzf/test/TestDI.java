package com.lzf.test;

import com.lzf.domain.Dog;
import com.lzf.domain.Dogs;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2020/3/19
 * @Description:com.lzf.test
 * @version:1.0
 */
public class TestDI {
    @Test
    public void testDI01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog01 = ac.getBean("dog01", Dog.class);
        Dog dog02 = ac.getBean("dog02", Dog.class);
        System.out.println(dog01);
        System.out.println(dog02);
    }

    @Test
    public void testDI02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dogs dogs = ac.getBean("dogs", Dogs.class);
        System.out.println(dogs);
    }
}
