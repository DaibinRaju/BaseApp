package com.example.baseapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void clicked1(View view) {
        TextView myText1=(TextView) findViewById(R.id.myText1);
        myText1.setText("hello world");
    }

    public void clicked2(View view) {
        Intent i = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(i);
    }
}
