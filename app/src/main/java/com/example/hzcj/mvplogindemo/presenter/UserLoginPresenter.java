package com.example.hzcj.mvplogindemo.presenter;

import android.os.Handler;

import com.example.hzcj.mvplogindemo.bean.User;
import com.example.hzcj.mvplogindemo.biz.IUserBiz;
import com.example.hzcj.mvplogindemo.biz.OnLoginListener;
import com.example.hzcj.mvplogindemo.biz.UserBiz;
import com.example.hzcj.mvplogindemo.view.IUserLoginView;


/**
 * Created by HZCJ on 2017/9/19.
 * <pre>
 * author:zhu
 * e-mail:18911664778@163.com
 * desc:
 * version:
 * </pre>
 */

public class UserLoginPresenter {
    private IUserBiz userBiz;
    private IUserLoginView userLoginView;
    private Handler  mhandler=new Handler();

    public UserLoginPresenter(IUserLoginView userLoginView) {
        this.userLoginView = userLoginView;
        this.userBiz=new UserBiz();
    }
    public void login(){
        userLoginView.showLoading();
        userBiz.Login(userLoginView.getUserName(), userLoginView.getPassWord(), new OnLoginListener() {
            @Override
            public void loginSuccess(final User user) {
                mhandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.toMainActivity(user);
                        userLoginView.hideLoading();
                    }
                });
            }

            @Override
            public void loginFailed() {
                mhandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.showFailedError();
                        userLoginView.hideLoading();
                    }
                });
            }
        });




    }
public void clear(){
    userLoginView.clearUserName();
    userLoginView.clearPassWord();
}




}
