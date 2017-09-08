package com.job.code.designpattern.singleton.singleton;


/**
* 单例模式 懒汉 线程不安全
* @date 2017年2月19日 上午10:43:11
* @author gengzhe.ygz
* 
*/
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}
    
    public static LazySingleton getInstance(){
        if(instance == null)
            instance = new LazySingleton();
        return instance;
    }
    
    //同步的方法 线程安全
    public static synchronized LazySingleton getInstanceSyn(){
        if(instance == null)
            instance = new LazySingleton();
        return instance;
    }
    //双重检验锁 优化
    public static  LazySingleton getInstanceSyn2(){
        if(instance == null)
            synchronized(LazySingleton.class){
                if(instance==null)
                    instance = new LazySingleton();
            }
        return instance;
    }
}
