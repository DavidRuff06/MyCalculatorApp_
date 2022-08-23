package com.example.mynewcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void onClick(View v) {
        TextView tv = findViewById(R.id.calcScreen);
        int b = v.getId();
        String s = "";
        tv.setText(s + b);

    }

}