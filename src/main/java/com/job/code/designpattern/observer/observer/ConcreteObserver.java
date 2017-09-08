package com.job.code.designpattern.observer.observer;

import com.job.code.designpattern.observer.subject.AbstractSubject;
import com.job.code.designpattern.observer.subject.ConcreteSubject;

public class ConcreteObserver implements Observer {
    
    String ObserverState;
    @Override
    public void update(AbstractSubject subject) {
        this.ObserverState = ((ConcreteSubject)subject).getSubjectState();
        System.out.println("收到更新·通知："+ObserverState);
    }

}
