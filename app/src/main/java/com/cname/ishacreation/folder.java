package com.cname.ishacreation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class folder extends AppCompatActivity {

    LinearLayout logo, card, banner, About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder);

        logo = findViewById(R.id.logo);
        card = findViewById(R.id.card);
        banner = findViewById(R.id.banner);
        About = findViewById(R.id.about);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(folder.this, logo.class);
                startActivity(obj);
            }
        });
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj1 = new Intent(folder.this, Card.class);
                startActivity(obj1);
            }
        });
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(folder.this, Banner.class);
                startActivity(obj2);
            }
        });
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(folder.this, about.class);
                startActivity(obj2);
            }
        });


    }
}