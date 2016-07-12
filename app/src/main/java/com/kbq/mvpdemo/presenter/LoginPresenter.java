package com.kbq.mvpdemo.presenter;

/**
 * Created by KBQ on 16/6/7.
 * 登录的presenter的接口，实现类为LoginPresenterImpl，完成登录的验证，以及销毁当前view
 */
public interface LoginPresenter {
    void validateCredentials(String username,String password);
    void onDestroy();
}
