package com.nithishmathangi.assingment_1;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isHelloWorld = true;
    private TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void Clicked (View v)
        {
            hello = findViewById(R.id.textview1);
            if (isHelloWorld) {
                hello.setText("Hello World!");
                isHelloWorld = false;
            } else {
                hello.setText("Good Bye World!");
                isHelloWorld = true;
            }
        }
    }
