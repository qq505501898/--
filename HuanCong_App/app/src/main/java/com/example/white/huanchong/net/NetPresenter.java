package com.example.white.huanchong.net;

import java.util.Map;

/**
* Created by TMVPHelper on 2018/01/03
*/
public class NetPresenter extends NetContract.Presenter{


    @Override
    public void getDataModel(String url, Map<String, Object> map) {
         mModel.getDataNetFrom(url, map, new Callbacks() {
             @Override
             public void show(String data) {
                 mView.show(data);
             }
         });
    }
}