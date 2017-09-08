package com.job.code.designpattern.proxy.staticProxy;


import com.job.code.designpattern.proxy.real.Car;
import com.job.code.designpattern.proxy.real.Moveable;

public class CarImplement implements Moveable {
    
    private Car car;
    
    public CarImplement(Car car){
        this.car =car;
    }
    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        car.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶，用时："+(endtime -starttime));
    }

}
