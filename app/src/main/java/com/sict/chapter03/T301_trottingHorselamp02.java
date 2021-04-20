package com.sict.chapter03;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.sict.andridodemo1.R;

public class T301_trottingHorselamp02 extends Activity {
    //1.资源准备（图片、变量、控件）
    //1.1普通资源
    int[]imSrc={R.drawable.t301_chicken,R.drawable.t301_cow,R.drawable.t301_dog,R.drawable.t301_horse,R.drawable.t301_mokey,R.drawable.t301_rat,};
    int current=0;//当前播放到第几张图片
    //1.2控件
    ImageView activity_t301_iv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t301_trotting_horselamp);
        Button activity_t301_btn_up=findViewById(R.id.activity_t301_btn_up);
        Button activity_t301_btn_down=findViewById(R.id.activity_t301_btn_down);
        activity_t301_iv=findViewById(R.id.activity_t301_iv);
        //2.创建外部类实现的事件监听器

        //3.将事件监听器对象绑定到我们的事件源上（两个按钮）
        T301_myListener Listener=new T301_myListener(current,imSrc,activity_t301_iv);
        activity_t301_btn_up.setOnClickListener(Listener);
        activity_t301_btn_down.setOnClickListener(Listener);
    }


}
