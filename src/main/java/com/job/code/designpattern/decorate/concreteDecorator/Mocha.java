package com.job.code.designpattern.decorate.concreteDecorator;


import com.job.code.designpattern.decorate.component.Beverage;
import com.job.code.designpattern.decorate.decorator.CondimentDecorator;

/**
* ConcreteDecorator 具体装饰者类
* 实现装饰者的方法，对被装饰者进行增强
* @date 2017年2月23日 上午11:05:22
* @author gengzhe.ygz
* 
*/
public class Mocha implements CondimentDecorator {

    //被装饰者
    Beverage beverage;
    
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    
    //具体的方法增强
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    public int cost() {
        return beverage.cost()+5;
    }

}
