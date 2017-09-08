package com.job.code.spring.IoC;

/**
 * Created by Victor on 2017/8/27.
 */
public class BeanDefinitionHolder {
    private final BeanDefination beanDefination;

    private final String beanName;

    public BeanDefinitionHolder(BeanDefination beanDefination, String beanName) {
        this.beanDefination = beanDefination;
        this.beanName = beanName;
    }

    public BeanDefination getBeanDefination(){
        return this.beanDefination;
    }
    public String getBeanName(){
        return this.beanName;
    }
}
