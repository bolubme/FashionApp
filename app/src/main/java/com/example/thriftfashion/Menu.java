package com.example.thriftfashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private ImageView imageClose;
    private TextView txtHome;
    private TextView txtAbout;
    private TextView txtContact;
    private LinearLayout linearStorelocator;
    private LinearLayout linearStorelocator1;
    private LinearLayout linearStorelocator2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        txtAbout = (TextView) findViewById(R.id.txtAbout);
        txtContact = (TextView) findViewById(R.id.txtContact);
        txtHome = (TextView) findViewById(R.id.txtHome);
        imageClose = (ImageView) findViewById(R.id.imageClose);
        linearStorelocator = (LinearLayout) findViewById(R.id.linearStorelocator);
        linearStorelocator1 = (LinearLayout) findViewById(R.id.linearStorelocator1);
        linearStorelocator2 = (LinearLayout) findViewById(R.id.linearStorelocator2);



        linearStorelocator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, StartOne.class);
                startActivity(intent);
            }
        });

        linearStorelocator1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MyProfile.class);
                startActivity(intent);
            }
        });

        linearStorelocator2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Review.class);
                startActivity(intent);
            }
        });


        imageClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, AboutUs.class);
                startActivity(intent);
            }
        });

        txtContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Contact.class);
                startActivity(intent);
            }
        });

        txtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, HomePage.class);
                startActivity(intent);
            }
        });




    }


}