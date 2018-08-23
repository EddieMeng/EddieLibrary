package cn.beauty.designpattern.flyweightPattern;

import android.util.Log;

/**
 * Created by Simon Meng on 2017/12/18.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class Coffee implements ICoffee{
    private String mFlavor;

    public Coffee(String flavor) {
        this.mFlavor = flavor;
    }

    public String getFlavor() {
        return mFlavor;
    }

    @Override
    public void serveCoffee(CoffeeContext coffeeContext) {
        Log.i("Coffee", "Serving  " + mFlavor + " to " + coffeeContext.getTable());
    }
}
