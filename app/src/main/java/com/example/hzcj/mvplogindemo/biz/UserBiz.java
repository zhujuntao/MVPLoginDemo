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

public class UserBiz implements IUserBiz {
    @Override
    public void Login(final String username, final String password, final OnLoginListener onLoginListener) {

        //模拟子线程耗时操作
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //模拟登陆成功
                if("zhu".equals(username)&&"123".equals(password)){
                    User user=new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    onLoginListener.loginSuccess(user);
                }else {
                    onLoginListener.loginFailed();
                }


            }
        }.start();
    }
}
