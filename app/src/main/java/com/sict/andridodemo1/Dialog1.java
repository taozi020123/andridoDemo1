package com.sict.andridodemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dialog1 extends AppCompatActivity implements View.OnClickListener{
    private Button button_pt;
    private Button button_dx;
    private Button button_mx;
    private Button button_jd;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog1);
        button_pt = (Button) findViewById(R.id.button_pt);
        button_dx = (Button) findViewById(R.id.button11_dx);
        button_mx = (Button) findViewById(R.id.button12_mx);
        button_jd = (Button) findViewById(R.id.button13_jd);
        button_pt.setOnClickListener(this);
        button_dx.setOnClickListener(this);
        button_jd.setOnClickListener(this);
        button_mx.setOnClickListener(this);


    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_pt:
                new AlertDialog.Builder(this)
                        .setTitle("Dialog对话框")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Dialog1.this, "你点击了确定按钮", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("取消",null)
                    .create()
                        .show();
                break;
            case R.id.button11_dx:
                new AlertDialog.Builder(this)
                        .setTitle("请选择性别")
                        .setIcon(R.mipmap.ic_launcher)
                        .setSingleChoiceItems(new String[]{"男","女"},0,null)
                        .setPositiveButton("确定",null)
                        .show();
                break;
            case R.id.button12_mx:
                new AlertDialog.Builder(this)
                        .setTitle("请添加兴趣爱好")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMultiChoiceItems(new String[]{"学习","旅游","读书"},null,null)
                        .setPositiveButton("确定",null)
                        .show();
                break;
            case R.id.button13_jd:
                progressDialog=new ProgressDialog(this);
                progressDialog.setTitle("进度条对话框");
                progressDialog.setMessage("正在下载，请等候");
                progressDialog.setIcon(R.mipmap.ic_launcher);
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.show();

        }


    }
}