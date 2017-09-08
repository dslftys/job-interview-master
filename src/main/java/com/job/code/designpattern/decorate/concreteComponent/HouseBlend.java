package com.job.code.designpattern.decorate.concreteComponent;


import com.job.code.designpattern.decorate.component.Beverage;

/**
* 另一个构件
* @date 2017年2月23日 上午10:57:59
* @author gengzhe.ygz
* 
*/
public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public int cost() {
        return 20;
    }

}
