package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputSisi1,inputSisi2;
    TextView namaBidangDatar;
    Button triangleBtn,persegiBtn,lingkaranBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan id komponen pada xml dengan logic di java
        inputSisi1=findViewById(R.id.inputSisi1);
        inputSisi2=findViewById(R.id.inputSisi2);
        triangleBtn=findViewById(R.id.buttonSegitiga);
        persegiBtn=findViewById(R.id.buttonPersegi);
        lingkaranBtn=findViewById(R.id.buttonLingkaran);


        //ketika klik tombol segitiga, memanggil fungsi segitiga()
        //dengan setOnClickListener bawaan class Button
        triangleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                segitiga();
            }
        });

        //
        persegiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persegi();
            }
        });

        //
        lingkaranBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lingkaran();
            }
        });
    }

    public void segitiga(){
        /*Segitiga siku-siku*/

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
        intent.putExtra("hasil_luas", luas +" cm^2");
        intent.putExtra("hasil_keliling", keliling +" cm");
        startActivity(intent);

        inputSisi1.setText("");
        inputSisi2.setText("");



    }

    public void persegi(){
        //rumus
        String rumusLuas =" Luas persegi = sisi x sisi";
        String rumusKeliling="Keliling persegi = 2 x (panjang + lebar)";

        //mengambil angka dari EditText dan diubah ke tipe double/pecahan
        double hitungSisi= Double.parseDouble(String.valueOf(inputSisi1.getText()));



        //menghitung luas dan keliling
        double luas=hitungSisi*hitungSisi;

        double keliling=hitungSisi*4;


        //
        Intent intent=new Intent(MainActivity.this,HasilHitung.class);
        intent.putExtra("nama_bidang","Persegi");
        intent.putExtra("hasil_luas", luas +" cm^2");
        intent.putExtra("hasil_keliling", keliling +" cm");
        startActivity(intent);

        inputSisi1.setText("");
        inputSisi2.setText("");

    }

    public void lingkaran(){
        //rumus
        String rumusLuas =" Luas lingkaran = pi x jari-jari x jari-jari";
        String rumusKeliling="Keliling persegi = 2 x pi x jari-jari";

        //mengambil angka dari EditText dan diubah ke tipe double/pecahan
        double hitungJariJari= Double.parseDouble(String.valueOf(inputSisi1.getText()));



        //menghitung luas dan keliling
        double luas=3.14*hitungJariJari*hitungJariJari;

        double keliling=2*3.14*hitungJariJari;


        //
        Intent intent=new Intent(MainActivity.this,HasilHitung.class);
        intent.putExtra("nama_bidang","Lingkaran");
        intent.putExtra("hasil_luas", luas +" cm^2");
        intent.putExtra("hasil_keliling", keliling +" cm");
        startActivity(intent);

        inputSisi1.setText("");
        inputSisi2.setText("");
    }
}