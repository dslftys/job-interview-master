package com.job.code.designpattern.decorate;

import com.job.code.designpattern.decorate.component.Beverage;
import com.job.code.designpattern.decorate.concreteComponent.Espresso;
import com.job.code.designpattern.decorate.concreteComponent.HouseBlend;
import com.job.code.designpattern.decorate.concreteDecorator.Mocha;

/**
* 装饰模式
* @date 2017年2月23日 上午11:07:26
* @author gengzhe.ygz
* 
*/
public class Client {

    public static void main(String args[]){
        
        //没有装饰的情况下
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ "+beverage.cost());
        
        //装饰后
        beverage = new HouseBlend();
        beverage = new Mocha(beverage); //开始装饰第一层
        //可以装饰很多层
        //...
        System.out.println(beverage.getDescription() + " $ "+beverage.cost()); //完全一样的操作
    }
}
