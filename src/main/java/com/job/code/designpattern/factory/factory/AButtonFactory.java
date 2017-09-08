package com.job.code.designpattern.factory.factory;


import com.job.code.designpattern.factory.product.AButton;
import com.job.code.designpattern.factory.product.Button;

/**
* DesignPattern
* @date 2017年2月20日 上午10:11:50
* @author gengzhe.ygz
* 
*/
public class AButtonFactory implements Factory {

    @Override
    public Button createButton() {
        return new AButton();
    }

}
