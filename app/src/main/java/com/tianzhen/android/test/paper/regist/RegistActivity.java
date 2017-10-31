package com.tianzhen.android.test.paper.regist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tianzhen.android.test.paper.R;
import com.tianzhen.android.test.paper.viewtouch.ViewTouchActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegistActivity extends AppCompatActivity implements RegistContract.View{

    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_code)
    EditText etCode;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.btn_getcode)
    Button btnLogin;
    @BindView(R.id.btn_regist)
    Button btnRegist;
    @BindView(R.id.tv_show)
    TextView tvShow;

    private RegistPresenter registPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        ButterKnife.bind(this);
        registPresenter = new RegistPresenter(this);

    }

    @OnClick({R.id.btn_getcode, R.id.btn_regist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_getcode:
                registPresenter.getCode(etUsername.getText().toString());
                break;
            case R.id.btn_regist:
//                registPresenter.doRegist(etUsername.getText().toString(),etPassword.getText().toString(),etCode.getText().toString());
                this.startActivity(new Intent(this, ViewTouchActivity.class));
                break;
        }
    }

    @Override
    public void setPresenter(RegistContract.Presenter presenter) {

    }

    @Override
    public void showToast(String title) {
        Toast.makeText(this,title,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showResult(String result) {
        tvShow.setText(result);
    }
}
