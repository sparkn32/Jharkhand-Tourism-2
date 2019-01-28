package com.example.abhinav.jharkhand;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PageChange extends Activity {
    ImageButton iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12,iv13,iv14,iv15,iv16,iv17,iv18,iv19,iv20,iv21;
    Button b;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        iv1=findViewById(R.id.imageButton1);
        iv2=findViewById(R.id.imageButton2);
        iv3=findViewById(R.id.imageButton3);
        iv4=findViewById(R.id.imageButton4);
        iv5=findViewById(R.id.imageButton5);
        iv6=findViewById(R.id.imageButton6);
        iv7=findViewById(R.id.imageButton7);
        iv8=findViewById(R.id.imageButton8);
        iv9=findViewById(R.id.imageButton9);
        iv10=findViewById(R.id.imageButton10);
        iv11=findViewById(R.id.imageButton11);
        iv12=findViewById(R.id.imageButton12);
        iv13=findViewById(R.id.imageButton13);
        iv14=findViewById(R.id.imageButton14);
        iv15=findViewById(R.id.imageButton15);
        iv16=findViewById(R.id.imageButton16);
        iv17=findViewById(R.id.imageButton17);
        iv18=findViewById(R.id.imageButton18);
        iv19=findViewById(R.id.imageButton19);
        iv20=findViewById(R.id.imageButton20);
        iv21=findViewById(R.id.imageButton21);
        b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Feedback.class);
                startActivity(i);
            }
        });
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info1.class);
                startActivity(i);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info2.class);
                startActivity(i);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info3.class);
                startActivity(i);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info4.class);
                startActivity(i);
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info5.class);
                startActivity(i);
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info6.class);
                startActivity(i);
            }
        });
        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info7.class);
                startActivity(i);
            }
        });
        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info8.class);
                startActivity(i);
            }
        });
        iv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info9.class);
                startActivity(i);
            }
        });
        iv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info10.class);
                startActivity(i);
            }
        });
        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info11.class);
                startActivity(i);
            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info12.class);
                startActivity(i);
            }
        });
        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info13.class);
                startActivity(i);
            }
        });
        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info14.class);
                startActivity(i);
            }
        });
        iv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info15.class);
                startActivity(i);
            }
        });
        iv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info16.class);
                startActivity(i);
            }
        });
        iv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info17.class);
                startActivity(i);
            }
        });
        iv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info18.class);
                startActivity(i);
            }
        });
        iv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info19.class);
                startActivity(i);
            }
        });
        iv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Info20.class);
                startActivity(i);
            }
        });
        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PageChange.this,Tab.class);
                startActivity(i);
            }
        });
    }
}
