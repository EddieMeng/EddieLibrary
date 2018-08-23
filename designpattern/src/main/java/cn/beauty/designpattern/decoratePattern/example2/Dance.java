package cn.beauty.designpattern.decoratePattern.example2;

/**
 * Created by Simon Meng on 2017/12/14.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class Dance extends GrilDecorator{

    public Dance(Gril gril) {
        super(gril);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "can dance";
    }
}
