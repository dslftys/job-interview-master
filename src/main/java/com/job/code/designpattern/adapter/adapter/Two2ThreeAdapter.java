package com.job.code.designpattern.adapter.adapter;

import com.job.code.designpattern.adapter.adaptee.TwoPlug;
import com.job.code.designpattern.adapter.target.ThreePlug;

/**
 * Created by Victor on 2017/8/26.
 */
public class Two2ThreeAdapter implements ThreePlug {
    private TwoPlug twoPlug;
    public Two2ThreeAdapter(TwoPlug twoPlug) {
        this.twoPlug=twoPlug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过组合适配器");
        twoPlug.powerWithTwo();
    }
}
