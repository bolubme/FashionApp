package com.example.thriftfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CategoryGridView extends AppCompatActivity {


    private ImageView imageMenu;
    private ImageView imageSearch;
    private  ImageView imageBag;
    private ImageButton btnSort;
    private ImageButton btnComputer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_grid_view);


        btnComputer = (ImageButton) findViewById(R.id.btnComputer);
        btnSort = (ImageButton) findViewById(R.id.btnSort);
        imageMenu = (ImageView) findViewById(R.id.imageMenu);
        imageSearch = (ImageView) findViewById(R.id.imageSearch);
        imageBag = (ImageView) findViewById(R.id.imageBag);
        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGridView.this, Menu.class);
                startActivity(intent);
            }
        });

        imageSearch.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGridView.this, Search.class);
                startActivity(intent);
            }
        }));

        imageBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGridView.this, cart.class);
                startActivity(intent);
            }
        });

        btnSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGridView.this, CategoryListview.class);
                startActivity(intent);
            }
        });

        btnComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGridView.this, CategoryGridViewFull.class);
                startActivity(intent);
            }
        });
    }




}