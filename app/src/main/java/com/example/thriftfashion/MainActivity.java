package com.example.thriftfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Button btnLetsStart;
FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLetsStart = (Button) findViewById(R.id.btnLetsStart);
        mAuth = FirebaseAuth.getInstance();
        btnLetsStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2()
    {
        Intent intent = new Intent(MainActivity.this, HomePage.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
//        if(user == null){
//            startActivity(new Intent(MainActivity.this, MainActivity.class));
//        }
    }
}