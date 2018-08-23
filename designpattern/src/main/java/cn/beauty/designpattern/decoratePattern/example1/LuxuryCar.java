package cn.beauty.designpattern.decoratePattern.example1;

import android.util.Log;

/**
 * Created by Simon Meng on 2017/12/12.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car mCar) {
        super(mCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        Log.i("luxuryCar", "Adding features of luxury car");
    }
}
