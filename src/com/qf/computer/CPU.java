package com.qf.computer;

/**
 * 处理器抽象类
 */
public abstract class CPU extends Component implements Workable{
    private int coreNum;

    /**
     * 提供有参构造
     */
    // 无参构造一定要有
    public CPU(){

    }
    // 有参构造建议提供
    public CPU(String name,double price,int coreNum){
        // 向上调用父类有参构造
        super(name,price);
        this.coreNum = coreNum;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum = coreNum;
    }

    /**
    @Override
    public String description() {
        return null;
    }
     * 因为这也是一个抽象类，后面还有
     * 更具体的类，所以这个父类方法没必要重写
     * 前面加了abstract，所以不重写也不会报错
     * 这是一个抽象类，继承了一个抽象类，
     * 没有重写抽象方法，就接着用父类的抽象方法
     * 抽象类继承抽象类，就没有必要重写抽象方法
     * 我不重写我的子类会重写，子类重写爷字辈抽象方法
    */
}
