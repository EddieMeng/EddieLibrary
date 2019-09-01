package cn.meng.application.customView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;

/**
 * Created by Simon Meng on 2018/8/23.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */
public class PorterDuffView extends View {
    private Paint mPaint;

    public PorterDuffView(Context context) {
        super(context);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // destionation image;
        mPaint.setColor(Color.RED);
        canvas.drawCircle(100, 50, 50, mPaint);

        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        // source image;
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(0, 50, 100, 150, mPaint);

    }
}
