package com.example.ankita.mysplash;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Ankita on 30-01-2016.
 */
public class MyAdapter extends PagerAdapter {
Context context;
    int [] images= {R.drawable.s1, R.drawable.s3, R.drawable.s4, R.drawable.s5};
    public MyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater=  ((Activity)context).getLayoutInflater();
        View view= inflater.inflate(R.layout.images, container, false);
        ImageView imageView= (ImageView)view.findViewById(R.id.imgview);
        imageView.setImageResource(images[position]);
        ((ViewPager)container).addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return  view == ((View)object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub
        ((ViewPager) container).removeView((View) object);
    }
}