package com.tianzhen.android.test.paper.home;

import com.tianzhen.android.test.paper.BasePresenter;
import com.tianzhen.android.test.paper.BaseView;
import com.tianzhen.android.test.paper.entity.HomeBean;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public interface HomeContract {
    interface View extends BaseView<Presenter>{
        void bannerClick();
        void loadBanner1(List<HomeBean.DATABean.FirstImgBean> firstImgBeen);
        void loadBanner2(List<HomeBean.DATABean.SecondImgBean> secondImgBeen);
        void loadHeadlines(List<HomeBean.DATABean.NewsListBean> list);
        void loadSDInfor(HomeBean homeBean);

    }

    interface Presenter extends BasePresenter{
        void getData();
    }
}
