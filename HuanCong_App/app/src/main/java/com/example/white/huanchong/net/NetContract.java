package com.example.white.huanchong.net;

import com.example.white.huanchong.base.BaseModel;
import com.example.white.huanchong.base.BasePresenter;
import com.example.white.huanchong.base.BaseView;

import java.util.Map;

/**
 * Created by 卢本伟·White on 2018/1/3.
 */
public interface NetContract {

    interface View extends BaseView {
         void show(String ss);
    }

    interface Model extends BaseModel {
        void getDataNetFrom(String url, Map<String, Object> map,Callbacks callbacks);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

            public  abstract  void getDataModel(String url,Map<String, Object> map);
    }
}