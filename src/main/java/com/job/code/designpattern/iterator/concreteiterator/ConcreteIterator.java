package com.job.code.designpattern.iterator.concreteiterator;

import com.job.code.designpattern.iterator.aggregate.List;
import com.job.code.designpattern.iterator.iterator.Iterator;

/**
* 具体迭代器角色
* @date 2017年2月28日 下午1:13:37
* @author gengzhe.ygz
* 
*/
public class ConcreteIterator implements Iterator {

    private List list = null;
    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.getSize()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }

}
