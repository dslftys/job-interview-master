package com.job.code.designpattern.factory.simpleFactory;

import com.job.code.designpattern.factory.product.AButton;
import com.job.code.designpattern.factory.product.BButton;
import com.job.code.designpattern.factory.product.Button;

/**
 * 简单工厂模式，按钮工厂
 * 1个工厂实现类+N个产品实现类
 * 
 * @date 2017年2月20日 上午9:52:57
 * @author gengzhe.ygz
 */
public class ButtonSFactory {

    public Button createButton(int type) {
        if (type == 0) return new AButton();
        else return new BButton();
    }
}
