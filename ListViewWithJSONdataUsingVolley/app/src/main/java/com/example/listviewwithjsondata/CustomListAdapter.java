package com.example.listviewwithjsondata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter {

    private List<ListItem> listData;
    private final Context context;

    public CustomListAdapter(Context context,List<ListItem> listData) {
        super(context, R.layout.list_items,listData);
        this.context = context;
        this.listData = listData;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowVieW = inflater.inflate(R.layout.list_items,null,true);
        TextView item_name = (TextView)rowVieW.findViewById(R.id.item_name);
        TextView item_description = (TextView)rowVieW.findViewById(R.id.item_description);
        ImageView item_image = (ImageView)rowVieW.findViewById(R.id.item_image);

        ListItem listItem = listData.get(position);
        item_name.setText(listItem.getItem_name());
        item_description.setText(listItem.getItem_description());
        Glide.with(context).load(listItem.getItem_image()).format(DecodeFormat.PREFER_ARGB_8888).placeholder(R.drawable.image_placeholder).into(item_image);
        return rowVieW;
    }
}
