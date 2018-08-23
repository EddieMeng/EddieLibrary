package cn.meng.application;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.InputType;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;

/**
 * Created by Simon Meng on 2018/8/16.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */
public class InputMethodView extends FrameLayout{
    private Context mContext;

    public InputMethodView(@NonNull Context context) {
        super(context);
        mContext = context;
        initView();
    }

    private void initView() {
        EditText editText = new EditText(mContext);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER);
        ((Activity)mContext).getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        ((Activity)mContext).getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);
//        ((Activity)mContext).getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
//        ((Activity)mContext).getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED);

        FrameLayout.LayoutParams fl = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.BOTTOM);
        editText.setLayoutParams(fl);
        this.addView(editText);
    }


}
