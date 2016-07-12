package com.kbq.mvpdemo.model;

import com.kbq.mvpdemo.presenter.listener.OnLoginFinishedListener;

/**
 * Created by KBQ on 16/6/7.
 * 模拟登陆的操作的接口，实现类为LoginModelImpl,相当于MVP模式中的Model层
 */
public interface LoginModel {
    void login(String username, String password,OnLoginFinishedListener listener);
}
