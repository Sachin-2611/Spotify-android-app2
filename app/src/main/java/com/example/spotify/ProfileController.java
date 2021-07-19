package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileController extends AppCompatActivity {
    public void backButton(View view){
        Intent backButtonIntent = new Intent(ProfileController.this, MainActivity.class);
        startActivity(backButtonIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);
    }
}