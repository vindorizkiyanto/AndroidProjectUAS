package com.example.diet_in;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherArtikel extends AppCompatActivity {

    ImageView imageView;
    TextView title, deskripsi;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_artikel);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        imageView = findViewById(R.id.another_ArtikelView);
        title = findViewById(R.id.textJudul);
        deskripsi = findViewById(R.id.deskripsitext);

        if (position == 0){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("gambar");
            String aTitle = intent.getStringExtra("judul");
            String aDeskripsi =intent.getStringExtra("deskripsi");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            deskripsi.setText(aDeskripsi);

            actionBar.setTitle(aTitle);
        }

        if (position == 1){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("gambar");
            String aTitle = intent.getStringExtra("judul");
            String aDeskripsi =intent.getStringExtra("deskripsi");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            deskripsi.setText(aDeskripsi);

            actionBar.setTitle(aTitle);
        }

        if (position == 2){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("gambar");
            String aTitle = intent.getStringExtra("judul");
            String aDeskripsi =intent.getStringExtra("deskripsi");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            deskripsi.setText(aDeskripsi);

            actionBar.setTitle(aTitle);
        }

        if (position == 3){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("gambar");
            String aTitle = intent.getStringExtra("judul");
            String aDeskripsi =intent.getStringExtra("deskripsi");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            deskripsi.setText(aDeskripsi);

            actionBar.setTitle(aTitle);
        }

        if (position == 4){
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("gambar");
            String aTitle = intent.getStringExtra("judul");
            String aDeskripsi =intent.getStringExtra("deskripsi");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            deskripsi.setText(aDeskripsi);

            actionBar.setTitle(aTitle);
        }

    }


}