package com.fqf.databindingdemo.base;

import android.support.v7.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by 房庆丰 on 2016/11/1.
 */

public class BaseActivity extends AppCompatActivity implements Callback{
    @Override
    public void onResponse(Call call, Response response) {

    }

    @Override
    public void onFailure(Call call, Throwable t) {

    }
}
