package com.sict.andridodemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class T301_dog extends AppCompatActivity {
    ImageView image;
    Button top;
    Button buttom;
    int current=0;
    int[]imSrc={R.drawable.t301_chicken,R.drawable.t301_cow,R.drawable.t301_dog,R.drawable.t301_horse,R.drawable.t301_mokey,R.drawable.t301_rat,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t301_dog);


        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Button top = (Button) findViewById(R.id.top);
        Button buttom = (Button) findViewById(R.id.buttom);
        top.setOnClickListener(new MyListener());
        buttom.setOnClickListener(new MyListener());
    }
    class MyListener implements OnClickListener{

        @Override
        public void onClick(View v) {

        if(v.getId()==R.id.top){
            if(current==0)
                current=imSrc.length-1;

             else

            current--;

            image.setImageResource(imSrc[current]);
            }
        else if (v.getId()==R.id.buttom){
                if(current==imSrc.length-1)
                    current=0;
                 else
             current++;
                 image.setImageResource(imSrc[current]);
                }
            }
        }

        }

