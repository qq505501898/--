package com.example.white.huanchong.app;

import android.app.Application;

import com.example.white.huanchong.base.BaseActivity;
import com.example.white.huanchong.utils.AppUtils;
import com.example.white.huanchong.utils.TokenUtil;
import com.lzy.okhttputils.OkHttpUtils;

/**
 * Created by 卢本伟·White on 2018/1/3.
 */
public class App extends Application {

    public static BaseActivity mBaseActivity;
    public static String token;

    @Override
    public void onCreate() {
        super.onCreate();
        AppUtils.setAppContext(getApplicationContext());
        TokenUtil.init(getApplicationContext());
        //必须调用初始化
        OkHttpUtils.init(this);
    }
}
