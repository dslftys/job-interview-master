package com.job.code.designpattern.strategy;

import com.job.code.designpattern.strategy.concreteStrategy.quickSort;
import com.job.code.designpattern.strategy.concreteStrategy.selectSort;
import com.job.code.designpattern.strategy.context.context;

public class Client {
    public static void main(String args[]){
        quickSort quick = new quickSort();
        selectSort select = new selectSort();
        
        context c = new context();
        c.setStrategy(quick);
        c.doAction();
        
        //更换算法
        c.setStrategy(select);
        c.doAction();
    }
}
