package com.job.code.designpattern.template;


import com.job.code.designpattern.template.Abstract.Base;
import com.job.code.designpattern.template.Concrete.Coffee;
import com.job.code.designpattern.template.Concrete.Tea;

public class Client {

    public static void main(String[] args) {
        Base base  = new Coffee();
        base.prepareTemplate();
        
        base = new Tea();
        base.prepareTemplate();
    }

}
