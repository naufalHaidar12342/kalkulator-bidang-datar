# 🧮 Kalkulator Bangun Datar

Aplikasi sederhana untuk menghitung luas dan keliling bangun datar.

![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84.svg?style=for-the-badge&logo=android-studio&logoColor=white)![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)![Markdown](https://img.shields.io/badge/markdown-%23000000.svg?style=for-the-badge&logo=markdown&logoColor=white)

- [Persyaratan](#requirements)
- [Spesifikasi](#app-specs)
- [Demo](#app-demo)

<div id="requirements"></div>

## Menjalankan Aplikasi

1. Buka Android Studio, lalu pada tab `File`, pilih `Open...`. Tunggu Android Studio membuka file project.
2. Klik tombol _Play_ warna hijau

> Lihat [persyaratan](REQUIREMENTS.md) untuk mengetahui kebutuhan sebelum menjalankan aplikasi.

<div id="app-specs"></div>

## Spesifikasi Aplikasi

Aplikasi ini dapat menghitung luas dan keliling dari 3 bangun datar, yaitu persegi, lingkaran, dan segitiga.

- Dependencies

```gradle

dependencies {

    implementation 'androidx.appcompat:appcompat:1.3.1'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.1'
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'androidx.vectordrawable:vectordrawable:1.2.0-alpha02'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
}

```

- Android Virtual Device (AVD)

  > Google Pixel 2 API 27 (Android Oreo)

- Java Development Kit
  > OpenJDK 17

<div id="app-demo"></div>

## Demonstrasi

![Peek 2021-10-23 07-38](/assets/Peek%202021-10-23%2007-38.gif)
