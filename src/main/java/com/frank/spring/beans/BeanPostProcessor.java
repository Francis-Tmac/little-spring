package com.frank.spring.beans;

/**
 * @program: little-spring
 * @description:
 * @author: Francis-Tmac
 * @create: 2020-03-17 08:07
 **/

public interface BeanPostProcessor {
    /**
     * 根据地址加载bean的定义
     */
    void loadBeanDefinitions(String location) throws Exception;
}
