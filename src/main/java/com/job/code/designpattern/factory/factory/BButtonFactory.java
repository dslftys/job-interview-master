package com.job.code.designpattern.factory.factory;


import com.job.code.designpattern.factory.product.BButton;
import com.job.code.designpattern.factory.product.Button;

/**
* DesignPattern
* @date 2017年2月20日 上午10:12:02
* @author gengzhe.ygz
* 
*/
public class BButtonFactory implements Factory {

    @Override
    public Button createButton() {
        return new BButton();
    }


}
