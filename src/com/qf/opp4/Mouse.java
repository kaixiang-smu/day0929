package com.qf.opp4;

public class Mouse implements USB{

    @Override
    public void turnon() {
        System.out.println("鼠标开启");
    }

    @Override
    public void turnoff() {
        System.out.println("鼠标关闭");
    }
}
