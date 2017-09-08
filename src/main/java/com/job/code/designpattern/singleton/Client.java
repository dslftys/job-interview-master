package com.job.code.designpattern.singleton;


import com.job.code.designpattern.singleton.singleton.HungrySingleton;
import com.job.code.designpattern.singleton.singleton.LazySingleton;

/**
* DesignPattern
* @date 2017年2月19日 上午10:51:11
* @author gengzhe.ygz
* 
*/
public class Client {
    public static void main(String args[]){

        HungrySingleton singleton = HungrySingleton.getInstance();
        LazySingleton singleton1=LazySingleton.getInstance();
        LazySingleton singleton2=LazySingleton.getInstanceSyn();
        LazySingleton singleton3=LazySingleton.getInstanceSyn2();
    }
}
