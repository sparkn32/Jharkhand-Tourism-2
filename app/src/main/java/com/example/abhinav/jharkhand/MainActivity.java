package com.example.abhinav.jharkhand;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1=(TextView)findViewById(R.id.textView1);
        TextView tv2=(TextView)findViewById(R.id.textView2);
        TextView tv3=(TextView)findViewById(R.id.textView3);
        TextView tv4=(TextView)findViewById(R.id.textView4);
        String fontPath2="fonts/Altoys.ttf";
        Typeface tf2=Typeface.createFromAsset(getAssets(),fontPath2);
        b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                triggerNotification();
                Intent i=new Intent(MainActivity.this,PageChange.class);
                startActivity(i);
            }
        });
        Button b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,AboutUs.class);
                startActivity(i1);
            }
        });
    }
    private void triggerNotification(){
        String title="Jharkhand Tourism";
        String message="This app provides information about tourists places in Jharkhand";
        NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        Notification notification;
        Intent notificationIntent=new Intent(this,MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,notificationIntent,0);
      /*  //notification.setLatestEventInfo(MainActivity.this, title, message,pendingIntent);
            //    notification.setLatestEventInfo(context, title, message, intent);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;

        // Play default notification sound
        notification.defaults |= Notification.DEFAULT_SOUND;

        // Vibrate if vibrate is enabled
        notification.defaults |= Notification.DEFAULT_VIBRATE;
        notificationManager.notify(0, notification);*/
        Notification.Builder builder = new Notification.Builder(MainActivity.this);

        builder.setAutoCancel(false);
       // builder.setTicker("this is ticker text");
        builder.setContentTitle(title);
        builder.setContentText(message);
        builder.setSmallIcon(R.drawable.jh2);
        builder.setContentIntent(pendingIntent);
        builder.setWhen(System.currentTimeMillis());
        builder.setOngoing(false);
       // builder.setSubText("This is subtext...");   //API level 16

        builder.setNumber(100);
        builder.build();

        notification = builder.getNotification();
        notification.flags |= Notification.FLAG_AUTO_CANCEL;

        // Play default notification sound
        notification.defaults |= Notification.DEFAULT_SOUND;

        // Vibrate if vibrate is enabled
        notification.defaults |= Notification.DEFAULT_VIBRATE;
        notificationManager.notify(11, notification);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
