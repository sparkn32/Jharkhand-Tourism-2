package com.example.abhinav.jharkhand;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Info14 extends Activity {
    Button b,b1;
    ImageButton ib;
    TextView tv;
    TextToSpeech tts;
    ViewFlipper vf;

    @Override
    protected void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();

        }
        super.onDestroy();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info14);
        b=(Button)findViewById(R.id.button2);
        b1=(Button)findViewById(R.id.button1);
        ib=(ImageButton)findViewById(R.id.imageButton1);
        tv=(TextView)findViewById(R.id.textView1);
        tv.setMovementMethod(new ScrollingMovementMethod());
        tts=new TextToSpeech(Info14.this,null);
        vf=(ViewFlipper)findViewById(R.id.viewFlipper1);
        vf.setFlipInterval(2000);
        vf.startFlipping();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=tv.getText().toString();
                tts.setPitch(0);
                tts.setSpeechRate(0);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    tts.speak(data,TextToSpeech.QUEUE_FLUSH,null,null);
                } else {
                    tts.speak(data, TextToSpeech.QUEUE_FLUSH, null);
                }

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Info14.this,Map14.class);
                startActivity(i);
            }
        });
    }
}
