package com.example.lg.at;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Map1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map1);

    ImageView iv = new ImageView(this);
iv.setBackgroundResource(R.drawable.kakaotalk_20161218_120547969);
        iv.setOnClickListener(new View.OnClickListener() {
public void onClick(View v) {
        Intent i = new Intent(Map1Activity.this, LankActivity.class);
        startActivity(i);
        finish();
        }
        });
        setContentView(iv);
        }}