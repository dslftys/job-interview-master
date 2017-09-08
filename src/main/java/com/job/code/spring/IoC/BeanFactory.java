package com.job.code.spring.IoC;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Victor on 2017/8/27.
 */
public class BeanFactory {
    //用于存储bean的单例实体
    private final Map<String,Object>singletonObjects=new ConcurrentHashMap<String, Object>(64);

    //用于存储beanDefination
    private final Map<String,BeanDefination>beanDefinationMap=new ConcurrentHashMap<String, BeanDefination>();

    //注册BeanDefination
    public void registerBeanDefinition(String beanName, BeanDefination beanDefination) {
        beanDefinationMap.put(beanName, beanDefination);
    }

    //获取bean，如果不存在则创建
    public Object getBean(String beanName){
        Object bean=getSingleton(beanName);
        if(bean == null){
            try{
                bean=doCreateBean(beanName,beanDefinationMap.get(beanName));
            }catch (Exception e){
                e.printStackTrace();
            }
            singletonObjects.put(beanName,bean);
        }
        return bean;
    }

    private Object getSingleton(String beanName) {
        return this.singletonObjects.get(beanName);
    }
    private Object doCreateBean(final String beanName, final BeanDefination beanDefination) throws Exception {
        Object bean = createBeanInstance(beanDefination);
        applyPropertyValues(bean, beanDefination);
        return bean;
    }
    private Object createBeanInstance(final BeanDefination beanDefinition) throws Exception {
        Object bean;
        bean = beanDefinition.getBeanClass().newInstance();
        return bean;
    }

    private void applyPropertyValues(Object bean, BeanDefination beanDefinition) throws Exception{
        PropertyValues pvs = beanDefinition.getPropertyValues();
        if(pvs != null) {
            for(PropertyValue pv : pvs.getPropertyValues()) {
                Field field = bean.getClass().getDeclaredField(pv.getName());
                field.setAccessible(true);
                field.set(bean, pv.getValue());
            }
        }
    }
}
