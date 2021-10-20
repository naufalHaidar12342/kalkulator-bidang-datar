package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputSisi1,inputSisi2;
    TextView namaBidangDatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void segitiga(View view){
        /*Segitiga siku-siku*/

        //menyambungkan id komponen pada xml dengan logic di java
        inputSisi1=findViewById(R.id.inputSisi1);
        inputSisi2=findViewById(R.id.inputSisi2);
        namaBidangDatar=findViewById(R.id.namaBidang);

        //rumus
        String rumusLuas =" Luas segitiga = (1/2) x alas x tinggi";
        String rumusKeliling="Keliling segitiga = sisi1 + sisi2 + sisi3";
        
        //mengambil angka dari EditText dan diubah ke tipe double/pecahan
        double hitungAlas= Double.parseDouble(String.valueOf(inputSisi1.getText()));
        double hitungTinggi=Double.parseDouble(String.valueOf(inputSisi2.getText()));

        /*membuat variabel jumlah2sisi untuk menampung
        * hasil penghitungan dari hitungAlas^2 + hitungTinggi^2.
        *
        * penghitungan dibantu oleh function Math.pow() [power of] yang
        * menerima input angka yang ingin dipangkatkan, selanjutnya
        * diisi oleh pangkat berapa, misal pangkat 2*/
        double jumlah2sisi=Math.pow(hitungAlas,2)+Math.pow(hitungTinggi,2);

        /*memperoleh sisi miring dari segitiga menggunakan
        * akar pangkat 2 dari jumlah2sisi.
        *
        * Dibantu oleh function Math.sqrt() [square root]*/
        double sisiMiring=Math.sqrt(jumlah2sisi);

        //menghitung luas dan keliling
        double luas=0.5*hitungAlas*hitungTinggi;

        double keliling=hitungAlas+hitungTinggi+sisiMiring;


        //
        Intent intent=new Intent(MainActivity.this,HasilHitung.class);
        intent.putExtra("nama_bidang","Segitiga");
        intent.putExtra("hasil_luas",luas);
        intent.putExtra("hasil_keliling",keliling);




    }
}