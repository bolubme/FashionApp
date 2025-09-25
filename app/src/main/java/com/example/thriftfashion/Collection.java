package com.example.thriftfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Collection extends AppCompatActivity {
    private ImageView imageMenu;
    private ImageView imageSearch;
    private  ImageView imageBag;
    private TextView txtSummercollection;
    private ImageView imageImageTwentyOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);



        imageMenu = (ImageView) findViewById(R.id.imageMenu);
        imageSearch = (ImageView) findViewById(R.id.imageSearch);
        imageBag = (ImageView) findViewById(R.id.imageBag);
        txtSummercollection = (TextView) findViewById(R.id.txtSummercollection);
        imageImageTwentyOne = (ImageView) findViewById(R.id.imageImageTwentyOne);

        imageImageTwentyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Collection.this, CollectionDetail.class);
                startActivity(intent);
            }
        });

        txtSummercollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Collection.this, CollectionDetail.class);
                startActivity(intent);
            }
        });


        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Collection.this, Menu.class);
                startActivity(intent);
            }
        });

        imageSearch.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Collection.this, Search.class);
                startActivity(intent);
            }
        }));

        imageBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Collection.this, cart.class);
                startActivity(intent);
            }
        });
    }
}