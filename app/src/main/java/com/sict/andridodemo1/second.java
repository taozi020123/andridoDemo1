package com.sict.andridodemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TableLayout;
import android.widget.TextView;

public class second extends AppCompatActivity {
    private ImageView imageView15;
    private ImageView haima;
    private TextView mima;
    private TextView textView19;
    private TableLayout tableLayout;
    private TextView textView22;
    private ProgressBar progressBar1;
    private TextView life1;
    private TextView textView23;
    private ProgressBar progressBar2;
    private TextView attack1;
    private TextView textView26;
    private ProgressBar progressBar3;
    private TextView speed1;
    private Button goumai;
    private TextView yonghuming;
    private  TextView life2;
    private  TextView attack2;
    private  TextView speed2;
    private TextView mNameTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView15 = (ImageView) findViewById(R.id.imageView15);
        haima = (ImageView) findViewById(R.id.haima);
        mima = (TextView) findViewById(R.id.mima);
        textView19 = (TextView) findViewById(R.id.textView19);
        tableLayout = (TableLayout) findViewById(R.id.tableLayout);
        textView22 = (TextView) findViewById(R.id.textView22);
        progressBar1 = (ProgressBar) findViewById(R.id.progressBar1);
        life1 = (TextView) findViewById(R.id.life1);
        textView23 = (TextView) findViewById(R.id.textView23);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        attack1 = (TextView) findViewById(R.id.attack1);
        textView26 = (TextView) findViewById(R.id.textView26);
        progressBar3 = (ProgressBar) findViewById(R.id.progressBar3);
        speed1 = (TextView) findViewById(R.id.speed1);
        goumai = (Button) findViewById(R.id.goumai);
        yonghuming = (TextView) findViewById(R.id.yonghuming);
        life2=(TextView)findViewById(R.id.life1) ;
        attack2=(TextView)findViewById(R.id.attack1) ;
        speed2=(TextView)findViewById(R.id.speed1) ;
        Intent intent = getIntent();
        String name=intent.getStringExtra("name");
        String password=intent.getStringExtra("password");
        yonghuming.setText("用户名:"+name);
        mima.setText("密码:"+password);
        progressBar1.setMax(500);
        progressBar2.setMax(500);
        progressBar3.setMax(500);

    }


    public void click(View v) {
        Intent intent=new Intent(this,shop.class);
        startActivityForResult(intent,1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data!=null){
            if (requestCode==1){
                if (resultCode==1){
                    ItemInfo info=(ItemInfo)data.getSerializableExtra("equipment");
                    int progress1= progressBar1.getProgress();
                    int progress2= progressBar2.getProgress();
                    int progress3= progressBar3.getProgress();
                    progressBar1.setProgress(progress1+info.getLife());
                    progressBar2.setProgress(progress2+info.getAttack());
                   progressBar3.setProgress(progress3+info.getSpeed());
                    life2.setText(progressBar1.getProgress()+"");
                    attack2.setText(progressBar2.getProgress()+"");
                    speed2.setText(progressBar3.getProgress()+"");

                }
            }
        }
    }
}