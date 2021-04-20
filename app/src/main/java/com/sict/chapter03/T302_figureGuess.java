package com.sict.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.sict.andridodemo1.R;

public class T302_figureGuess extends AppCompatActivity implements View.OnClickListener {
    //1.准备资源
//图片资源
    int[]imgSrc={R.drawable.t302_paper,R.drawable.t302_rock,R.drawable.t302_scissors};
   //控件资源
    ImageView activity_t302_iv_phone;
    TextView activity_t302_tv_result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t302_figure_guess);
        activity_t302_iv_phone=findViewById(R.id.activity_t302_iv_phone);
        activity_t302_tv_result=findViewById(R.id.activity_t302_tv_result);
        ImageButton activity_t302_id_paper=findViewById(R.id.activity_t302_ib_paper);
        ImageButton activity_t302_id_rock=findViewById(R.id.activity_t302_ib_rock);
        ImageButton activity_t302_id_scissors=findViewById(R.id.activity_t302_ib_scissors);

   //2.创建事件监听器


   //3.将事件监听器绑定在事件源
        activity_t302_id_paper.setOnClickListener(this);
        activity_t302_id_rock.setOnClickListener(this);
        activity_t302_id_scissors.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        //1.电脑出拳
        //1.1需要一个0、1、2随机整数
        int computerNum=(int)(Math.random()*3);
        //1.2将对应的图片展示到ImageView上

        activity_t302_iv_phone.setImageResource(imgSrc[computerNum]);
        //2.判断输赢
        String result="判定输赢";
        switch (v.getId()){
            case R.id.activity_t302_ib_paper: {//用户出的是布
                //判断电脑出的是什么
                switch (computerNum){
                    case 0://电脑出的是布
                        result="判定输赢，双方平手！";
                        break;
                    case 1:
                        result="判定输赢，恭喜你，你赢了！";
                        break;
                    case 2:
                        result="判断输赢，很可惜，失败了！";
                        break;
                }

                break;
            }
            case R.id.activity_t302_ib_rock :{
                switch (computerNum){
                    case 0://电脑出的是布
                        result="判断输赢，很可惜，失败了！";
                        break;
                    case 1:
                        result="判定输赢，双方平手！";
                        break;
                    case 2:
                        result="判定输赢，恭喜你，你赢了！";
                        break;
                }
                break;
            }
            case R.id.activity_t302_ib_scissors: {
                switch (computerNum){
                    case 0://电脑出的是布
                        result="判定输赢，恭喜你，你赢了！";
                        break;
                    case 1:
                        result="判断输赢，很可惜，失败了！";
                        break;
                    case 2:
                        result="判定输赢，双方平手！";
                        break;}
                break;
            }

        }
        activity_t302_tv_result.setText(result);
    }
}