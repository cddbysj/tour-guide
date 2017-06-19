package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by billwen on 2017/6/14.
 */

public class AnotherSiteAdapter extends ArrayAdapter<Site> {
    public AnotherSiteAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Site> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //获取当前位置上的Site对象
        Site site = getItem(position);
        //创建一个容器视图用于缓存
        ViewHolder vh = new ViewHolder();
        //检查当前位置上是否有可复用的视图
        if (convertView == null) {
            //如果没有可复用的视图，使用布局生成器LayoutInflater生成视图
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.anoter_item_site, parent, false);
            //实例化列表项视图中的控件
            vh.tvName = (TextView) convertView.findViewById(R.id.text_name);
            vh.tvDescription = (TextView) convertView.findViewById(R.id.text_description);
            vh.tvAddress = (TextView) convertView.findViewById(R.id.text_address);
            vh.btnTelephoneNumber = (Button) convertView.findViewById(R.id.text_telephone_number);
            vh.tvOpeningTime = (TextView) convertView.findViewById(R.id.text_opening_time);
            //
            convertView.setTag(vh);
        } else vh = (ViewHolder) convertView.getTag();
        assert site != null;
        vh.tvName.setText(site.getName());
        vh.tvDescription.setText(site.getDescription());
        vh.tvAddress.setText(site.getAddress());
        vh.btnTelephoneNumber.setText(site.getTelephoneNumber());
        vh.tvOpeningTime.setText(site.getOpeningTime());
        return convertView;
    }

    private static class ViewHolder {
        TextView tvName;
        TextView tvDescription;
        TextView tvAddress;
        Button btnTelephoneNumber;
        TextView tvOpeningTime;
    }
}
