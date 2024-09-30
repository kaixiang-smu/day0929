package com.qf.computer;

/**
 * 子类
 */

public class IntelCPU extends CPU{
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
