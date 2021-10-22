package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilHitung extends AppCompatActivity {

    //
    TextView namaBidang2d;
    TextView setLuas, setKeliling;
    TextView setRumusKeliling,setRumusLuas;
    //
    String tampilkanNamaBidang;
    String tampilkanLuas, tampilkanKeliling;
    String tampilkanRumusKeliling, tampilkanRumusLuas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_hitung);

        namaBidang2d =findViewById(R.id.teksBidang);
        setLuas=findViewById(R.id.textLuasAngka);
        setKeliling=findViewById(R.id.textKelilingAngka);
        setRumusKeliling=findViewById(R.id.isiRumusKeliling);
        setRumusLuas=findViewById(R.id.isiRumusLuas);



        Intent terimaKiriman=getIntent();
        tampilkanNamaBidang=terimaKiriman.getStringExtra("nama_bidang");
        tampilkanRumusLuas=terimaKiriman.getStringExtra("rumus_luas");
        tampilkanRumusKeliling=terimaKiriman.getStringExtra("rumus_keliling");
        tampilkanLuas=terimaKiriman.getStringExtra("hasil_luas");
        tampilkanKeliling=terimaKiriman.getStringExtra("hasil_keliling");

        namaBidang2d.setText(tampilkanNamaBidang);
        setRumusLuas.setText(tampilkanRumusLuas);
        setRumusKeliling.setText(tampilkanRumusKeliling);
        setLuas.setText(tampilkanLuas);
        setKeliling.setText(tampilkanKeliling);
    }
}