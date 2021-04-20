package com.sict.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.sict.andridodemo1.R;
//内部类
public class T301_trottingHorselamp extends AppCompatActivity {


    //资源的准备--被事件处理器调用的资源，需要提前定义和赋值（定义需要在onCreat方法之外）
    //1.1普通资源
    int[]imSrc={R.drawable.t301_chicken,R.drawable.t301_cow,R.drawable.t301_dog,R.drawable.t301_horse,R.drawable.t301_mokey,R.drawable.t301_rat,};
    int current=0;//当前播放到第几张图片
    //1.2控件
     ImageView activity_t301_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t301_trotting_horselamp);
        Button activity_t301_btn_up=findViewById(R.id.activity_t301_btn_up);
        Button activity_t301_btn_down=findViewById(R.id.activity_t301_btn_down);
        activity_t301_iv=findViewById(R.id.activity_t301_iv);
        //2.创建一个事件监听器
        //3.将事件监听器绑定到事件源上
        activity_t301_btn_up.setOnClickListener(new MyListener());
        activity_t301_btn_down.setOnClickListener(new MyListener());
    }
class MyListener implements View.OnClickListener{
    //事件处理器
        @Override
    public void onClick(View v) {
        //区分事件源
   if(v.getId()==R.id.activity_t301_btn_up){
       //被点击的是上一页
       //显示上一页
       if(current==0)//当前在第一页，第一页的上一页是最后一页
           current=imSrc.length-1;
       else
           current--;
       //显示出数组当中的第current张图片
       activity_t301_iv.setImageResource(imSrc[current]);
   }else if(v.getId()==R.id.activity_t301_btn_down){
       if(current==imSrc.length-1)
           current=0;
       else
           current++;
       activity_t301_iv.setImageResource(imSrc[current]);
   }



    }
}

}