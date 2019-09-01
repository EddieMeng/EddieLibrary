package cn.beauty.designpattern;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import cn.beauty.designpattern.adapterPattern.SocketAdapter;
import cn.beauty.designpattern.adapterPattern.SocketClassAdapterImpl;
import cn.beauty.designpattern.decoratePattern.example1.BasicCar;
import cn.beauty.designpattern.decoratePattern.example1.Car;
import cn.beauty.designpattern.decoratePattern.example1.LuxuryCar;
import cn.beauty.designpattern.decoratePattern.example1.SportsCar;
import cn.beauty.designpattern.decoratePattern.example2.AmericanGril;
import cn.beauty.designpattern.decoratePattern.example2.Dance;
import cn.beauty.designpattern.decoratePattern.example2.Gril;
import cn.beauty.designpattern.decoratePattern.example2.Guitar;
import cn.beauty.designpattern.flyweightPattern.Coffee;
import cn.beauty.designpattern.flyweightPattern.CoffeeContext;
import cn.beauty.designpattern.flyweightPattern.CoffeeFactory;
import cn.beauty.designpattern.proxyPattern.CommandExcutorProxy;
import cn.beauty.designpattern.proxyPattern.CommandExecutor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testFlyWeightPattern();
    }


    private void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Log.i("3Volts", socketAdapter.get3Volt().getVolts() + "");
        Log.i("12Volts", socketAdapter.get12Volt().getVolts() + "");
        Log.i("120Volts", socketAdapter.get120Volt().getVolts() + "");
    }

    private void testProxyPattern() {
        CommandExecutor executor = new CommandExcutorProxy("Simon", "123456");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    private void testDecoratorPattern() {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

    private void testDecoratorPattern2() {
        Gril gril = new AmericanGril();
        Log.i("gril", gril.getDescription());

        Gril danceGril = new Dance(gril);
        Log.i("gril", danceGril.getDescription());

        Gril guitarGril = new Guitar(gril);
        Log.i("gril", guitarGril.getDescription());

        Gril talentGril = new Guitar(new Dance(gril));
        Log.i("gril", talentGril.getDescription());

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    }

    private CoffeeFactory mCoffeeFactory;
    private void testFlyWeightPattern() {
        mCoffeeFactory = new CoffeeFactory();
        takeCoffeeOrder("Capuccino", 1);
        takeCoffeeOrder("normal", 5);
        takeCoffeeOrder("Capuccino",31);
        takeCoffeeOrder("Capuccino", 2);
        takeCoffeeOrder("Capuccino", 8);
        takeCoffeeOrder("normal", 9);
        takeCoffeeOrder("normal", 6);
        Log.i("flyWeightPattern", mCoffeeFactory.getTotalCoffeeFlavorsMade() + "");
    }

    private void takeCoffeeOrder(String flavor, int tableId) {
        Coffee coffee = mCoffeeFactory.getCoffeeFlavor(flavor);
        CoffeeContext coffeeContext = new CoffeeContext(tableId);
        coffee.serveCoffee(coffeeContext);
    }



}
