package com.example.white.huanchong.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.white.huanchong.R;
import com.example.white.huanchong.base.BaseActivity;
import com.example.white.huanchong.net.NetModel;
import com.example.white.huanchong.net.NetPresenter;
import com.example.white.huanchong.utils.InfeUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by 卢本伟·White on 2018/1/5.
 */
public class MainZhuCe extends BaseActivity<NetPresenter, NetModel> {


    @InjectView(R.id.Text_QuXiao)
    TextView TextQuXiao;
    @InjectView(R.id.Text_Login)
    TextView TextLogin;
    @InjectView(R.id.textView2)
    TextView textView2;
    @InjectView(R.id.Edit_phone)
    EditText EditPhone;
    @InjectView(R.id.Edit_YanZheng)
    EditText EditYanZheng;
    @InjectView(R.id.Edit_User1)
    EditText EditUser1;
    @InjectView(R.id.Edit_PassWord1)
    EditText EditPassWord1;
    @InjectView(R.id.Text_HuoQu)
    TextView TextHuoQu;
    @InjectView(R.id.Btn_Login1)
    Button BtnLogin1;
    @InjectView(R.id.linearLayout)
    LinearLayout linearLayout;
    @InjectView(R.id.Iamge_QQ1)
    ImageView IamgeQQ1;
    @InjectView(R.id.Iamge_WeiXin1)
    ImageView IamgeWeiXin1;

    private SharedPreferences sharedPreferences;

    @Override
    protected void initView() {
        sharedPreferences = getSharedPreferences("user", MODE_PRIVATE);
    }

    @Override
    protected int getLayouId() {
        return R.layout.activity_zhuce;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.inject(this);
        sharedPreferences = getSharedPreferences("user",MODE_PRIVATE);
    }

    @OnClick({R.id.Text_QuXiao, R.id.Text_Login, R.id.Edit_phone, R.id.Edit_YanZheng, R.id.Edit_User1, R.id.Edit_PassWord1, R.id.Text_HuoQu, R.id.Btn_Login1, R.id.Iamge_QQ1, R.id.Iamge_WeiXin1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Text_QuXiao:
                finish();
                break;
            case R.id.Text_Login:
                finish();
                break;
            case R.id.Edit_phone:

                break;
            case R.id.Edit_YanZheng:
                Toast.makeText(MainZhuCe.this, "验证码", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Edit_User1:

                break;
            case R.id.Edit_PassWord1:
                break;
            case R.id.Text_HuoQu:
                Toast.makeText(MainZhuCe.this, "获取验证码", Toast.LENGTH_SHORT).show();

                break;
            case R.id.Btn_Login1:

                String phone = EditPhone.getText().toString();
                String code = EditPhone.getText().toString();
                String name = EditUser1.getText().toString();
                String pass = EditPassWord1.getText().toString();

                if (name.equals("") || pass.equals("") || code.equals("") || phone.equals("")) {
                    Toast.makeText(this, "输入有误，请输入重新输入", Toast.LENGTH_SHORT).show();
                } else {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("name", name);
                    edit.putString("pass", pass);
                    edit.commit();
                    InfeUtils.getRegister(phone,pass,name,MainZhuCe.this);
                    finish();
                }




                Toast.makeText(MainZhuCe.this, "注册成功", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Iamge_QQ1:
                Toast.makeText(MainZhuCe.this, "Q Q 登录...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Iamge_WeiXin1:
                Toast.makeText(MainZhuCe.this, "微信登录...", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
