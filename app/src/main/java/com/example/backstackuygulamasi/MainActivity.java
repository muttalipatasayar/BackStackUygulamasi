package com.example.backstackuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonGotoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGotoB= findViewById(R.id.buttonGotoB);
        buttonGotoB.setOnClickListener(view -> {

            startActivity(new Intent(MainActivity.this,ActivityB.class));
        });
    }
}