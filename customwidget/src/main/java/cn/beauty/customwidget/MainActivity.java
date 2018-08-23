package cn.beauty.customwidget;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Matrix matrix = new Matrix();
        matrix.postTranslate(100f, 100f);

        float src[] = {50f, 50f};
        float[] dst = new float[2];
        matrix.mapPoints(dst, src);

        Canvas canvas = new Canvas();
        Log.i("dstX", dst[0] + "");
        Log.i("dstY", dst[1] + "");
    }
}
