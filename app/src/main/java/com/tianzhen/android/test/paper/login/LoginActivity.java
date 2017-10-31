package com.tianzhen.android.test.paper.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tianzhen.android.test.paper.R;
import com.tianzhen.android.test.paper.regist.RegistActivity;

import static com.tianzhen.android.test.paper.R.id.et_username;

public class LoginActivity extends AppCompatActivity implements LoginContract.View,View.OnClickListener{
    private EditText et_UserName,et_password;

    public Button btn_login,btn_regist;
    private LoginContract.Presenter loginPresenter;
    private TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_UserName = (EditText) findViewById(et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_regist = (Button) findViewById(R.id.btn_regist);
        tv_show = (TextView) findViewById(R.id.tv_show);
        btn_login.setOnClickListener(this);
        btn_regist.setOnClickListener(this);

        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public void showProgress() {
        Toast.makeText(this,"show progress",Toast.LENGTH_LONG).show();
    }

    @Override
    public void hideProgress() {
        Toast.makeText(this,"hide progress",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showToast(String title) {
        Toast.makeText(this,title,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showResult(String result) {
        tv_show.setText(result);
    }


    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        loginPresenter =  presenter;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                loginPresenter.doLogin(et_UserName.getText().toString(),et_password.getText().toString());
                break;
            case R.id.btn_regist:
                this.startActivity(new Intent(this,RegistActivity.class));
                break;
        }
    }
}
