package cn.meng.application;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.meng.application.aidl.client.ClientDemo;
import cn.meng.application.component.MyFragment;
import cn.meng.application.customView.CustomView;
import cn.meng.application.customView.PorterDuffView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout uiContainer = new FrameLayout(this);
        uiContainer.setId(R.id.uiContainer);
        FrameLayout.LayoutParams fl = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        uiContainer.setLayoutParams(fl);
        setContentView(uiContainer);

        CustomView customView = new CustomView(this);
        fl = new FrameLayout.LayoutParams(500, 100);
        customView.setLayoutParams(fl);
        uiContainer.addView(customView);

        // add the fragment to activity programmatically.
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction  = fragmentManager.beginTransaction();
        MyFragment myFragment = new MyFragment();
        transaction.add(R.id.uiContainer, myFragment);
        transaction.commit();

//        ClientDemo clientDemo = new ClientDemo();
//        clientDemo.start(this);

        Map<String, Integer> map = new HashMap<>(1);
        map.put("1", 1);
        map.put("2", 2);
    }

    private void getRunningTask() {
        Intent intent = new Intent();
        android.app.ActivityManager activityManager = (android.app.ActivityManager)this.getSystemService(Context.ACTIVITY_SERVICE);
        List<android.app.ActivityManager.RunningAppProcessInfo> infoList = activityManager.getRunningAppProcesses();
        for (android.app.ActivityManager.RunningAppProcessInfo info : infoList) {
            Log.i("processInfo", info.processName);
        }
    }

}
