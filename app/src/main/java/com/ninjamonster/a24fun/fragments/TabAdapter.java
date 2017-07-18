package com.ninjamonster.a24fun.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by kevin2016 on 6/15/17.
 */

public class TabAdapter extends FragmentPagerAdapter {

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    private static final ArrayList<Fragment> mFragmentList = new ArrayList<>();
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

    public void addItem(Fragment fragment){
        mFragmentList.add(fragment);
    }

    public void removeItem(Fragment fragment) {
        mFragmentList.remove(fragment);
    }
}
