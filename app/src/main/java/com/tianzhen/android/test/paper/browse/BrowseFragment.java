package com.tianzhen.android.test.paper.browse;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tianzhen.android.test.paper.R;
import com.tianzhen.android.test.paper.entity.BrowseBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public class BrowseFragment extends Fragment implements BrowseContract.View{

    @BindView(R.id.recycler_pro)
    RecyclerView recyclerPro;
    @BindView(R.id.refresh_pro)
    SwipeRefreshLayout refreshPro;
    Unbinder unbinder;
    private BrowserPresenter browserPresenter;

    public BrowseFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.frg_browse, container, false);
        unbinder = ButterKnife.bind(this, root);
        browserPresenter = new BrowserPresenter(this);
        browserPresenter.getProList(1,"");
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void setPresenter(BrowseContract.Presenter presenter) {

    }

    @Override
    public void showToast(String title) {

    }

    @Override
    public void showResult(String result) {

    }

    @Override
    public void showRecyclerView(List<BrowseBean.DATABean.DATALISTBean> browseList) {

    }
}
