package com.frank.spring.beans;

import com.frank.spring.beans.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: little-spring
 * @description:
 * @author: Francis-Tmac
 * @create: 2020-03-17 08:57
 **/

public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String,BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader){
        this.registry = new HashMap<String, BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }
    public Map<String,BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader(){
        return resourceLoader;
    }
}
