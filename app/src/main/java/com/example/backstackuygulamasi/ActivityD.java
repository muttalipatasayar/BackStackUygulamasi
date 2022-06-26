package com.example.backstackuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent= new Intent(ActivityD.this, ActivityB.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);// geri tusu ile B sayfasindan A sayfasina gecis yaptik
        startActivity(intent);
    }
}