package cn.meng.application.customView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;

public class CustomView extends View {
    private Paint mPaint;

    public CustomView(Context context) {
        super(context);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.RED);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float centerX = getWidth() / 2;
        float centerY = getHeight() / 2;
        float radius = getHeight() / 2;

        Path path = new Path();
        path.addCircle(centerX, centerY, radius, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        canvas.drawRect(0, 0, getWidth(), getHeight(), mPaint);

    }
}
