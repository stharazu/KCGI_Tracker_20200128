package com.example.tulsi.rajutrackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mSignInButton;
    private Button mSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSignInButton = findViewById(R.id.button_sign_in);

    }
    public void Signin(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);

    }

    public void Signup(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);

    }
}



