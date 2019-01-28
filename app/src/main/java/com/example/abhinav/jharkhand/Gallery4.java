package com.example.abhinav.jharkhand;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class Gallery4 extends Activity {
    ImageView selectedImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery4);
        Gallery gallery1=(Gallery) findViewById(R.id.gallery);
        selectedImage=(ImageView)findViewById(R.id.imageView);
        gallery1.setSpacing(1);
        final GAdapter4 galleryImageAdapter=new GAdapter4(this);
        gallery1.setAdapter(galleryImageAdapter);
        gallery1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedImage.setImageResource(galleryImageAdapter.mImageIds[position]);
            }
        });
    }
}
