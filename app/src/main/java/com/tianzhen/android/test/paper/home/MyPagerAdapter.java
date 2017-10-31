package com.tianzhen.android.test.paper.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/9/21 0021.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    List<String> titleList;
    public MyPagerAdapter(FragmentManager fm, List<String> titleList) {
        super(fm);
        this.titleList = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }


}
