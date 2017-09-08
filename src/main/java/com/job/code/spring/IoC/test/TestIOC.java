package com.job.code.spring.IoC.test;
import com.job.code.spring.IoC.*;
import org.junit.*;


import static org.junit.Assert.assertEquals;

/**
 * Created by Victor on 2017/8/27.
 */
public class TestIOC {
    @Test
    public void testIoC(){
        //1.创建BeanFactory
        BeanFactory beanFactory=new BeanFactory();

        //2.注册bean
        BeanDefination beanDefination=new BeanDefination();
        beanDefination.setBeanClassName("com.job.code.spring.IoC.test.HelloWorld");

        BeanDefinitionHolder beanDefinitionHolder=new BeanDefinitionHolder(beanDefination,"helloWorld");

        beanFactory.registerBeanDefinition(beanDefinitionHolder.getBeanName(),beanDefinitionHolder.getBeanDefination());

        //3.获取bean
        HelloWorld helloWorld=(HelloWorld)beanFactory.getBean("helloWorld");
        assertEquals("Hello World!",helloWorld.sayHello());
    }

    @Test
    public void testIoCProperty() {
        // 1. 创建beanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册bean
        BeanDefination bd = new BeanDefination();
        bd.setBeanClassName("HelloWorld");

        // 注入Property
        PropertyValues pvs = new PropertyValues();
        pvs.addPropertyValue(new PropertyValue("msg", "Hello IoC Property!"));
        bd.setPropertyValues(pvs);

        BeanDefinitionHolder bdh = new BeanDefinitionHolder(bd,"helloWorld");
        beanFactory.registerBeanDefinition(bdh.getBeanName(), bdh.getBeanDefination());

        // 3. 获取bean
        HelloWorld hello = (HelloWorld) beanFactory.getBean("helloWorld");
        assertEquals("Hello IoC Property!", hello.sayHello());
    }
}
