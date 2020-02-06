package com.example.replicate2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.replicate2.R;

public class Kalkulator extends AppCompatActivity {

    //list semua elemen yang ada
    EditText txtangka1,txtangka2;
    Button bkali,btambah,bkurang,bbagi;
    TextView result;
    double resultangka;
    double angka1,angka2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);

        txtangka1 = (EditText)findViewById(R.id.txtangka1);
        txtangka2 = (EditText)findViewById(R.id.txtangka2);

        btambah = (Button)findViewById(R.id.btambah);
        bkurang = (Button)findViewById(R.id.bkurang);
        bkali   = (Button)findViewById(R.id.bkali);
        bbagi   = (Button)findViewById(R.id.bbagi);


        btambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    angka1 = Double.parseDouble(txtangka1.getText().toString());
                    angka2 = Double.parseDouble(txtangka2.getText().toString());
                    resultangka = angka1 + angka2;
                    result.setText(String.valueOf(resultangka));

                    Toast.makeText(Kalkulator.this, "Hasilmya : " + resultangka, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(Kalkulator.this, "Terjadi kesalahan!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        bkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    angka1 = Double.parseDouble(txtangka1.getText().toString());
                    angka2 = Double.parseDouble(txtangka2.getText().toString());
                    resultangka = angka1-angka2;
                    result.setText(String.valueOf(resultangka));
                    Toast.makeText(Kalkulator.this, "Hasilmya : "+resultangka, Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(Kalkulator.this, "Terjadi kesalahan!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        bbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    angka1 = Double.parseDouble(txtangka1.getText().toString());
                    angka2 = Double.parseDouble(txtangka2.getText().toString());
                    resultangka = angka1/angka2;
                    result.setText(String.valueOf(resultangka));
                    Toast.makeText(Kalkulator.this, "Hasilmya : "+resultangka, Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(Kalkulator.this, "Terjadi kesalahan!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        bkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    angka1 = Double.parseDouble(txtangka1.getText().toString());
                    angka2 = Double.parseDouble(txtangka2.getText().toString());
                    resultangka = angka1*angka2;
                    result.setText(String.valueOf(resultangka));
                    Toast.makeText(Kalkulator.this, "Hasilmya : "+resultangka, Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(Kalkulator.this, "Terjadi kesalahan!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}