package com.job.code.designpattern.bridge.first;


/**
* DesignPattern
* @date 2017年2月22日 上午10:05:30
* @author gengzhe.ygz
* 
*/
public class ConcreteImplementorB implements Implementor {

    @Override
    public void func() {
        System.out.println("矩形");
    }

}
