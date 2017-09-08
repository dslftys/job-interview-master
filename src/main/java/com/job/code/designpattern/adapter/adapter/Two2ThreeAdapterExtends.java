package com.job.code.designpattern.adapter.adapter;

import com.job.code.designpattern.adapter.adaptee.TwoPlug;
import com.job.code.designpattern.adapter.target.ThreePlug;

/**
 * Created by Victor on 2017/8/26.
 */
public class Two2ThreeAdapterExtends extends TwoPlug implements ThreePlug {

    @Override
    public void powerWithThree() {
        System.out.println("通过继承适配器");
        this.powerWithTwo();
    }
}
