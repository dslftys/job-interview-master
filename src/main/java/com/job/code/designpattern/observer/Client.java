package com.job.code.designpattern.observer;

import com.job.code.designpattern.observer.observer.ConcreteObserver;
import com.job.code.designpattern.observer.observer.Observer;
import com.job.code.designpattern.observer.subject.ConcreteSubject;

/**
* DesignPattern
* @date 2017年2月26日 下午5:45:23
* @author gengzhe.ygz
* 
*/
public class Client {
    public static void main(String args[]){
        //目标类，被观察者
        ConcreteSubject subject = new ConcreteSubject();
        
        //观察者，被通知者 两个A和B
        Observer observerA = new ConcreteObserver();
        Observer observerB = new ConcreteObserver();
        
        //注册观察者
        subject.attach(observerA);
        subject.attach(observerB);
        
        //更改目标类，通知观察者
        subject.setSubjectState("内容1");
        subject.setSubjectState("内容2");
    }
}
