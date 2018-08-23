package cn.meng.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;

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
    }
}
