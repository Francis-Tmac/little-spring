package com.frank.spring.beans;

/**
 * @program: little-spring
 * @description: 从配置中读取beanDefinition
 * @author: Francis-Tmac
 * @create: 2020-03-17 08:22
 **/

public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
