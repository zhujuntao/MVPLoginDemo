package com.example.hzcj.mvplogindemo.view;

import com.example.hzcj.mvplogindemo.bean.User;

/**
 * Created by HZCJ on 2017/9/19.
 * <pre>
 * author:zhu
 * e-mail:18911664778@163.com
 * desc:
 * version:
 * </pre>
 */

public interface IUserLoginView {
//    login说明了要有用户名、密码，那么对应两个方法：
    String getUserName();
    String getPassWord();
//再者login是个耗时操作，我们需要给用户一个友好的提示，一般就是操作ProgressBar，所以再两个：
    void showLoading();
    void hideLoading();
//login当然存在登录成功与失败的处理，我们主要看成功我们是跳转Activity，而失败可能是去给个提醒
    void toMainActivity(User user);
    void showFailedError();
//清空用户信息
    void  clearUserName();
    void  clearPassWord();



}
