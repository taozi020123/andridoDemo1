package com.sict.andridodemo1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class lianxihuichuan2 extends AppCompatActivity implements View.OnClickListener {
    private Button button2;
    private TextView text2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lianxihuichuan2);
        button2 = (Button) findViewById(R.id.button2);
        text2 = (TextView) findViewById(R.id.text2);
        button2.setOnClickListener(this);
        Intent intent=getIntent();
        String string=intent.getStringExtra("date1");
        text2.setText(string);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        intent.putExtra("date2","hellow,MainActivity");
        setResult(2,intent);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}