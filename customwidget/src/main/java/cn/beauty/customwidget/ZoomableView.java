package cn.beauty.customwidget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by Simon Meng on 2018/3/19.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class ZoomableView extends ImageView {
    public ZoomableView(Context context) {
        super(context);
        this.setScaleType(ScaleType.MATRIX);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getActionMasked();
        switch (action) {
            case MotionEvent.ACTION_DOWN : {

                break;
            }

            case MotionEvent.ACTION_POINTER_DOWN : {

                break;
            }

            case MotionEvent.ACTION_POINTER_UP: {

                break;
            }

            case MotionEvent.ACTION_UP: {

                break;
            }
        }

        return super.onTouchEvent(event);
    }
}
