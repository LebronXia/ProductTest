package com.example.riane.producttest;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private MyPagerAdapter mPagerAdapter;

    private List<Fragment> pagerFragments = new ArrayList<Fragment>();
    public CommentFragment snathFragment;
    public CommentFragment winningFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        mTabLayout = (TabLayout)findViewById(R.id.tabs);
        setSupportActionBar(mToolbar);

        snathFragment = new CommentFragment();
        winningFragment = new CommentFragment();
        pagerFragments.add(snathFragment);
        pagerFragments.add(winningFragment);
        mPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), this,pagerFragments);
        mViewPager.setAdapter(mPagerAdapter);
        mToolbar.setTitle("我的夺宝");
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
    }

}
