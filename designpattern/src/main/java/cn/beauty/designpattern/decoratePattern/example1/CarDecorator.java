package cn.beauty.designpattern.decoratePattern.example1;

/**
 * Created by Simon Meng on 2017/12/12.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class CarDecorator implements Car{
    protected Car mCar;

    public CarDecorator(Car mCar) {
        this.mCar = mCar;
    }

    @Override
    public void assemble() {
        mCar.assemble();
    }


}
