package com.example.backstackuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    private Button buttonGotoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        buttonGotoC= findViewById(R.id.buttonGotoC);
        buttonGotoC.setOnClickListener(view -> {

            startActivity(new Intent(ActivityB.this, ActivityC.class));

        });
    }
}