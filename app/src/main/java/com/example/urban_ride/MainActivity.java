package com.example.urban_ride;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.urban_ride.activities.ActivityCostos;
import com.example.urban_ride.activities.LoginActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask tarea=new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo=new Timer();
        tiempo.schedule(tarea,5000);
    }


}
