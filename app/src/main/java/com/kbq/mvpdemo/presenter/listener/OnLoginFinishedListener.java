package com.kbq.mvpdemo.presenter.listener;

/**
 * Created by KBQ on 16/6/7.
 * 登录事件监听
 */
public interface OnLoginFinishedListener {
    void onUsernameError();
    void onPasswordError();
    void onSuccess();
}
