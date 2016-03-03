package com.example.riane.producttest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Xiamu on 2016/3/2.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    public static final int PAGE_COUNT = 2;
    private String  tabTitle[] = new String[]{"夺宝记录", "中奖记录"};
    private Context context;
    private List<Fragment> pageFragments;

    public MyPagerAdapter(FragmentManager fm, Context context,List<Fragment> fragments){
        super(fm);
        this.context = context;
        this.pageFragments = fragments;
    }
    @Override
    public Fragment getItem(int position) {
        return pageFragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
