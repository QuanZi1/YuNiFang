package com.bawei.zjt.yunifangdemo.View.YinDao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.bawei.zjt.yunifangdemo.R;
import com.bawei.zjt.yunifangdemo.View.ZhuView.FourActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 三岁 on 2016/12/6.
 */

public class ThirdActivty extends Activity{

    private TextView tvTime;
    int i=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);
        initView();

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        tvTime.setText("跳过"+(i -= 1) + "秒");
                        // 当倒计时到0的时候,停止timer
                        if (i == 0) {
                            Intent intent = new Intent(ThirdActivty.this, FourActivity.class);
                            startActivity(intent);
                            timer.cancel();
                        }
                    }
                });

            }
        }, 0, 1000);

    }

    private void initView() {
        tvTime = (TextView) findViewById(R.id.tv_time);
    }
}
