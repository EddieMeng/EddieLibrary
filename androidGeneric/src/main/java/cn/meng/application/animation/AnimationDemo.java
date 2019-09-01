package cn.meng.application.animation;

import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

public class AnimationDemo {


    public AnimationDemo() {
        super();
        // Tweened Animation
        // Frame Animation
        // Property Animation
        ObjectAnimator animator = ObjectAnimator.ofInt("mButton", "width", 500);
        animator.start();



    }
}
