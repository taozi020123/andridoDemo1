package com.sict.chapter03;

import android.view.View;
import android.widget.ImageView;

import com.sict.andridodemo1.R;

public class T301_myListener implements View.OnClickListener{
int current;
int[]imSrc;
ImageView activity_t301_iv;
//构造函数：当创建本对象时必须传过三参数
    public T301_myListener(int current,int[]imSrc,ImageView activity_t301_iv){
        this.current=current;
        this.imSrc=imSrc;
        this.activity_t301_iv=activity_t301_iv;
    }
    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.activity_t301_btn_up){
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
