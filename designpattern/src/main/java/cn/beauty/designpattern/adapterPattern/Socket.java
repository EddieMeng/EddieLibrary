package cn.beauty.designpattern.adapterPattern;
/**
 * Created by Simon Meng on 2017/11/20.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }




}
