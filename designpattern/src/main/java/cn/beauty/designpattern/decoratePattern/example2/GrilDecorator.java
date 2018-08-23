package cn.beauty.designpattern.decoratePattern.example2;

/**
 * Created by Simon Meng on 2017/12/14.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class GrilDecorator implements Gril{
    private Gril mGril;

    public GrilDecorator(Gril gril) {
        this.mGril = gril;
    }

    @Override
    public String getDescription() {
        return mGril.getDescription();
    }

}
