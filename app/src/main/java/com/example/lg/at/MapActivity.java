package com.example.lg.at;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        ImageView iv = new ImageView(this);
        iv.setBackgroundResource(R.drawable.kakaotalk_20161218_115802750);
        iv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MapActivity.this, Map1Activity.class);
                startActivity(i);
                finish();
            }
        });
        setContentView(iv);
    }}