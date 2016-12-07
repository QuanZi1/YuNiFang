package com.bawei.zjt.yunifangdemo.View.YinDao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bawei.zjt.yunifangdemo.R;

import java.util.ArrayList;

/**
 * Created by 三岁 on 2016/12/6.
 */
public class NextActicity extends Activity{

    private ViewPager vpSecond;
    private ImageView next5;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextactivity);
        //初始化界面
        initView();
        //初始化数据

        vpSecond.setAdapter(new MyPageAdapter(initData()));

        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActicity.this, ThirdActivty.class);
                startActivity(intent);
            }
        });

    }

    class MyPageAdapter extends PagerAdapter{
        private ArrayList<View> list;

        public MyPageAdapter(ArrayList<View> list) {
            this.list=list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = list.get(position);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            //super.destroyItem(container, position, object);
            container.removeView((View) object);
        }
    }

    private ArrayList<View> initData() {

        ArrayList<View> list = new ArrayList<>();
        list.add(View.inflate(NextActicity.this, R.layout.next_item1,null));
        list.add(View.inflate(NextActicity.this, R.layout.next_item2,null));
        list.add(View.inflate(NextActicity.this, R.layout.next_item3,null));
        list.add(View.inflate(NextActicity.this, R.layout.next_item4,null));
        view = View.inflate(NextActicity.this, R.layout.next_item5, null);
        next5 = (ImageView) view.findViewById(R.id.next5);
        list.add(view);

        return list;
    }

    private void initView() {
        vpSecond = (ViewPager) findViewById(R.id.vp_second);
    }

}