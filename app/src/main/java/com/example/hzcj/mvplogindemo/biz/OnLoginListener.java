package com.example.hzcj.mvplogindemo.biz;

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

public interface OnLoginListener {
    void loginSuccess(User user);
    void loginFailed();
}
