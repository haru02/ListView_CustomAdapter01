package com.example.froze.listviewex01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.id.text1;

/**
 * Created by froze on 2016-10-08.
 */

public class MyAdapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<DataProvider> data;
    LayoutInflater inflater;

    public MyAdapter(Context context, int layout, ArrayList<DataProvider> data){
        this.context = context;
        this.layout = layout;
        this.data = data;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    static class DataHandler{
        TextView text1;
        TextView text2;
        ImageView imageview;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DataHandler handler;
        View view;
        view = convertView;
        if(convertView == null){
            view = inflater.inflate(layout, parent, false);
            handler = new DataHandler();
            handler.text1 = (TextView)view.findViewById(R.id.textView);
            handler.text2 = (TextView)view.findViewById(R.id.textView2);
            handler.imageview = (ImageView)view.findViewById(R.id.imageView);
            view.setTag(handler);
        }else{
            handler = (DataHandler)view.getTag();
        }
        DataProvider dataProvider;
        dataProvider=(DataProvider)this.getItem(position);
        handler.text1.setText(position+" "+data.get(position).getTitle());
        handler.text2.setText(data.get(position).getName());
        handler.imageview.setImageResource(data.get(position).getImage());
        return view;
    }
}
