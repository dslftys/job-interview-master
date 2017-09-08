package com.job.code.designpattern.factory.abstractFactory;


import com.job.code.designpattern.factory.abstractFactory.product.Text;
import com.job.code.designpattern.factory.product.Button;

/**
* 抽象工厂方法
* 工厂方法模式+多个抽象产品
* @date 2017年2月20日 上午10:20:27
* @author gengzhe.ygz
* 
*/
public interface IFactory {
    public Button createButton();
    public Text createText();
}
