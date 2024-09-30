package com.qf.oop3;
                      // 先继承         再实现
public  class UDisk extends Electron implements USB,Disk{

//    @Override
//    void tongdian() {
//      super.tongdian();
//    }

    @Override
    public void chuanshu() {
        System.out.println(brand+"U盘传输数据");
    }

    @Override
    public void input() {
        System.out.println("磁盘输入数据");
    }

    @Override
    public void output() {
        System.out.println("磁盘输出数据");
    }
}
