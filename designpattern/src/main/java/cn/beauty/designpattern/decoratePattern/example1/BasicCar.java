package cn.beauty.designpattern.decoratePattern.example1;

import android.util.Log;

/**
 * Created by Simon Meng on 2017/12/12.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class BasicCar implements Car {
    @Override
    public void assemble() {
        Log.i("basicCar", "basicBar");
    }
}
