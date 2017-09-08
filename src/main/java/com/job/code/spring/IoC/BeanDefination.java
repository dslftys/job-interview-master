package com.job.code.spring.IoC;

/**
 * Created by Victor on 2017/8/27.
 */
public class BeanDefination {
    private Class beanClass;
    private String beanClassName;
    private PropertyValues propertyValues;

    public  Class getBeanClass(){
        return beanClass;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try{
            this.beanClass=Class.forName(beanClassName);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
