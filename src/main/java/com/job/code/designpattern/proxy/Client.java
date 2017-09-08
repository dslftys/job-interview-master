package com.job.code.designpattern.proxy;


import com.job.code.designpattern.proxy.dynamicProxy.cglib.cglibProxy;
import com.job.code.designpattern.proxy.dynamicProxy.jdk.TimeHandler;
import com.job.code.designpattern.proxy.real.Car;
import com.job.code.designpattern.proxy.real.Moveable;
import com.job.code.designpattern.proxy.real.Train;
import com.job.code.designpattern.proxy.staticProxy.CarExtend;
import com.job.code.designpattern.proxy.staticProxy.CarImplement;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String args[]) {
        
        /**静态代理**/
        //静态代理 继承
        Moveable moveable = new CarExtend();
        moveable.move();
        
        //静态代理 聚合
        Car car = new Car();
        moveable = new CarImplement(car);
        moveable.move();
        
        
        /**动态代理**/
        /**Cglib**/
        cglibProxy proxy = new cglibProxy();
        //获得被代理类的子类
        Train train = (Train)proxy.getProxy(Train.class);
        train.move();
        
        /**JDK**/
        car =new Car();
        InvocationHandler h =new TimeHandler(car);
        Class<?> cls = car.getClass();
        
        //loader 类加载器，interfaces 实现接口，InvocationHandler
        //返回：代理后的对象
        Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
        
        m.move();
        
    }
}
