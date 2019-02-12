package cn.meng.application;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout uiContainer = new FrameLayout(this);
        FrameLayout.LayoutParams fl = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        uiContainer.setLayoutParams(fl);
        setContentView(uiContainer);

        PorterDuffView porterDuffView = new PorterDuffView(this);
        fl = new FrameLayout.LayoutParams(150, 150, Gravity.CENTER);
        porterDuffView.setLayoutParams(fl);
        uiContainer.addView(porterDuffView);
        getRunningTask();
    }


    private void getRunningTask() {
        Intent intent = new Intent();
        android.app.ActivityManager activityManager = (android.app.ActivityManager)this.getSystemService(Context.ACTIVITY_SERVICE);
        List<android.app.ActivityManager.RunningAppProcessInfo> infoList = activityManager.getRunningAppProcesses();
        for (android.app.ActivityManager.RunningAppProcessInfo info : infoList) {
            Log.i("processInfo", info.processName);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
