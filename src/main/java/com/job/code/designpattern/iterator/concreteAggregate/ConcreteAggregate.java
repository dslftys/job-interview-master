package com.job.code.designpattern.iterator.concreteAggregate;

import com.job.code.designpattern.iterator.aggregate.List;
import com.job.code.designpattern.iterator.concreteiterator.ConcreteIterator;
import com.job.code.designpattern.iterator.iterator.Iterator;


/**
* 具体角色
* @date 2017年2月28日 下午1:15:21
* @author gengzhe.ygz
* 
*/
public class ConcreteAggregate implements List {

    private Object[] list;
    private int size=0;
    private int index=0;
    public ConcreteAggregate(){
        index=0;
        size=0;
        list=new Object[100];
    }
    @Override
    public void add(Object obj) {
        list[index++]=obj;
        size++;
    }

    @Override
    public Iterator iterator() {
        
        return new ConcreteIterator(this);
    }
    @Override
    public Object get(int index) {
        
        return list[index];
    }
    @Override
    public int getSize() {
        
        return size;
    }

}