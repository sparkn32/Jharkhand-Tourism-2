package com.example.abhinav.jharkhand;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Map4 extends Activity {
    WebView wv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.map);

        wv=(WebView)findViewById(R.id.webView1);
        wv.loadUrl("https://www.google.co.in/maps/place/Deori+Mandir/@23.0480302,85.6722879,14z/data=!4m5!3m4!1s0x39f5a6a9b0e7dfc5:0xc3e41bc84f982427!8m2!3d23.0461347!4d85.682888");
        WebSettings ws=wv.getSettings();
        ws.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        ws.setBuiltInZoomControls(true);
        ws.setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyView());
    }
    class MyView extends WebViewClient{
        ProgressDialog pd=new ProgressDialog(Map4.this);

        @Override
        public void onPageFinished(WebView view, String url) {
            pd.dismiss();
            super.onPageFinished(view, url);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            pd.setTitle("Loading.....");
            pd.setMessage("Page is being loaded");
            pd.show();
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }



    }
}
