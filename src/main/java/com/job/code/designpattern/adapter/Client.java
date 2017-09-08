package com.job.code.designpattern.adapter;

import com.job.code.designpattern.adapter.adaptee.TwoPlug;
import com.job.code.designpattern.adapter.adapter.Two2ThreeAdapter;
import com.job.code.designpattern.adapter.adapter.Two2ThreeAdapterExtends;
import com.job.code.designpattern.adapter.target.ThreePlug;

/**
 * Created by Victor on 2017/8/26.
 */
public class Client {
    public static void main(String args[]){
        //对象适配器
        TwoPlug twoPlug = new TwoPlug();
        ThreePlug plug = new Two2ThreeAdapter(twoPlug);
        plug.powerWithThree();

        //类适配器
        plug = new Two2ThreeAdapterExtends();
        plug.powerWithThree();
    }
}
