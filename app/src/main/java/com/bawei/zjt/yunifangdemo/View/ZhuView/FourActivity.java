package com.bawei.zjt.yunifangdemo.View.ZhuView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.bawei.zjt.yunifangdemo.R;
import com.bawei.zjt.yunifangdemo.View.fragment.FirstFragment;
import com.bawei.zjt.yunifangdemo.View.fragment.ShopFragment;
import com.bawei.zjt.yunifangdemo.View.fragment.TypeFragment;
import com.bawei.zjt.yunifangdemo.View.fragment.UserFragment;

import java.util.ArrayList;

/**
 * Created by 三岁 on 2016/12/6.
 */
public class FourActivity extends Activity implements View.OnClickListener{

    private TextView btHome;
    private TextView btClassify;
    private TextView btShop;
    private TextView btUser;
    private ViewPager myViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fouractivity);
        //初始化界面
        initView();

    }

    private void initView() {

        btHome = (TextView) findViewById(R.id.bt_home);
        btClassify = (TextView) findViewById(R.id.bt_classify);
        btShop = (TextView) findViewById(R.id.bt_shop);
        btUser = (TextView) findViewById(R.id.bt_user);

        btHome.setOnClickListener(this);
        btClassify.setOnClickListener(this);
        btShop.setOnClickListener(this);
        btUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bt_home:
                btHome.setSelected(true);
                btClassify.setSelected(false);
                btShop.setSelected(false);
                btUser.setSelected(false);

                btHome.setTextColor(Color.RED);
                btShop.setTextColor(Color.GRAY);
                btClassify.setTextColor(Color.GRAY);
                btUser.setTextColor(Color.GRAY);
                break;
            case R.id.bt_classify:
                btHome.setSelected(false);
                btClassify.setSelected(true);
                btShop.setSelected(false);
                btUser.setSelected(false);

                btHome.setTextColor(Color.GRAY);
                btShop.setTextColor(Color.GRAY);
                btClassify.setTextColor(Color.RED);
                btUser.setTextColor(Color.GRAY);
                break;
            case R.id.bt_shop:
                btHome.setSelected(false);
                btClassify.setSelected(false);
                btShop.setSelected(true);
                btUser.setSelected(false);

                btHome.setTextColor(Color.GRAY);
                btShop.setTextColor(Color.RED);
                btClassify.setTextColor(Color.GRAY);
                btUser.setTextColor(Color.GRAY);
                break;
            case R.id.bt_user:
                btHome.setSelected(false);
                btClassify.setSelected(false);
                btShop.setSelected(false);
                btUser.setSelected(true);

                btHome.setTextColor(Color.GRAY);
                btShop.setTextColor(Color.GRAY);
                btClassify.setTextColor(Color.GRAY);
                btUser.setTextColor(Color.RED);
                break;
        }

    }
}