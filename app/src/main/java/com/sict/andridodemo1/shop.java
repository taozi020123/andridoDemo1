package com.sict.andridodemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class shop extends AppCompatActivity implements View.OnClickListener {
    private ItemInfo itemInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        itemInfo=new ItemInfo(100,200,50,"雷虎");
        findViewById(R.id.rl).setOnClickListener(this);
        TextView life2= (TextView) findViewById(R.id.life1);
        TextView attack2 = (TextView) findViewById(R.id.attack1);
        TextView speed2 = (TextView) findViewById(R.id.speed1);
        TextView mNameTV=(TextView)findViewById(R.id.shangpinmingcheng);
        life2.setText("生命值"+itemInfo.getLife());
        speed2.setText("敏捷值"+itemInfo.getSpeed());
        attack2.setText("攻击力"+itemInfo.getAttack());
        mNameTV.setText(itemInfo.getName());

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        intent.putExtra("equipment",itemInfo);
        setResult(1,intent);
        finish();
    }
}