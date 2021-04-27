package com.example.fragment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragment.R;
import com.example.fragment.fragment.Home;
import com.example.fragment.fragment.Home2;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnhome, btnhome2 ;

    Home fragmenthome;
    Home2 fragmenthome2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnhome = findViewById(R.id.btn_home);
        btnhome2 = findViewById(R.id.btn_home2);

        btnhome.setOnClickListener(this);
        btnhome2.setOnClickListener(this);

    }
        void menuHome() {
            fragmenthome = new Home();
            FragmentTransaction ft = getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, fragmenthome);
            ft.commit();

        }

        void menuHome2() {
            fragmenthome2 = new Home2();
            FragmentTransaction ft = getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, fragmenthome2);
            ft.commit();
        }

    @Override
    public void onClick(View v) {
        if (v == btnhome) {
            menuHome();
        }
        if (v == btnhome2) {
            menuHome2();
        }
    }
}