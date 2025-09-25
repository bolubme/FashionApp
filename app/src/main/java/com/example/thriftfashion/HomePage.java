package com.example.thriftfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomePage extends AppCompatActivity {

    private ImageView imageMenu;
    private ImageView imageSearch;
    private  ImageView imageBag;



    private LinearLayout linearButton;
    private LinearLayout linearButton1;
    private LinearLayout linearProduct21;
    private LinearLayout linearProduct1;
    private LinearLayout linearProduct2;
    private LinearLayout linearProduct;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        imageMenu = (ImageView) findViewById(R.id.imageMenu);
        imageSearch = (ImageView) findViewById(R.id.imageSearch);
        imageBag = (ImageView) findViewById(R.id.imageBag);
        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, Menu.class);
                startActivity(intent);
            }
        });

        imageSearch.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, Search.class);
                startActivity(intent);
            }
        }));

        imageBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, cart.class);
                startActivity(intent);
            }
        });







        linearButton = (LinearLayout) findViewById(R.id.linearButton);
        linearButton1 = (LinearLayout) findViewById(R.id.linearButton1);
        linearProduct21 = (LinearLayout) findViewById(R.id.linearProduct21);
        linearProduct = (LinearLayout) findViewById(R.id.linearProduct);
        linearProduct1 = (LinearLayout) findViewById(R.id.linearProduct1);
        linearProduct2 = (LinearLayout) findViewById(R.id.linearProduct2);





        linearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCollectionActivity();
            }
        });

        linearButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGridActivity();
            }
        });

        linearProduct21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductDetailsActivity();
            }
        });

        linearProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductDetailsActivity();
            }
        });

        linearProduct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductDetailsActivity();
            }
        });

        linearProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductDetailsActivity();
            }
        });

    }







    public void openCollectionActivity()
    {
        Intent intent = new Intent(HomePage.this, Collection.class);
        startActivity(intent);
    }

    public void openGridActivity()
    {
        Intent intent = new Intent(HomePage.this, CategoryGridView.class);
        startActivity(intent);
    }

    public void openProductDetailsActivity()
    {
        Intent intent = new Intent(HomePage.this, ProductDetails.class);
        startActivity(intent);
    }





}