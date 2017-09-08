package com.job.code.designpattern.bridge.second;

import com.job.code.designpattern.bridge.first.Implementor;

/**
* DesignPattern
* @date 2017年2月22日 上午10:07:56
* @author gengzhe.ygz
* 
*/
public class RefinedAbstractionA implements Abstraction {
    
    Implementor first;
    
    public RefinedAbstractionA(Implementor first){
        this.first =first;
    }
    @Override
    public void func() {
        System.out.println("红色的");
        first.func();
    }

}
