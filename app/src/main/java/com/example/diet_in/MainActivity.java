package com.example.diet_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private MenuForm form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        form = new MenuForm(this);

        form.getButtonMenu().setOnClickListener(this);
        form.getBtnArtikel().setOnClickListener(this);
        form.getBtnCatatan().setOnClickListener(this);
        form.getBtnPengingat().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == form.getButtonMenu()){
            Intent intent = new Intent(this,ButtonMenu.class);
            startActivity(intent);
        }else if(v == form.getBtnArtikel()){
            Intent intent = new Intent(this, Info.class);
            startActivity(intent);
        }else if(v == form.getBtnCatatan()){
            Intent intent = new Intent(this, Catatan.class);
            startActivity(intent);
        }else if(v == form.getBtnPengingat()){
            Intent intent = new Intent(this, Alarm.class);
            startActivity(intent);
        }
    }
}