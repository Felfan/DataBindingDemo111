package com.fqf.databindingdemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.fqf.databindingdemo.R;
import com.fqf.databindingdemo.bean.WeatherInfo;
import com.fqf.databindingdemo.databinding.ItemBinding;

/**
 * Created by 房庆丰 on 2016/11/2.
 */

public class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.MyViewHolder> {
    private Context mContext;
    private WeatherInfo mWeatherInfo;
    private final LayoutInflater mLayoutInflater;

    public MyRvAdapter(Context context) {
        mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    public void setWeatherInfo(WeatherInfo weatherInfo) {
        mWeatherInfo = weatherInfo;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemBinding itemBinding = DataBindingUtil.inflate(mLayoutInflater, R.layout.item, parent, false);
        //itemBinding.getRoot();
        return new MyViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mItemBinding.setWeatherData(mWeatherInfo.getResults().get(0).getWeather_data().get(position));
        holder.dayImage.setImageURI(mWeatherInfo.getResults().get(0).getWeather_data().get(position).getDayPictureUrl());
        holder.nightImage.setImageURI(mWeatherInfo.getResults().get(0).getWeather_data().get(position).getNightPictureUrl());
    }

    @Override
    public int getItemCount() {
        if (mWeatherInfo != null && mWeatherInfo.getResults() != null && mWeatherInfo.getResults().get(0).getWeather_data() != null) {
            return mWeatherInfo.getResults().get(0).getWeather_data().size();
        }
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ItemBinding mItemBinding;
        SimpleDraweeView dayImage,nightImage;

        public MyViewHolder(ItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.mItemBinding = itemBinding;
            dayImage = (SimpleDraweeView) itemView.findViewById(R.id.dayimage);
            nightImage = (SimpleDraweeView) itemView.findViewById(R.id.nightimage);

        }
    }

}
