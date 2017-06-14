package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by billwen on 2017/6/11.
 */

public class SiteAdapter extends ArrayAdapter<Site> {
    public SiteAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Site> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //获取对应位置上的Site对象
        Site site = getItem(position);
        ViewHolder vh = new ViewHolder();
        if (convertView == null) {
            //如果当前没有可复用的视图，使用LayoutInflater生成视图
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_site, parent, false);
            vh.tvName = (TextView) convertView.findViewById(R.id.text_name);
            vh.tvAddress = (TextView) convertView.findViewById(R.id.text_address);
            vh.iv = (ImageView) convertView.findViewById(R.id.iv);
            vh.tvDescription = (TextView) convertView.findViewById(R.id.text_description);

            //同时将已经实例化的视图缓存
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        assert site != null;
        vh.tvName.setText(site.getName());
        vh.tvDescription.setText(site.getDescription());
        vh.tvAddress.setText(site.getAddress());
        vh.iv.setImageResource(site.getImageResource());
        return convertView;
    }

    //视图容器类，用来缓存列表项中已经实例化的控件
    private static class ViewHolder {
        TextView tvName;
        TextView tvAddress;
        ImageView iv;
        TextView tvDescription;
    }
}

