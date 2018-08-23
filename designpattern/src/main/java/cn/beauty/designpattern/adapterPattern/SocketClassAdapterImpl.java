package cn.beauty.designpattern.adapterPattern;

/**
 * Created by Simon Meng on 2017/11/20.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt(), 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt(), 40);
    }

    private Volt convertVolt(Volt v, int i) {
        int volt = (v.getVolts() / i);
        return new Volt(volt);
    }
}
