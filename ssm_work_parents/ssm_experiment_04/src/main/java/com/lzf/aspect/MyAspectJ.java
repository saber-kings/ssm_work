package com.lzf.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: Saber污妖王
 * TODO:类文件简单描述
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/23
 * @Description: 切面类
 * @Package: com.lzf.aspect
 * @Version: 0.0.1
 */
//作为组件实例化到Spring容器中
@Component
//标明这个类是切面类，里面包含了增强方法
@Aspect
public class MyAspectJ {

    @Pointcut("bean(*Service)")
    public void pointcut() {

    }

    //前置通知
    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知：开启事务... ....");
    }

    // 后置通知
    @AfterReturning(value = "pointcut()", returning = "returnObject")
    public void afterReturning(JoinPoint joinPoint, Object returnObject) {
        System.out.println("后置通知：提交事务... ... returnObject=" + returnObject);
    }

    // 异常通知
    @AfterThrowing(value = "pointcut()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常通知：回滚事务... ... e:" + e.getMessage());
    }

}
