package com.example.hzcj.mvplogindemo.biz;

/**
 * Created by HZCJ on 2017/9/19.
 * <pre>
 * author:zhu
 * e-mail:18911664778@163.com
 * desc:
 * version:
 * </pre>
 */

public interface IUserBiz {
  public  void Login(String username,String password,OnLoginListener onLoginListener);
}
