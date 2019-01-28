package com.example.abhinav.jharkhand;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GAdapter2 extends BaseAdapter {
    private Context mContext;
    public GAdapter2(Context context){
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
            R.drawable.maithon1,R.drawable.maithon2, R.drawable.maithon3,R.drawable.maithon4,
            R.drawable.hundru1,R.drawable.hundru2,R.drawable.hundru3,
            R.drawable.khandoli1,R.drawable.khandoli2,R.drawable.khandoli3,R.drawable.khandoli4
    };
}
