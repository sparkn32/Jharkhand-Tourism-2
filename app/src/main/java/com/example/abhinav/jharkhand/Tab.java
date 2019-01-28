package com.example.abhinav.jharkhand;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Tab extends TabActivity {
    TabHost th;
    Resources res;
    TabHost.TabSpec ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab);
        th=getTabHost();
        res=getResources();
        ts=th.newTabSpec("f").setIndicator(null,res.getDrawable(R.drawable.grid1)).setContent(new Intent(Tab.this,Grid1.class));
        th.addTab(ts);
        ts=th.newTabSpec("g").setIndicator(null,res.getDrawable(R.drawable.list1)).setContent(new Intent(Tab.this,List1.class));
        th.addTab(ts);
        ts=th.newTabSpec("h").setIndicator(null,res.getDrawable(R.drawable.list2)).setContent(new Intent(Tab.this,List2.class));
        th.addTab(ts);
        th.setCurrentTab(0);
    }
}
