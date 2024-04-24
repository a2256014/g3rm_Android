package com.example.g3rm_ah;

import android.annotation.SuppressLint;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import com.example.g3rm_ah.common.LoginActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
