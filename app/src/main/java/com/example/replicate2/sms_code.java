package com.example.replicate2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sms_code extends AppCompatActivity {

    Button btnsms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_code);

        btnsms=findViewById(R.id.btnsms);
        btnsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sms = new Intent(sms_code.this, Kalkulator.class);
                startActivity(sms);
            }
        });
    }
}
