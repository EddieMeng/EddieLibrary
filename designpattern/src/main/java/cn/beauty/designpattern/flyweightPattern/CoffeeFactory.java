package cn.beauty.designpattern.flyweightPattern;

import java.util.HashMap;

/**
 * Created by Simon Meng on 2017/12/19.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class CoffeeFactory {
    private HashMap<String, Coffee> mFlavors = new HashMap<>( );

    public Coffee getCoffeeFlavor(String flavorName) {
        Coffee coffee = mFlavors.get(flavorName);
        if (coffee == null) {
           coffee = new Coffee(flavorName);
           mFlavors.put(flavorName, coffee);
        }
        return coffee;
    }

    public int getTotalCoffeeFlavorsMade() {
        return mFlavors.size();
    }


}
