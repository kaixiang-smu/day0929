package com.qf.oop1;

public class TestAbstract {
    public static void main(String[] args) {
        // 抽象类Animal不能被创建对象
        // Animal animal = new Animal();

        // 创建子类对象
        //TestAbstract testAbs = new TestAbstract();
        //testAbs.printAnimal(new Dog());

        printAnimal(new Dog());
    }
    // 抽象类虽不能创建对象，但是可以当作父类引用指向子类对象
    public static void printAnimal(Animal animal){
        animal.play();
        animal.run();
    }
}
