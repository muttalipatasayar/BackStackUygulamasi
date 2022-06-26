package com.example.backstackuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {
    private Button buttonGotoD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        buttonGotoD= findViewById(R.id.buttonGotoD);
        buttonGotoD.setOnClickListener(view -> {

            startActivity(new Intent(ActivityC.this, ActivityD.class));

        });
    }
}