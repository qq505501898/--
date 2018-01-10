package com.example.white.huanchong.net;

import com.example.white.huanchong.app.App;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
* Created by TMVPHelper on 2018/01/03
*/
public class NetModel implements NetContract.Model{
    private static NetModel netModel;
    private OkHttpClient mOkHttpClient;

    public NetModel() {
        mOkHttpClient = new OkHttpClient();
    }

    public static NetModel getInstance() {
        if (netModel == null) {
            synchronized (NetModel.class){
                netModel = new NetModel();
            }
        }
        return netModel;
    }


    @Override
    public void getDataNetFrom(String url, Map<String, Object> map, final Callbacks callbacks) {
            StringBuffer sb = new StringBuffer(url);
        String urls = "";
        if (map != null && map.size() > 0) {
            sb.append("?");
            Set<String> set = map.keySet();
            for (String key : set) {
                Object value = map.get(key);
                sb.append(key).append("=").append(value).append("&");
            }
            urls = sb.deleteCharAt(sb.length() - 1).toString();
        }
        Request request = new Request.Builder().url(urls).build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String data = response.body().string();

                App.mBaseActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callbacks.show(data);
                    }
                });
            }
        });

    }
}