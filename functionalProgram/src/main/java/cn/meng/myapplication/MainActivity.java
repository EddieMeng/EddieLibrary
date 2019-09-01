package cn.meng.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.observable.BlockingObservableLatest;
import io.reactivex.observables.GroupedObservable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupByOperator();
    }

    private void createObservable() {
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
    }



    private void scanOperator() {
        String[] letters = {"a", "b", "c", "d", "e", "f"};
        Observable.fromArray(letters).scan(new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) throws Exception {
                Log.i("output1", s);
                Log.i("output2", s2);
                return s;
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                Log.i("output3", s);
            }
        });
    }

    private void groupByOperator() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Observable.fromArray(numbers).groupBy(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) throws Exception {
                Log.i("integer", integer.toString());
                return integer % 2 == 0 ? "EVEN" : "ODD";
            }
        }).subscribe(new Consumer<GroupedObservable<String, Integer>>() {
            @Override
            public void accept(final GroupedObservable<String, Integer> objectIntegerGroupedObservable) throws Exception {
                objectIntegerGroupedObservable.subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        if (objectIntegerGroupedObservable.getKey() == "EVEN") {
                            Log.i("even", integer.toString());
                        } else if (objectIntegerGroupedObservable.getKey() == "ODD") {
                            Log.i("odd", integer.toString());
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.i("errorOcur", throwable.getMessage());
                    }
                });
            }
        });
    }

    private void filterOperator() {

    }

}
