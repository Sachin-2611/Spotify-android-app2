package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class playerController extends AppCompatActivity {
    public void backButton(View view){
        Intent backButtonIntent = new Intent(playerController.this, MainActivity.class);
        startActivity(backButtonIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

    }
}