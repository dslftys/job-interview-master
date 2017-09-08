package com.job.code.designpattern.decorate.decorator;

import com.job.code.designpattern.decorate.component.Beverage;

/**
* 装饰者抽象类 Decorator
* 必须让CondimentDecorator能取代Beverage，所以将CondimentDecorator扩展自Beverage类
* @date 2017年2月23日 上午11:02:21
* @author gengzhe.ygz
* 
*/
public interface CondimentDecorator extends Beverage {

}
