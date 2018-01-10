package com.example.white.huanchong.base;

/**
 * Created by 卢本伟·White on 2018/1/3.
 */
public class BasePresenter<M, V> {
    public M mModel;
    public V mView;

    public void setVM(M m,V v){
        mModel = m;
        mView = v;
    }
}
