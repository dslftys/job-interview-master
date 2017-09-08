package com.job.code.designpattern.iterator.aggregate;

import com.job.code.designpattern.iterator.iterator.Iterator;

/**
* 容器角色
* @date 2017年2月28日 下午1:14:34
* @author gengzhe.ygz
* 
*/
//定义集合可以进行的操作
public interface List {
    void add(Object obj);
    Object get(int index);
    Iterator iterator();
    int getSize();
}