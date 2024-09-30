package com.qf.oop3;

public interface USB {

   public static final int length = 1;
    // 前面隐藏public static final，都是默认的
    // 不能被private，只能public，是常量定义时就得初始化

    public abstract void chuanshu();

    // public USB();
}
