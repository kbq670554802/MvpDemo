package com.kbq.mvpdemo.View.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.kbq.mvpdemo.presenter.LoginPresenter;
import com.kbq.mvpdemo.presenter.impl.LoginPresenterImpl;
import com.kbq.mvpdemo.View.LoginView;
import com.kbq.mvpdemo.R;


/**
 * Created by KBQ on 16/6/7.
 * MVP模式中的View层对应一个activity，这里是登录的activity
 */
public class MainActivity extends AppCompatActivity implements LoginView,View.OnClickListener{

    private ProgressBar progressBar;
    private EditText username,password;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        progressBar = (ProgressBar) findViewById(R.id.progress);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);

        presenter = new LoginPresenterImpl(this);
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void setUsernameError() {
        username.setError("用户名不能为空");
    }

    @Override
    public void setPasswordError() {
        password.setError("密码不能为空");
    }

    @Override
    public void navigateToHome() {
//        startActivity(new Intent(this,MainActivity.class));
//        finish();
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        presenter.validateCredentials(username.getText().toString(),password.getText().toString());
    }
}
