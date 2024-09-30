package com.qf.opp4;

public class Keyboard implements USB{

    @Override
    public void turnon() {
        System.out.println("键盘开启");
    }

    @Override
    public void turnoff() {
        System.out.println("键盘关闭");
    }
}
