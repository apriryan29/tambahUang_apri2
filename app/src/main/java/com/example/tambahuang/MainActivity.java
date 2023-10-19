package com.example.tambahuang;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private TextView tambahUang;
    private int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button2);
        tambahUang = findViewById(R.id.textView);
    }

    public void uangTambah(View view){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        a += 100000;
        tambahUang.setText(String.valueOf(a));

        switch (a){
            case 500000:
            Toast.makeText(this,"Uang Anda tambah Banyak !",Toast.LENGTH_SHORT).show();
            tambahUang.setTextSize(30);
            tambahUang.setTextColor(Color.RED);
            break;

            case 1000000:
                Toast.makeText(this,"Semakin Tambah Banyak Nih !",Toast.LENGTH_SHORT).show();
                tambahUang.setTextSize(30);
                tambahUang.setTextColor(Color.YELLOW);
                break;


            case 1500000:
                Toast.makeText(this,"And Melebihi Kekayaan Cipung !!",Toast.LENGTH_SHORT).show();
                tambahUang.setTextSize(30);
                tambahUang.setTextColor(Color.GREEN);
                break;
        }
    }
}