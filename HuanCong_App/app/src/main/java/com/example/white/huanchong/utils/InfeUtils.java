package com.example.white.huanchong.utils;

import android.content.Context;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.example.white.huanchong.app.App;
import com.example.white.huanchong.entity.LoginUser;
import com.example.white.huanchong.entity.NearByRequest;
import com.example.white.huanchong.entity.RegisterUser;
import com.example.white.huanchong.entity.XiangQin;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 丁军明 on 2018/1/9.
 */

public class InfeUtils {
    //注册字符串
    private static String url = AppUtils.REQUESTURL + "/user/register.jhtml";

    //登录
    private static String url1 = AppUtils.REQUESTURL + "/user/login.jhtml";

    //寄养师详情
    private static String url2 = AppUtils.REQUESTURL + "/users/getUsersInfos.jhtml";

    //附近宠物列表
    private static String url3 = AppUtils.REQUESTURL + "/users/getUsersInfoByVO.jhtml";


    //注册
    public static void getRegister(String phone, String psw, String name, Context context) {

        String password = Md5Utils.md5(psw, "UTF-8");
        String ip = IPUtils.getIp(context);
        String token = TokenUtil.createToken();
        Map<String, Object> map = new HashMap<>();
        map.put("userPhone", phone);
        map.put("userName", name);
        map.put("password", password);
        String signString = SignUtil.getSign(map);


        RegisterUser reginUser = new RegisterUser();

        RegisterUser.BodyBean bodyBean = new RegisterUser.BodyBean();
        bodyBean.setUserPhone(phone);
        bodyBean.setPassword(password);
        bodyBean.setUserName(name);


        RegisterUser.HeaderBean headerBean = new RegisterUser.HeaderBean();
        headerBean.setChannel("android");
        headerBean.setIp(ip);
        headerBean.setSign(signString);
        headerBean.setToken(token);


        reginUser.setHeader(headerBean);
        reginUser.setBody(bodyBean);


        //使用JSON.toJSONString(obj)方式来实现javaBean到json
        String reginString = JSON.toJSONString(reginUser);
        System.out.println("转化后的json字符串为==" + reginString);

        OkHttpClient okHttpClient = new OkHttpClient();
        FormBody.Builder bodyBuilder = new FormBody.Builder();


        bodyBuilder.add("data", reginString);

        Request.Builder requestBuilder = new Request.Builder();
        Request request = requestBuilder.url(url).post(bodyBuilder.build()).build();


        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                String message = e.getMessage();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String data = response.body().string();
            }
        });
    }

    /**
     * 登录
     *
     * @param phone 用户电话号码
     * @param psw   用户密码
     */
    public static void getLogin(String phone, String psw, Context context) {
        //1、获取bean对象的相应参数
        String password = Md5Utils.md5(psw, "UTF-8");
        String ip = IPUtils.getIp(context);
        String token = TokenUtil.createToken();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("userPhone", phone);
        map1.put("password", password);
        String signString = SignUtil.getSign(map1);

        App.token = token;

        //2、创建bean对象
        LoginUser loginUser = new LoginUser();

        //3、创建bean对象的body体
        LoginUser.BodyBean bodyBean = new LoginUser.BodyBean();
        bodyBean.setUserPhone(phone);
        bodyBean.setPassword(password);


        //4、将参数添加到bean对象的请求头中
        LoginUser.HeaderBean headerBean = new LoginUser.HeaderBean();
        headerBean.setChannel("android");
        headerBean.setIp(ip);
        headerBean.setSign(signString);
        headerBean.setToken(token);


        //5、填充请求头和请求体到请求中
        loginUser.setBody(bodyBean);
        loginUser.setHeader(headerBean);


        //6、使用JSON.toJSONString(obj)方式来实现Bean对象转化为json字符串,并打印输出
        String loginString = JSON.toJSONString(loginUser);
        System.out.println("转化后的json字符串为==" + loginString);

        //7、使用okhttp发送请求
        OkHttpClient okHttpClient = new OkHttpClient();
        FormBody.Builder bodyBuilder = new FormBody.Builder();

        bodyBuilder.add("data", loginString);
        Request.Builder requestBuilder = new Request.Builder();

        Request request = requestBuilder.url(url2).post(bodyBuilder.build()).build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                String message = e.getMessage();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String data = response.body().string();
                System.out.print(data);
            }

        });
    }

    /**
     * 宠物列表
     *
     * @param userId 用户Id
     */
    private void getDetail(String userId, Context context) {

        //ip token  签名 渠道
        String ip = IPUtils.getIp(context);

        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        String signString = SignUtil.getSign(map);


        XiangQin xiangQin = new XiangQin();

        XiangQin.BodyBean bodyBean = new XiangQin.BodyBean();
        bodyBean.setUserId(userId);


        XiangQin.HeaderBean headerBean = new XiangQin.HeaderBean();
        headerBean.setChannel("android");
        headerBean.setIp(ip);
        headerBean.setSign(signString);
        headerBean.setToken(App.token);


        xiangQin.setHeader(headerBean);
        xiangQin.setBody(bodyBean);


        //使用JSON.toJSONString(obj)方式来实现javaBean到json
        String reginString = JSON.toJSONString(xiangQin);
        System.out.println("转化后的json字符串为==" + reginString);

        OkHttpClient okHttpClient = new OkHttpClient();
        FormBody.Builder bodyBuilder = new FormBody.Builder();


        bodyBuilder.add("data", reginString);

        Request.Builder requestBuilder = new Request.Builder();
        Request request = requestBuilder.url(url).post(bodyBuilder.build()).build();


        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                String message = e.getMessage();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String data = response.body().string();
                Log.e("onResponse: ", data);
            }
        });
    }

    /**
     * 附近宠物列表
     */

    public static void getNearByPetList(String starttIndex, String x, String y, String endIndex, String orderType, Context context) {

        //ip token  签名 渠道
        String ip = IPUtils.getIp(context);
        String token = App.token;
        Map<String, Object> map = new HashMap<>();
        map.put("beginIndex", starttIndex);
        map.put("endIndex", endIndex);
        map.put("coordX", x);
        map.put("coordY", y);
        map.put("orderBy", orderType);
        String signString = SignUtil.getSign(map);

        NearByRequest detailUser = new NearByRequest();

        NearByRequest.BodyBean bodyBean = new NearByRequest.BodyBean();
        bodyBean.setBeginIndex(starttIndex);
        bodyBean.setEndIndex(endIndex);
        bodyBean.setCoordX(x);
        bodyBean.setCoordY(y);
        bodyBean.setOrderBy(orderType);


        NearByRequest.HeaderBean headerBean = new NearByRequest.HeaderBean();
        headerBean.setChannel("android");
        headerBean.setIp(ip);
        headerBean.setSign(signString);
        headerBean.setToken(token);


        detailUser.setHeader(headerBean);
        detailUser.setBody(bodyBean);


        //使用JSON.toJSONString(obj)方式来实现javaBean到json
        String reginString = JSON.toJSONString(detailUser);
        System.out.println("转化后的json字符串为==" + reginString);

        OkHttpClient okHttpClient = new OkHttpClient();
        FormBody.Builder bodyBuilder = new FormBody.Builder();


        bodyBuilder.add("data", reginString);

        Request.Builder requestBuilder = new Request.Builder();
        Request request = requestBuilder.url(url3).post(bodyBuilder.build()).build();


        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                String message = e.getMessage();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String data = response.body().string();
                Log.e("onResponse: ", data);
            }
        });
    }



}
