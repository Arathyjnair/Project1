package com.example.user.uber_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Thread background = new Thread() {
            public void run() {

                try {
                    sleep(3000);
                    Intent i = new Intent(SplashScreen.this, Sign.class);
                    startActivity(i);


                    finish();

                } catch (Exception e) {

                    System.out.println(e);
                }
            }
        };


        background.start();
    }


}

