package com.example.diet_in;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;

public class ButtonMenu extends AppCompatActivity implements OnClickListener {

    private MenuForm form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_menu);

        form = new MenuForm(this);

        form.getButtonPil1().setOnClickListener(this);
        form.getBtnPil2().setOnClickListener(this);
        form.getBtnPil3().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == form.getButtonPil1()){
            Intent intent = new Intent(this,ListMenu2.class);
            startActivity(intent);
        }else if(v == form.getBtnPil2()){
            Intent intent = new Intent(this,ListMenu.class);
            startActivity(intent);
        }else if(v == form.getBtnPil3()){
            Intent intent = new Intent(this,ListMenu3.class);
            startActivity(intent);
        }
    }
}