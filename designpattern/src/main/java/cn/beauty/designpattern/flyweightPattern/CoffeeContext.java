package cn.beauty.designpattern.flyweightPattern;

/**
 * Created by Simon Meng on 2017/12/18.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class CoffeeContext {
    private final int mTableNumber;

    public CoffeeContext(int tableNumber) {
        this.mTableNumber = tableNumber;
    }

    public int getTable() {
        return this.mTableNumber;
    }

}
