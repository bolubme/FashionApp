package com.example.thriftfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartOne extends AppCompatActivity {

    private View viewRectangleTwo;
    private View viewRectangleTwoOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_one);



        viewRectangleTwo = (View) findViewById(R.id.viewRectangleTwo);
        viewRectangleTwoOne = (View) findViewById(R.id.viewRectangleTwoOne);

        viewRectangleTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartOne.this, Login.class);
                startActivity(intent);
            }
        });

        viewRectangleTwoOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartOne.this, Register.class);
                startActivity(intent);
            }
        });
    }
}