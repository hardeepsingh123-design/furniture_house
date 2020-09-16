package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import  android.view.View;
import android.view.WindowManager;
import android.content.Intent;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        signup=findViewById(R.id.btnsignup)
                signup.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v){
                        Intent intent=new Intent(  MainActivity.this,signup_activity.class);
                        startActivity(intent);
                    }
                });
    }
}