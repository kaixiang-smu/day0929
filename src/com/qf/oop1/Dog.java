package com.qf.oop1;
/**
 * 子类继承父类
 * 1、必须实现父类的所有抽象方法(要重写父类的抽象方法)
 * 2、父类非抽象方法是可以直接用，也可以重写，不强制
 *    但是父类所有的抽象方法必须全部重写
 */
public class Dog extends Animal{

    @Override
    public void play() {
        System.out.println("狗玩飞盘");
    }

    @Override
    public void run() {
        System.out.println("狗在草地上奔跑");
    }
}
