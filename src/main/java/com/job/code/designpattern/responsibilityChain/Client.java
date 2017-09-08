package com.job.code.designpattern.responsibilityChain;


import com.job.code.designpattern.responsibilityChain.concreteHandler.DeptHandler;
import com.job.code.designpattern.responsibilityChain.concreteHandler.GeneralHandler;
import com.job.code.designpattern.responsibilityChain.concreteHandler.ProjectHandler;

/**
* DesignPattern
* @date 2017年2月26日 下午6:16:39
* @author gengzhe.ygz
* 
*/
public class Client {

    public static void main(String[] args) {
        //创建每一层的责任
        ProjectHandler projectHandler =new ProjectHandler();
        DeptHandler deptHandler =new DeptHandler();
        GeneralHandler generalHandler =new GeneralHandler();
        //建立链
        projectHandler.setNextHandler(deptHandler);
        deptHandler.setNextHandler(generalHandler);
        
        //开始执行
        projectHandler.doHandler(100);
        projectHandler.doHandler(600);
        projectHandler.doHandler(1100);
    }

}
