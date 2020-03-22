package com.frank.spring.beans;

/**
 * @program: little-spring
 * @description:
 * @author: Francis-Tmac
 * @create: 2020-03-17 08:44
 **/

public class PropertyValue {
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
