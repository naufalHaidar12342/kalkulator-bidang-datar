package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilHitung extends AppCompatActivity {

    TextView namaBidang2d;
    TextView setLuas, setKeliling;
    String tampilkanNamaBidang;
    String tampilkanLuas, tampilkanKeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_hitung);

        namaBidang2d =findViewById(R.id.teksBidang);
        setLuas=findViewById(R.id.textLuasAngka);
        setKeliling=findViewById(R.id.textKelilingAngka);




        Intent terimaKiriman=getIntent();
        tampilkanNamaBidang=terimaKiriman.getStringExtra("nama_bidang");
        tampilkanLuas=terimaKiriman.getStringExtra("hasil_luas");
        tampilkanKeliling=terimaKiriman.getStringExtra("hasil_keliling");

        namaBidang2d.setText(tampilkanNamaBidang);
        setLuas.setText(tampilkanLuas);
        setKeliling.setText(tampilkanKeliling);
    }
}