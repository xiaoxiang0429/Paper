package com.tianzhen.android.test.paper;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.tianzhen.android.test.paper.browse.BrowseFragment;
import com.tianzhen.android.test.paper.home.HomeFragment;
import com.tianzhen.android.test.paper.home.MyPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.hometab)
    TabLayout hometab;
    private List<Fragment> list_frg = new ArrayList<>();
    private FragmentPagerAdapter pagerAdapter;
    private List<String> titleList;
    private String[] titles = {"首页","服务","浏览","我的"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        initTab();
        initAdapter();
        initViewPager();
    }

    private void initData() {
        titleList = new ArrayList<>();
        titleList.add("首页");
        titleList.add("服务");
        titleList.add("浏览");
        titleList.add("我的");
    }

    private void initAdapter() {
        HomeFragment home1 = HomeFragment.newInstance(titles[0]);
        HomeFragment home2 = HomeFragment.newInstance(titles[1]);
        BrowseFragment BrowseFragment = new BrowseFragment();
        HomeFragment home4 = HomeFragment.newInstance(titles[3]);
        list_frg.add(home1);
        list_frg.add(home2);
        list_frg.add(BrowseFragment);
        list_frg.add(home4);
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),titleList) {
            @Override
            public Fragment getItem(int position) {
                return list_frg.get(position);
            }

            @Override
            public int getCount() {
                return list_frg.size();
            }


        };
    }

    private void initViewPager() {
        viewpager.setAdapter(pagerAdapter);
        viewpager.setScrollContainer(false);

    }

    private void initTab() {
        hometab.addTab(hometab.newTab());
        hometab.addTab(hometab.newTab());
        hometab.addTab(hometab.newTab());
        hometab.addTab(hometab.newTab());
        hometab.getTabAt(0).setText(titleList.get(0));
        hometab.getTabAt(1).setText(titleList.get(1));
        hometab.getTabAt(2).setText(titleList.get(2));
        hometab.getTabAt(3).setText(titleList.get(3));
        hometab.setupWithViewPager(viewpager);
    }
}
