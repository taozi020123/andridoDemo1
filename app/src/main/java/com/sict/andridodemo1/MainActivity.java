package com.sict.andridodemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{
    private ImageView imageView26;
    private ImageView imageView27;
    private EditText editTextTextPersonName2;
    private EditText editTextTextPersonName3;
    private TextView textView11;
    private TextView textView16;
    private Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView27 = (ImageView) findViewById(R.id.imageView27);
        editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView16 = (TextView) findViewById(R.id.textView16);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,second.class);
        intent.putExtra("name",editTextTextPersonName2.getText().toString().trim());
        intent.putExtra("password",editTextTextPersonName3.getText().toString().trim());
        startActivity(intent);
    }
}
