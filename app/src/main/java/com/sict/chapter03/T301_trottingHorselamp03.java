package com.sict.chapter03;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.sict.andridodemo1.R;
//内部匿名类
public class T301_trottingHorselamp03 extends Activity {
    //1.1普通资源
    int[]imSrc={R.drawable.t301_chicken,R.drawable.t301_cow,R.drawable.t301_dog,R.drawable.t301_horse,R.drawable.t301_mokey,R.drawable.t301_rat,};
    int current=0;//当前播放到第几张图片
    //1.2控件
    ImageView activity_t301_iv;
    //1.资源准备
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t301_trotting_horselamp);
        Button activity_t301_btn_up = findViewById(R.id.activity_t301_btn_up);
        Button activity_t301_btn_down = findViewById(R.id.activity_t301_btn_down);
        activity_t301_iv = findViewById(R.id.activity_t301_iv);
        //2.创建匿名内部类的事件监听器，并将监听器对象绑定到按钮上
        activity_t301_btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //被点击的是上一页
                //显示上一页
                if (current == 0)//当前在第一页，第一页的上一页是最后一页
                    current = imSrc.length - 1;
                else
                    current--;
                //显示出数组当中的第current张图片
                activity_t301_iv.setImageResource(imSrc[current]);
            }
        });
        activity_t301_btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (current == imSrc.length - 1)
                    current = 0;
                else
                    current++;
                activity_t301_iv.setImageResource(imSrc[current]);
            }
        });


    }}











