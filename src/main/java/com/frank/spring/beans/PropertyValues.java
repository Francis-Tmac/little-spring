package com.frank.spring.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: little-spring
 * @description:
 * @author: Francis-Tmac
 * @create: 2020-03-17 08:49
 **/

public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public PropertyValues(){}

    public void addPropertyValue(PropertyValue pv){
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValueList() {
        return this.propertyValueList;
    }
}
