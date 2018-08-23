package cn.beauty.designpattern.decoratePattern.example1;

import android.util.Log;

/**
 * Created by Simon Meng on 2017/12/12.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class SportsCar extends CarDecorator{

    public SportsCar(Car mCar) {
        super(mCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        Log.i("sportsCar", "adding features of sports car");
    }

}
