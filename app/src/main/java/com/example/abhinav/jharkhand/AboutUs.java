package com.example.abhinav.jharkhand;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageButton;
import android.widget.TextView;

public class AboutUs extends Activity {
ImageButton ib;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutus);
		TextView tv=(TextView)findViewById(R.id.textView1);
		tv.setText(Html.fromHtml("<p><u>About Us:-</u></p>"));
        // Font path
        String fontPath = "fonts/android_7.ttf";
        String fontPath1 = "fonts/angelina.ttf";
        String fontPath2 = "fonts/Altoys.ttf";
        
        // text view label
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);
        TextView tv6 = (TextView) findViewById(R.id.textView6);
        TextView tv7 = (TextView) findViewById(R.id.textView7);
        TextView tv8 = (TextView) findViewById(R.id.textView8);
        TextView tv9 = (TextView) findViewById(R.id.textView9);
        TextView tv10 = (TextView) findViewById(R.id.textView10);
        TextView tv11 = (TextView) findViewById(R.id.textView11);
        TextView tv12 = (TextView) findViewById(R.id.textView12);
        TextView tv13 = (TextView) findViewById(R.id.textView13);
        TextView tv14 = (TextView) findViewById(R.id.textView14);
        TextView tv15 = (TextView) findViewById(R.id.textView15);
        
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);
        Typeface tf2 = Typeface.createFromAsset(getAssets(), fontPath2);
        // Applying font
        tv2.setTypeface(tf2);
        tv3.setTypeface(tf2);
        tv4.setTypeface(tf);
        tv6.setTypeface(tf2);
        tv7.setTypeface(tf2);
        tv8.setTypeface(tf2);
        tv9.setTypeface(tf2);
        tv10.setTypeface(tf);
        tv11.setTypeface(tf1);
        tv12.setTypeface(tf2);
        tv13.setTypeface(tf2);
        tv14.setTypeface(tf2);
        tv15.setTypeface(tf2);
 
	}

}
