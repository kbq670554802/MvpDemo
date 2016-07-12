package com.kbq.mvpdemo.View;

/**
 * Created by KBQ on 16/6/7.
 * 登录View的接口，实现类也就是登录的activity
 */
public interface LoginView {
    void showProgress();
    void hideProgress();
    void setUsernameError();
    void setPasswordError();
    void navigateToHome();
}
