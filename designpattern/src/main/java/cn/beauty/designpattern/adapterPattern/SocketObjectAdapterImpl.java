package cn.beauty.designpattern.adapterPattern;

/**
 * Created by Simon Meng on 2017/11/20.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class SocketObjectAdapterImpl implements SocketAdapter{
    private Socket mSocket = new Socket();

    @Override
    public Volt get120Volt() {
        return mSocket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(mSocket.getVolt(), 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(mSocket.getVolt(), 40);
    }

    private Volt convertVolt(Volt volt, int i) {
        int result = volt.getVolts() / i ;
        return new Volt(result);
    }

}
