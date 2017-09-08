package com.job.code.designpattern.factory.abstractFactory;


import com.job.code.designpattern.factory.abstractFactory.product.AText;
import com.job.code.designpattern.factory.abstractFactory.product.Text;
import com.job.code.designpattern.factory.product.AButton;
import com.job.code.designpattern.factory.product.Button;

/**
* DesignPattern
* @date 2017年2月20日 上午10:24:53
* @author gengzhe.ygz
* 
*/
public class AFactory implements IFactory {

    @Override
    public Button createButton() {
        return new AButton();
    }

    @Override
    public Text createText() {
        return new AText();
    }

}
