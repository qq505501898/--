package com.example.white.huanchong.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.white.huanchong.app.App;
import com.example.white.huanchong.utils.TUtils;

/**
 * Created by 卢本伟·White on 2018/1/3.
 */
public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel> extends AppCompatActivity {

   public P mPresenter;
    public M mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayouId());
        App.mBaseActivity = this;
        mPresenter = TUtils.getT(this, 0);
        mModel = TUtils.getT(this, 1);

        if (this instanceof BaseView){
            mPresenter.setVM(mModel, this);
        }

        initView();
    }

    protected abstract void initView();

    protected abstract int getLayouId();
}
