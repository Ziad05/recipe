package com.ziad.recipe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private static int splashTimeout=2000;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        actionBar = getSupportActionBar();
        actionBar.hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();

            }
        },splashTimeout);

    }
}
