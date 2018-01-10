package com.example.white.huanchong.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.white.huanchong.R;
import com.example.white.huanchong.base.BaseActivity;
import com.example.white.huanchong.net.NetContract;
import com.example.white.huanchong.net.NetModel;
import com.example.white.huanchong.net.NetPresenter;
import com.example.white.huanchong.utils.AppUtils;
import com.example.white.huanchong.utils.InfeUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by 卢本伟·White on 2018/1/4.
 */
public class MainLogin extends BaseActivity<NetPresenter, NetModel> implements NetContract.View {
    @InjectView(R.id.Image_back)
    ImageView ImageBack;
    @InjectView(R.id.Text_ZhuCe)
    TextView TextZhuCe;
    @InjectView(R.id.Edit_user)
    EditText EditUser;
    @InjectView(R.id.Edit_password)
    EditText EditPassword;
    @InjectView(R.id.Btn_Login)
    Button BtnLogin;
    @InjectView(R.id.Text_WangJi)
    TextView TextWangJi;
    @InjectView(R.id.Iamge_QQ)
    ImageView IamgeQQ;
    @InjectView(R.id.Iamge_WeiXin)
    ImageView IamgeWeiXin;

    //拼接url字符串
    String url = AppUtils.REQUESTURL + "/user/login.jhtml";

    private boolean inClick = true;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor edit;


    @Override
    protected void initView() {

    }

    @Override
    protected int getLayouId() {
        return R.layout.activity_login;
    }

    @Override
    public void show(String ss) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.inject(this);

    }

    @OnClick({R.id.Image_back, R.id.Text_ZhuCe, R.id.Edit_user, R.id.Edit_password, R.id.Btn_Login, R.id.Text_WangJi, R.id.Iamge_QQ, R.id.Iamge_WeiXin})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Image_back:
                finish();
                break;
            case R.id.Text_ZhuCe:
                Intent intent = new Intent(this, MainZhuCe.class);
                startActivity(intent);
                break;
            case R.id.Btn_Login:
                String name = EditUser.getText().toString();
                String pass = EditPassword.getText().toString();
                if (name.equals("") || pass.equals("")) {
                    Toast.makeText(this, "输入有误，请重新输入", Toast.LENGTH_SHORT).show();

                } else {
                    edit.putString("pass",pass);
                    edit.commit();
                    InfeUtils.getLogin(name,pass,MainLogin.this);
                    finish();
                }

                break;
            case R.id.Text_WangJi:
                EditPassword.setText("");
                inClick = false;
                sharedPreferences.edit().remove("pass").commit();
                break;
            case R.id.Iamge_QQ:
                break;
            case R.id.Iamge_WeiXin:
                break;
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        sharedPreferences = getSharedPreferences("user", MODE_PRIVATE);
        EditUser.setText(sharedPreferences.getString("name", ""));
        if (inClick) {
            EditPassword.setText(sharedPreferences.getString("pass", ""));
        }

    }


}
