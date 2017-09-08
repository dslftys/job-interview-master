package com.job.code.spring.IoC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 2017/8/27.
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValues;

    public PropertyValues() {
        this.propertyValues = new ArrayList<>();
    }

    public void addPropertyValue(PropertyValue propertyValue){
        propertyValues.add(propertyValue);
    }
    public List<PropertyValue> getPropertyValues() {
        return propertyValues;
    }
}
