package com.example.replicate2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class ControlClass extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
        if (sharedPreferences.getString("userid","").isEmpty()){
            Intent in = new Intent(getApplicationContext(),Login.class);
            startActivity(in);
            finish();
        }else {
            Intent in = new Intent(getApplicationContext(),sms_code.class);
            startActivity(in);
            finish();
        }
    }
}