package cn.beauty.designpattern.decoratePattern.example2;

/**
 * Created by Simon Meng on 2017/12/14.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class Guitar extends GrilDecorator{

    public Guitar(Gril gril) {
        super(gril);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "can play guitar";
    }
}
