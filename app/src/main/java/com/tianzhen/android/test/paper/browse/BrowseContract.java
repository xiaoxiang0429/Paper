package com.tianzhen.android.test.paper.browse;

import com.tianzhen.android.test.paper.BasePresenter;
import com.tianzhen.android.test.paper.BaseView;
import com.tianzhen.android.test.paper.entity.BrowseBean;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public interface BrowseContract {
    interface View extends BaseView<Presenter>{
        void showRecyclerView(List<BrowseBean.DATABean.DATALISTBean> browseList);
    }

    interface Presenter extends BasePresenter{
        void getProList(int page,String proName);
    }
}
