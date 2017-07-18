package com.ninjamonster.a24fun;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.viewpagerindicator.TabPageIndicator;

import com.ninjamonster.a24fun.fragments.GameFragment;
import com.ninjamonster.a24fun.fragments.GameRecordFragment;
import com.ninjamonster.a24fun.fragments.InstructionFragment;
import com.ninjamonster.a24fun.fragments.TabAdapter;

public class MainActivity extends FragmentActivity {
    //ToDo: use butter knife
    //ToDo: if count of numeric button usage is 4, use input is complete, show results
    //ToDo: Find a way to have a set of 4 numbers to get result of 21
    //ToDo: setup cloud database and registration process
    //ToDo: finish 5 set of problem, then calculate the total time used
    //ToDo: upload results and show rank of the player


    private TabPageIndicator mIndicator ;
    private ViewPager mViewPager ;
    private TabAdapter mAdapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIndicator = (TabPageIndicator) findViewById(R.id.id_indicator);
        mViewPager = (ViewPager) findViewById(R.id.id_pager);
        mAdapter = new TabAdapter(getSupportFragmentManager());
        initFragment();
        mViewPager.setAdapter(mAdapter);
        mIndicator.setViewPager(mViewPager, 0);


        mIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    public void initFragment(){
        GameFragment gameFragment = new GameFragment();
        GameRecordFragment gameRecordFragment = new GameRecordFragment();
        InstructionFragment instructionFragment = new InstructionFragment();

        mAdapter.addItem(gameFragment);
        mAdapter.addItem(gameRecordFragment);
        mAdapter.addItem(instructionFragment);
    }
}
