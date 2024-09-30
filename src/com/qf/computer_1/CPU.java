package com.qf.computer_1;

public abstract class CPU extends Component implements Workable{

    private int coreNum;

    public CPU(){

    }

    public CPU(String name,double price,int coreNum) {
        super(name,price);
        this.coreNum = coreNum;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum = coreNum;
    }
}
