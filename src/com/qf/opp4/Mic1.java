package com.qf.opp4;

public class Mic1 implements USB{
    @Override
    public void turnon() {
        System.out.println("麦克风1开启");
    }

    @Override
    public void turnoff() {
        System.out.println("麦克风1关闭");
    }
}
