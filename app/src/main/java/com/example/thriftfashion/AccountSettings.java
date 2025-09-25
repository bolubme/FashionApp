package com.example.thriftfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AccountSettings extends AppCompatActivity {
    private ImageView imageMenu;
    private ImageView imageSearch;
    private  ImageView imageBag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);



        imageMenu = (ImageView) findViewById(R.id.imageMenu);
        imageSearch = (ImageView) findViewById(R.id.imageSearch);
        imageBag = (ImageView) findViewById(R.id.imageBag);
        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountSettings.this, Menu.class);
                startActivity(intent);
            }
        });

        imageSearch.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountSettings.this, Search.class);
                startActivity(intent);
            }
        }));

        imageBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountSettings.this, cart.class);
                startActivity(intent);
            }
        });
    }
}