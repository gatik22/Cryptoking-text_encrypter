package com.example.oopsproject;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.view.WindowCompat;
public class Encoder extends AppCompatActivity {

    EditText etenc;
    TextView enctv;
    ClipboardManager cpb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encoder);

        etenc=findViewById(R.id.etenc);
        enctv=findViewById(R.id.enctv);
        cpb=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
    }
    public void enc(View view){
        String temp=etenc.getText().toString();
        String rv=encode.enc(temp);
        enctv.setText(rv);

    }
    public void cp2(View view){
        String data= enctv.getText().toString().trim();
        if(!data.isEmpty()){
            ClipData temp=ClipData.newPlainText("text" ,data);
            cpb.setPrimaryClip(temp);
            Toast.makeText(this,"Copied", Toast.LENGTH_LONG).show();
        }

    }
}