package com.sict.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sict.andridodemo1.R;

public class P301_clickCount extends AppCompatActivity {
    //1.资源准备
Button activity_p301_btn;
int count=0;
//计数器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p301_click_count);
        activity_p301_btn=findViewById(R.id.activity_p301_btn);
        //2.创建一个监听器类
        //3.将事件监听器对象绑定到按钮上
        activity_p301_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                activity_p301_btn.setText("我被点击了"+count+"次");
            }
        });
    }
}