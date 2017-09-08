package com.job.code.designpattern.builder;


import com.job.code.designpattern.builder.builder.Builder;
import com.job.code.designpattern.builder.concreteBuilder.BrickBuilder;
import com.job.code.designpattern.builder.director.Director;
import com.job.code.designpattern.builder.product.House;

/**
* DesignPattern
* @date 2017年2月18日 下午12:25:40
* @author gengzhe.ygz
* 
*/
public class client {
    
    public static void main(String args[]){
        Director director = new Director();
        Builder builder = new BrickBuilder();
        
        House house = director.Construct(builder);
        System.out.println(house.getType());
    }
}
