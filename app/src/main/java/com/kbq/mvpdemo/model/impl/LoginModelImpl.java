package com.kbq.mvpdemo.model.impl;

import android.os.Handler;
import android.text.TextUtils;

import com.kbq.mvpdemo.presenter.listener.OnLoginFinishedListener;
import com.kbq.mvpdemo.model.LoginModel;

/**
 * Created by KBQ on 16/6/7.
 * 延时模拟登录(5s)，如果用户名或者密码为空则登录失败，否则登录成功
 */
public class LoginModelImpl implements LoginModel {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Thread(){
            @Override
            public void run() {
                boolean error = false;
                if(TextUtils.isEmpty(username)){

                    listener.onUsernameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        },5000);
    }
}
