package com.job.code.designpattern.factory.abstractFactory;


import com.job.code.designpattern.factory.abstractFactory.product.BText;
import com.job.code.designpattern.factory.abstractFactory.product.Text;
import com.job.code.designpattern.factory.product.BButton;
import com.job.code.designpattern.factory.product.Button;

/**
* DesignPattern
* @date 2017年2月20日 上午10:25:30
* @author gengzhe.ygz
* 
*/
public class BFactory implements IFactory {

    @Override
    public Button createButton() {
        return new BButton();
    }

    @Override
    public Text createText() {
        return new BText();
    }

}
