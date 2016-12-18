package com.example.lg.at;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

/**
 * Created by Junyoung on 2016-06-26.
 */

public class IntroActivity extends Activity {
    private static int INTRO_TIME = 1500;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        mHandler = new Handler();
        mHandler.postDelayed(mRunnable, INTRO_TIME);

        ImageView intro = (ImageView) findViewById(R.id.intro);
    }

    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mHandler.removeCallbacks(mRunnable);
    }
}
