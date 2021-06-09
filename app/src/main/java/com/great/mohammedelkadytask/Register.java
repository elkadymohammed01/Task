package com.great.mohammedelkadytask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

    public void LogIn(View view) {
        finish();
        startActivity(new Intent(this,SignIn.class));
    }

    public void Register(View view) {
        finish();
        startActivity(new Intent(this,LogOutPage.class));
    }
}
