package cn.beauty.designpattern.adapterPattern;

/**
 * Created by Simon Meng on 2017/11/20.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class Volt {

    private int mVolts;

    public Volt(int volt) {
        this.mVolts = volt;
    }

    public void setVolts(int volt) {
        this.mVolts = volt;
    }

    public int getVolts() {
        return mVolts;
    }

}
