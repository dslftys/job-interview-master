package com.job.code.designpattern.observer.observer;


import com.job.code.designpattern.observer.subject.AbstractSubject;

/**
 * 观察者接口（被通知者），定义通知接口
 * @date 2017年1月16日 下午7:18:13
 * @author yangengzhe
 *
 */
public interface Observer {
    //目标发送改变时，调用的方法
    public void update(AbstractSubject subject);
}
