package com.example.abhinav.jharkhand;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter1 extends ArrayAdapter<Item> {
    ArrayList<Item> placeList=new ArrayList();

    public MyAdapter1(@NonNull Context context, int resource, ArrayList<Item> placeList) {
        super(context, resource,placeList);
        this.placeList = placeList;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v=convertView;
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v=inflater.inflate(R.layout.list_view_items,null);
        TextView textView = (TextView)v.findViewById(R.id.textView);
        ImageView imageView=(ImageView)v.findViewById(R.id.imageView);
        textView.setText(placeList.get(position).getplaceName());
        imageView.setImageResource(placeList.get(position).getplaceImage());
        return v;
    }
}
