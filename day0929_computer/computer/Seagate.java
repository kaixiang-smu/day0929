package com.qf.computer;

public class Seagate extends Disk{
    @Override
    public String description() {
        String desc = "品牌："+getName()+"，价钱："+getPrice()+"，容量："+getVolume();
        return desc;
    }

    @Override
    public void work() {
        System.out.println(getName()+"硬盘在工作");
    }
}
