package cn.beauty.designpattern.adapterPattern;

/**
 * Created by Simon Meng on 2017/11/20.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();

}
