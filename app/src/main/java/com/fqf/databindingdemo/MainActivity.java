package com.fqf.databindingdemo;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.ArrayMap;
import android.view.View;

import com.fqf.databindingdemo.adapter.MyRvAdapter;
import com.fqf.databindingdemo.base.BaseActivity;
import com.fqf.databindingdemo.bean.WeatherInfo;
import com.fqf.databindingdemo.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends BaseActivity {
    public String call = "请求";
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecyclerView;
    private MyRvAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHint(this);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        mSwipeRefreshLayout.setColorSchemeColors(Color.RED, Color.BLUE, Color.GREEN, Color.GRAY);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadData();
            }
        });

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyRvAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void onClick(View view) {
        loadData();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void loadData() {
        ArrayMap<String, String> params = new ArrayMap<>();
        params.put("location","杭州");
        params.put("output","json");
        params.put("ak","FkPhtMBK0HTIQNh7gG4cNUttSTyr0nzo");
        WeatherInfo.load(params, this);
    }

    @Override
    public void onResponse(Call call, Response response) {
        super.onResponse(call, response);
        WeatherInfo weatherInfo = (WeatherInfo)response.body();
        mAdapter.setWeatherInfo(weatherInfo);
       // if (mSwipeRefreshLayout.isRefreshing()) {
            mSwipeRefreshLayout.setRefreshing(false);
       //}
    }

    @Override
    public void onFailure(Call call, Throwable t) {
        super.onFailure(call, t);
    }
}
