package com.qf.computer_1;

public abstract class Disk extends Component implements Workable{
    private int volume;

    public Disk(){

    }

    public Disk(String name,double price,int volume) {
        super(name,price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
