package com.job.code.designpattern.bridge.third;


import com.job.code.designpattern.bridge.second.Abstraction;

/**
* DesignPattern
* @date 2017年2月22日 上午10:12:50
* @author gengzhe.ygz
* 
*/
public class GraphyB implements Graphy {

    Abstraction second;
    
    public GraphyB(Abstraction second){
        this.second =second;
    }
    
    @Override
    public void func() {
        System.out.println("机器绘制");
        second.func();
    }

}
