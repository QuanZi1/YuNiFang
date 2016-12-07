package com.bawei.zjt.yunifangdemo.View.YinDao;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.zjt.yunifangdemo.R;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SharedPreferences sp = getSharedPreferences("config", MODE_PRIVATE);
        final boolean dialog = sp.getBoolean("dialog", false);


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(dialog){

                    Intent intent = new Intent(MainActivity.this, ThirdActivty.class);
                    startActivity(intent);


                }else{

                    Intent intent = new Intent(MainActivity.this, NextActicity.class);
                    startActivity(intent);

                    SharedPreferences.Editor edit = sp.edit();
                    edit.putBoolean("dialog",true);
                    edit.commit();
                }

            }
        },2000);

    }

}