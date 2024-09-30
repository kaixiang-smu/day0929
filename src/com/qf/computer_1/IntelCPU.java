package com.qf.computer_1;

public class IntelCPU extends CPU implements Workable{

    public IntelCPU() {
    }
    public IntelCPU(String name,double price,int coreNum) {
        super(name,price,coreNum);
    }

    @Override
    public String description() {
        String desc;
        desc = "处理器品牌："+getName()+"处理器"+"，价钱："+getPrice()+"元，核数："+getCoreNum()+"核";
        return desc;
    }

    @Override
    public void work() {
        System.out.println(getName() + "品牌处理器在工作~");
    }
}
