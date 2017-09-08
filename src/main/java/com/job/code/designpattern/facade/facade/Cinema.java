package com.job.code.designpattern.facade.facade;


import com.job.code.designpattern.command.receiver.Light;
import com.job.code.designpattern.facade.subSystem.DVDplayer;
import com.job.code.designpattern.facade.subSystem.Screen;

/**
* 门面类
* @date 2017年2月25日 上午11:58:03
* @author gengzhe.ygz
* 
*/
public class Cinema {
    private Light light;
    private Screen screen;
    private DVDplayer dvdplayer;
    
    public Cinema(Light light,Screen screen,DVDplayer dvdplayer){
        this.light = light;
        this.screen = screen;
        this.dvdplayer = dvdplayer;
    }
    
    public void WatchMovie(){
            System.out.println("开始放映");
            light.close();
            screen.down();
            dvdplayer.play();
    }
    
    public void EndMovie(){
        System.out.println("放映结束");
        light.on();
        screen.up();
        dvdplayer.stop();
    }
    
}
