package com.example.abhinav.jharkhand;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class Splash extends Activity {

    private ViewSwitcher viewSwitcher;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        new LoadViewTask().execute();
        // Font path
        String fontPath = "fonts/android_7.ttf";
        String fontPath1 = "fonts/angelina.ttf";
        String fontPath2 = "fonts/Altoys.ttf";

        // text view label
        TextView txtGhost = (TextView) findViewById(R.id.tv_loadingtext);
       /* TextView tv1=(TextView)findViewById(R.id.textView1);
        TextView tv2=(TextView)findViewById(R.id.textView2);
        TextView tv3=(TextView)findViewById(R.id.textView3);*/

        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);
        Typeface tf2 = Typeface.createFromAsset(getAssets(), fontPath2);

        // Applying font
        txtGhost.setTypeface(tf1);
       /* tv1.setTypeface(tf2);
        tv2.setTypeface(tf);
        tv3.setTypeface(tf2);*/
    }

    private class LoadViewTask extends AsyncTask<Void, Integer, Void>
    {
        private TextView tv_progress;
        private ProgressBar pb_progressBar;
        @Override
        protected void onPreExecute()
        {
            viewSwitcher = new ViewSwitcher(Splash.this);
            viewSwitcher.addView(ViewSwitcher.inflate(Splash.this, R.layout.splash, null));
            tv_progress = (TextView) viewSwitcher.findViewById(R.id.tv_progress);
            pb_progressBar = (ProgressBar) viewSwitcher.findViewById(R.id.pb_progressbar);
            pb_progressBar.setMax(100);
            setContentView(viewSwitcher);
        }
        @Override
        protected Void doInBackground(Void... params)
        {
            try
            {
                synchronized (this)
                {
                    int counter = 0;
                    while(counter <= 10)
                    {
                        this.wait(200);
                        counter++;
                        publishProgress(counter*10);
                    }
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            return null;
        }
        @Override
        protected void onProgressUpdate(Integer... values)
        {
            if(values[0] <= 100)
            {
                tv_progress.setText("Progress: " + Integer.toString(values[0]) + "%");
                pb_progressBar.setProgress(values[0]);
            }
        }

        @Override
        protected void onPostExecute(Void result) {
            Intent i=new Intent(Splash.this,MainActivity.class);
            startActivity(i);
            super.onPostExecute(result);
        }
    }

}
