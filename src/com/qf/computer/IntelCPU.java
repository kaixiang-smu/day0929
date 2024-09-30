package com.qf.computer;

/**
 * 子类
 */

public class IntelCPU extends CPU{

    public IntelCPU(){

    }

    public IntelCPU(String name,double price,int coreNum){
        // 使用super有参构造，调用父类对应的有参构造
        super(name,price,coreNum);
    }

    @Override
    public String description() {
        String desc = "品牌："+getName()+"，价钱："+getPrice()+"，核数："+getCoreNum();
        return desc;
    }

    @Override
    public void work() {
        System.out.println(getName()+"处理器在工作");
    }
}
