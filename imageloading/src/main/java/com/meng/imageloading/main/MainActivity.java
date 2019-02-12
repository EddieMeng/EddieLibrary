package com.meng.imageloading.main;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri uri = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/master/docs/static/logo.png");
        SimpleDraweeView simpleDraweeView = findViewById(R.id.simpleDraweeView);
        Drawable placeHolderImage = this.getResources().getDrawable(R.mipmap.ic_launcher);
        Drawable failureImage = this.getResources().getDrawable(0);
        Drawable retryImage = this.getResources().getDrawable(0);

        // Rounded Corners and Circles
        int color = this.getResources().getColor(android.R.color.holo_red_light);
        RoundingParams roundingParams = RoundingParams.fromCornersRadius(20f);
        roundingParams.setBorder(color, 10f);
        roundingParams.setRoundAsCircle(false);
        simpleDraweeView.getHierarchy().setRoundingParams(roundingParams);
        simpleDraweeView.setImageURI(uri);

        // ProgressBars
        simpleDraweeView.getHierarchy().setProgressBarImage(new ProgressBarDrawable());

        // PlaceHolder, Failure and Retry Image
        simpleDraweeView.getHierarchy().setPlaceholderImage(placeHolderImage);
        simpleDraweeView.getHierarchy().setFailureImage(failureImage);
        simpleDraweeView.getHierarchy().setRetryImage(retryImage);

        //Rotation

    }
}
