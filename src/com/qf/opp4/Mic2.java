package com.qf.opp4;

public class Mic2 implements USB{
    @Override
    public void turnon() {
        System.out.println("麦克风2开启");
    }

    @Override
    public void turnoff() {
        System.out.println("麦克风2关闭");
    }
}
