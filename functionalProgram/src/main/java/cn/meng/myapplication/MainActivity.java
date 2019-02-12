package cn.meng.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.observable.BlockingObservableLatest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Flowable.just("Hello Kitty").subscribe(new Consumer<String>() {
//            @Override
//            public void accept(String s) throws Exception {
//                System.out.println(s);
//            }
//        });
        Observable<String> observable = Observable.just("Hello");
        observable.subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
//                System.out.println(s);
            }
        });

        String[] letters = {"a", "b", "c", "d", "e", "f"};
        Observable<String> observable1 = Observable.fromArray(letters);
        observable1.subscribe(new Consumer<String>() {
                                  @Override
                                  public void accept(String s) throws Exception {
//                                      Log.i("onNext", s);
                                  }
                              }, new Consumer<Throwable>() {
                                  @Override
                                  public void accept(Throwable throwable) throws Exception {
//                                      Log.i("onError", throwable.getMessage());
                                  }
                              }, new Action() {
                                  @Override
                                  public void run() throws Exception {
//                                      Log.i("onAction", "onAction");
                                  }
                              }

        );

        Observable.fromArray(letters)
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) throws Exception {
                        return s.toUpperCase();
                    }
                }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                Log.i("onNext", s);
            }
        });

    }
}
