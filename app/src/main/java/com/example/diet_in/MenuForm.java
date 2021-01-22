package com.example.diet_in;

import android.app.Activity;
import android.widget.Button;
import android.os.Bundle;

public class MenuForm {

    private Activity activity;
    private Button buttonMenu;
    private Button btnArtikel;
    private Button btnCatatan;
    private Button btnPengingat;
    private Button buttonPil1;
    private Button btnPil2;
    private Button btnPil3;

    public MenuForm(Activity activity){
        this.activity = activity;
        btnPengingat = (Button) activity.findViewById(R.id.btnPengingat);
        buttonMenu = (Button) activity.findViewById(R.id.main_buttonMenu);
        btnArtikel = (Button) activity.findViewById(R.id.btnArtikel);
        btnCatatan   = (Button) activity.findViewById(R.id.btnCatatan);
        buttonPil1 = (Button) activity.findViewById(R.id.main_buttonPil1);
        btnPil2 = (Button) activity.findViewById(R.id.btnPil2);
        btnPil3= (Button) activity.findViewById(R.id.btnPil3);

    }

    public Activity getActivity(){
        return activity;
    }
    public Button getButtonMenu(){
        return buttonMenu;
    }
    public Button getBtnArtikel(){
        return btnArtikel;
    }
    public Button getBtnCatatan(){
        return btnCatatan;
    }
    public Button getBtnPengingat(){ return btnPengingat; }
    public Button getButtonPil1(){
        return buttonPil1;
    }
    public Button getBtnPil2(){
        return btnPil2;
    }
    public Button getBtnPil3(){
        return btnPil3;
    }
}