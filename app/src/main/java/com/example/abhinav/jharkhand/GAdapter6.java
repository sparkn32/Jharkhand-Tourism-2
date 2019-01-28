package com.example.abhinav.jharkhand;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GAdapter6 extends BaseAdapter {
    private Context mContext;
    public GAdapter6(Context context){
        mContext = context;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i = new ImageView(mContext);
        i.setImageResource(mImageIds[position]);
        i.setLayoutParams(new Gallery.LayoutParams(200,200));
        i.setScaleType(ImageView.ScaleType.FIT_XY);
        return i;
    }
    public Integer[] mImageIds ={
            R.drawable.palamau2,R.drawable.palamau1, R.drawable.palamau3
    };
}
