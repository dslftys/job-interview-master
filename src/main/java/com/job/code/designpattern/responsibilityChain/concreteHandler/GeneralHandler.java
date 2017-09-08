package com.job.code.designpattern.responsibilityChain.concreteHandler;

import com.job.code.designpattern.responsibilityChain.handler.Handler;

/**
* 最顶层 责任处理者
* @date 2017年2月26日 下午6:10:09
* @author gengzhe.ygz
* 
*/
public class GeneralHandler extends Handler {
    
    @Override
    public void doHandler(int money) {
        System.out.println("总经理审批："+money);
    }

}
