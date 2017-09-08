package com.job.code.designpattern.bridge.second;

import com.job.code.designpattern.bridge.first.Implementor;

/**
* DesignPattern
* @date 2017年2月22日 上午10:08:07
* @author gengzhe.ygz
* 
*/
public class RefinedAbstractionB implements Abstraction {

    Implementor first;
    
    public RefinedAbstractionB(Implementor first){
        this.first =first;
    }
    
    @Override
    public void func() {
        System.out.println("绿色的");
        first.func();
    }

}
