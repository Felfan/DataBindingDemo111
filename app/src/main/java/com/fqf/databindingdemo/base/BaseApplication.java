package com.fqf.databindingdemo.base;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.fqf.databindingdemo.net.BaseRetorfit;

/**
 * Created by 房庆丰 on 2016/11/1.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        BaseRetorfit.initRetrofit();
        Fresco.initialize(this);
    }
}
