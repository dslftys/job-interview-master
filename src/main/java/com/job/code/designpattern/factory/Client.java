package com.job.code.designpattern.factory;


import com.job.code.designpattern.factory.abstractFactory.AFactory;
import com.job.code.designpattern.factory.abstractFactory.IFactory;
import com.job.code.designpattern.factory.abstractFactory.product.Text;
import com.job.code.designpattern.factory.factory.AButtonFactory;
import com.job.code.designpattern.factory.factory.Factory;
import com.job.code.designpattern.factory.product.Button;
import com.job.code.designpattern.factory.simpleFactory.ButtonSFactory;

/**
* 三种工厂方法模式
* @date 2017年2月20日 上午9:56:23
* @author gengzhe.ygz
* 
*/
public class Client {

    public static void main(String[] args) {
        //简单工厂模式
        ButtonSFactory sf = new ButtonSFactory();
        Button button = sf.createButton(0); // 同一工厂根据不同的参数 生产不同的产品
//        button = sf.createButton(1);
        button.click();
        
        //工厂方法模式
        Factory factory = new AButtonFactory();//不同的工厂 生产不同的产品
//        factory = new BButtonFactory();
        button = factory.createButton();
        button.click();
        
        //抽象工厂模式
        IFactory iFactory = new AFactory();//不同的工厂 生产不同系列的产品
//        iFactory = new BFactory();
        button = iFactory.createButton();
        Text text = iFactory.createText();
        button.click();
        text.input();
    }

}
