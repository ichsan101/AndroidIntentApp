package com.example.gotopapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_utama);
    }

    public void clickRS(View view) {
        Intent intent = new Intent(this,RS.class);
        startActivity(intent);
    }
}