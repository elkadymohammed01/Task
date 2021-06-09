package com.great.mohammedelkadytask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
    }
    public void LogIn(View view) {
        startActivity(new Intent(this, SignIn.class));
    }

    public void Register(View view) {
        startActivity(new Intent(this, Register.class));
    }
}
