package cn.meng.application.optimization;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.util.Printer;
import android.view.Choreographer;
import android.view.View;

public class UiIssueDetecter {


    public void detectIssueByLooper() {
        Looper.getMainLooper().setMessageLogging(new Printer() {
            @Override
            public void println(String x) {

            }
        });

    }

    @SuppressLint("NewApi")
    public void detectIssueByChoreographer() {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
            @Override
            public void doFrame(long frameTimeNanos) {

            }
        });
    }


}
