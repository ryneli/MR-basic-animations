package com.study.zhenqiangli.mr_basic_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.animation.AnimationUtils;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Slide slide = new Slide(Gravity.BOTTOM);
        slide.addTarget(R.id.description);
        slide.setInterpolator(
                AnimationUtils.loadInterpolator(this,
                        android.R.interpolator.linear_out_slow_in));
        slide.setDuration(500);
        getWindow().setEnterTransition(slide);
        setContentView(R.layout.activity_detail);
    }
}
