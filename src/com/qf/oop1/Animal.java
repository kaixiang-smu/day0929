package com.qf.oop1;
// 抽象类
public abstract class Animal {
    /**
     *    属性是没有抽象的概念
     * 1、没有方法体的方法就是抽象方法
     * 2、抽象方法必须使用abstract修饰
     * 3、抽象方法必须定义在抽象类中
     * 4、抽象类使用abstract修饰
     */
    public abstract void play(); // 抽象方法
    public abstract void run();


    /**
     * 5、抽象类中可以有正常的具体方法
     */
    public void eat(){
        System.out.println("动物吃");
    }

    /**
     * 6、抽象类中可以有构造方法
     *  构造方法的目的是创建对象
     *  但是不能直接创建对象
     */
    public Animal(){

    }

}
