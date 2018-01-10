package com.example.white.huanchong.ui;

import android.content.Intent;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.eftimoff.androipathview.PathView;
import com.example.white.huanchong.R;
import com.example.white.huanchong.base.BaseActivity;
import com.example.white.huanchong.net.NetContract;
import com.example.white.huanchong.net.NetModel;
import com.example.white.huanchong.net.NetPresenter;

public class MainActivity extends BaseActivity<NetPresenter, NetModel> implements NetContract.View {

    private PathView pathView;

    @Override
    protected void initView() {
        pathView = (PathView) findViewById(R.id.pathView);
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this, MainHome.class);
//                startActivity(intent);
//                finish();
//            }
//        }, 1000);
        pathView.getPathAnimator()
                .delay(1000)
                .duration(5000)
                .listenerStart(new PathView.AnimatorBuilder.ListenerStart() {
                    @Override
                    public void onAnimationStart() {

                    }
                })
                .listenerEnd(new PathView.AnimatorBuilder.ListenerEnd() {
                    @Override
                    public void onAnimationEnd() {
                        pathView.setFillAfter(true);
                        startActivity(new Intent(MainActivity.this, MainHome.class));
                    }
                })
                .interpolator(new AccelerateDecelerateInterpolator())
                .start();

    }

    @Override
    protected int getLayouId() {
        return R.layout.activity_main;
    }

    @Override
    public void show(String ss) {

    }
}
