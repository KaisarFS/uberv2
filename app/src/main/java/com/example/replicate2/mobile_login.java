package com.example.replicate2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mobile_login extends AppCompatActivity {

    Button btncircle;
    EditText txtaddmobilenumber;

    SharedPreferences pref;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_login);
        pref = getSharedPreferences("login", MODE_PRIVATE);
        txtaddmobilenumber = findViewById(R.id.txtaddmobilenumber);
        btncircle = findViewById(R.id.btncircle);
        btncircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtaddmobilenumber.getText().toString().equalsIgnoreCase("12345678")){
                    Toast.makeText(mobile_login.this, "Login sukses", Toast.LENGTH_SHORT).show();
                    Intent in=new Intent(mobile_login.this, sms_code.class);
                    //bisa melempar nilai
                    in.putExtra("username", txtaddmobilenumber.getText().toString());
                    editor = pref.edit();
                    editor.putString("userid", txtaddmobilenumber.getText().toString());
                    editor.apply();
                    finish();
                    startActivity(in);
                }
            }
        });
            }
        };



