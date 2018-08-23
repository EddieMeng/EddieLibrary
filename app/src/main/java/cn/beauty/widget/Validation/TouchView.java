package cn.beauty.widget.Validation;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Simon Meng on 2018/2/23.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class TouchView extends View {

    public TouchView(Context context) {
        super(context);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = MotionEventCompat.getActionMasked(event);
        switch (action) {
            case MotionEvent.ACTION_DOWN : {

                break;
            }

            case MotionEvent.ACTION_MOVE : {

                break;
            }

            case MotionEvent.ACTION_UP : {

                break;
            }

            case MotionEvent.ACTION_CANCEL : {

                break;
            }

            case MotionEvent.ACTION_OUTSIDE : {

                break;
            }

        }
        return super.onTouchEvent(event);

    }





}
