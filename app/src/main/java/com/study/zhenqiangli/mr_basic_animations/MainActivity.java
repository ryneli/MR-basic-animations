package com.study.zhenqiangli.mr_basic_animations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.mid_cell);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getBaseContext(), DetailActivity.class);
        View sharedView = findViewById(R.id.mid_cell);
        Bundle sharedElementTransitionBundle = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                sharedView,
                sharedView.getTransitionName()
        ).toBundle();
        ActivityCompat.startActivity(this, intent, sharedElementTransitionBundle);
    }
}
