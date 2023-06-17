**Penjelasan menu_main.xml**

1. Deklarasi XML:
   ```xml
   <?xml version="1.0" encoding="utf-8"?>
   ```
   Ini adalah deklarasi XML standar yang menunjukkan versi XML (1.0) dan pengkodean karakter (UTF-8) yang digunakan dalam berkas XML.

2. Elemen Menu:
   ```xml
   <menu xmlns:android="http://schemas.android.com/apk/res/android">
   ```
   Ini adalah elemen root dari menu. Elemen ini memiliki atribut `xmlns:android` yang menunjukkan namespace Android yang digunakan dalam berkas XML.

3. Item Menu:
   ```xml
   <item
       android:id="@+id/menu_item1"
       android:title="Option 1"/>
   <item
       android:id="@+id/menu_item2"
       android:title="Option 2"/>
   <item
       android:id="@+id/menu_item3"
       android:title="Option 3"/>
   ```
   Ini adalah tiga elemen `<item>` yang mewakili item-menu dalam menu. Setiap elemen `<item>` memiliki atribut `android:id` yang merupakan ID unik untuk item-menu tersebut. Atribut `android:title` digunakan untuk menentukan teks yang akan ditampilkan untuk item-menu.

Dengan demikian, kode XML ini mendefinisikan menu dengan tiga item: Option 1, Option 2, dan Option 3. Ketika salah satu item-menu ini dipilih dalam aplikasi, fungsi `onOptionsItemSelected()` dalam kelas MainActivity akan dipanggil dengan ID item-menu yang sesuai, sehingga Anda dapat menentukan tindakan yang akan diambil berdasarkan item-menu yang dipilih.

**Penjelasan activty_main.xml**

1. Deklarasi XML:
   ```xml
   <?xml version="1.0" encoding="utf-8"?>
   ```
   Ini adalah deklarasi XML standar yang menunjukkan versi XML (1.0) dan pengkodean karakter (UTF-8) yang digunakan dalam berkas XML.

2. Elemen ConstraintLayout:
   ```xml
   <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:app="http://schemas.android.com/apk/res-auto"
       xmlns:tools="http://schemas.android.com/tools"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:orientation="vertical">
   ```
   Ini adalah elemen root yaitu ConstraintLayout, yang merupakan tampilan yang digunakan untuk mengatur elemen-elemen dalam konstrain. Elemen ini memiliki beberapa atribut seperti `android:layout_width` dan `android:layout_height` yang mengatur lebar dan tinggi layout menjadi `match_parent`, yaitu mengisi ruang yang tersedia penuh. Atribut `android:orientation` tidak relevan dalam ConstraintLayout.

3. TextView:
   ```xml
   <TextView
       android:id="@+id/tvSelectedOption"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_marginStart="16dp"
       android:layout_marginTop="56dp"
       android:text="Selected Option: "
       android:textStyle="bold"
       app:layout_constraintStart_toStartOf="parent"
       app:layout_constraintTop_toTopOf="parent" />
   ```
   Ini adalah elemen TextView yang digunakan untuk menampilkan teks. Elemen ini memiliki atribut `android:id` yang merupakan ID unik untuk TextView tersebut. 

Atribut `android:layout_width` dan `android:layout_height` diatur sebagai `wrap_content`, yang berarti ukuran TextView akan disesuaikan dengan ukuran kontennya. 

Atribut `android:layout_marginStart` dan `android:layout_marginTop` mengatur margin dari sisi kiri dan atas TextView. 

Atribut `android:text` digunakan untuk mengatur teks yang akan ditampilkan. Atribut `android:textStyle` mengatur gaya teks menjadi bold. 
Atribut `app:layout_constraintStart_toStartOf` dan `app:layout_constraintTop_toTopOf` mengatur kendali aturan (constraint) untuk menempatkan TextView di sebelah kiri atas layout (parent).

4. Button:
   ```xml
   <Button
       android:id="@+id/btnShowPicker"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:layout_marginTop="96dp"
       android:text="Show Picker"
       app:layout_constraintEnd_toEndOf="parent"
       app:layout_constraintStart_toStartOf="parent"
       app:layout_constraintTop_toBottomOf="@+id/tvSelectedOption" />
   ```
   Ini adalah elemen Button yang digunakan untuk membuat tombol. 
Elemen ini memiliki atribut `android:id` yang merupakan ID unik untuk Button tersebut. Atribut `android:layout_width` dan `android:layout_height` diatur sebagai `wrap_content`, yang berarti ukuran Button akan disesuaikan dengan ukuran kontennya, sehingga tombol akan mengambil ruang yang cukup untuk menampilkan teks "Show Picker".

Atribut `android:layout_marginTop` mengatur margin dari sisi atas Button sebesar 96dp, yang memberikan jarak vertikal antara TextView dan Button.

Atribut `android:text` digunakan untuk mengatur teks yang akan ditampilkan pada Button, yaitu "Show Picker".

Atribut `app:layout_constraintEnd_toEndOf`, `app:layout_constraintStart_toStartOf`, dan `app:layout_constraintTop_toBottomOf` adalah kendali aturan (constraint) yang mengatur posisi Button di sebelah bawah TextView dan mengikatnya dengan tepi kanan dan kiri dari layout (parent).

Dengan menggunakan ConstraintLayout, Kalian dapat menentukan hubungan dan batasan antara elemen-elemen tersebut dengan kendali aturan (constraint) untuk mengatur posisi dan tata letak elemen secara fleksibel dan responsif.

**Penjelasan MainActivity.kt**

1. Package Statement:
   ```kotlin
   package com.example.implementasi_minggu8
   ```
   Ini adalah pernyataan paket yang menunjukkan nama paket di mana kelas MainActivity akan berada. Nama paket ini biasanya disesuaikan dengan struktur paket aplikasi Anda.

2. Import Statements:
   ```kotlin
   import androidx.appcompat.app.AppCompatActivity
   import android.os.Bundle
   import android.widget.Button
   import android.view.Menu
   import android.view.MenuItem
   import android.widget.TextView
   ```
   Ini adalah pernyataan impor yang mengimpor kelas-kelas yang diperlukan untuk membuat aplikasi Android, seperti kelas AppCompatActivity, kelas Button, kelas TextView, dan kelas MenuItem.

3. Deklarasi Kelas MainActivity:
   ```kotlin
   class MainActivity : AppCompatActivity() {
   ```
   Ini adalah deklarasi kelas MainActivity yang merupakan turunan dari kelas AppCompatActivity. Aktivitas ini adalah titik masuk utama aplikasi Android.

4. Deklarasi Properti:
   ```kotlin
   private lateinit var tvSelectedOption: TextView
   ```
   Ini adalah deklarasi properti privat tvSelectedOption yang akan digunakan untuk merujuk ke TextView dengan ID "tvSelectedOption" yang ada di layout activity_main.xml.

5. Fungsi onCreate():
   ```kotlin
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

       tvSelectedOption = findViewById(R.id.tvSelectedOption)

       val btnShowPicker: Button = findViewById(R.id.btnShowPicker)
       btnShowPicker.setOnClickListener {
           showPicker()
       }
   }
   ```
   Ini adalah fungsi onCreate() yang dipanggil saat aktivitas dibuat. Fungsi ini mengatur tampilan aktivitas menggunakan layout activity_main.xml, menginisialisasi properti tvSelectedOption dengan menggunakan findViewById(), dan menetapkan onClickListener untuk tombol btnShowPicker yang, ketika diklik, memanggil fungsi showPicker().

6. Fungsi onCreateOptionsMenu():
   ```kotlin
   override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menu_main, menu)
       return true
   }
   ```
   Ini adalah fungsi onCreateOptionsMenu() yang digunakan untuk menginflasikan menu ke dalam tampilan opsi pada bilah aplikasi. Fungsi ini mengambil argumen menu, menginflasikan menu dari berkas menu_main.xml menggunakan menuInflater, dan mengembalikan nilai true untuk menunjukkan bahwa menu telah dibuat.

7. Fungsi onOptionsItemSelected():
   ```kotlin
   override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when (item.itemId) {
           R.id.menu_item1 -> {
               tvSelectedOption.text = "Selected Option: Option 1"
               return true
           }
           R.id.menu_item2 -> {
               tvSelectedOption.text = "Selected Option: Option 2"
               return true
           }
           R.id.menu_item3 -> {
               tvSelectedOption.text = "Selected Option: Option 3"
               return true
           }
           else -> return super.onOptionsItemSelected(item)
       }
   }
   ```
   Ini adalah fungsi onOptionsItemSelected() yang dipanggil saat salah satu item menu di atas opsi diklik. Fungsi ini memeriksa ID item yang diklik dan mengubah teks tvSelectedOption berdasarkan item yang dipilih.

8. Fungsi showMenu():
   ```kotlin
   private fun showMenu() {
       openOptionsMenu()
   }
   ```
   Ini adalah fungsi showMenu() yang digunakan untuk memperlihatkan menu opsi. Fungsi ini memanggil openOptionsMenu() untuk membuka menu opsi.

9. Fungsi showPicker():
   ```kotlin
   private fun showPicker() {
       val pickerOptions = arrayOf("Option 1", "Option 2", "Option 3")

       val builder = androidx.appcompat.app.AlertDialog.Builder(this)
       builder.setTitle("Select an option")

       builder.setItems(pickerOptions) { _, which ->
           tvSelectedOption.text = "Selected Option: ${pickerOptions[which]}"
       }

       builder.create().show()
   }
   ```
   Ini adalah fungsi showPicker() yang dipanggil ketika tombol btnShowPicker diklik. Fungsi ini membuat sebuah dialog AlertDialog menggunakan AlertDialog.Builder untuk memilih opsi dari pickerOptions (daftar opsi). Ketika opsi dipilih, teks tvSelectedOption diperbarui sesuai dengan opsi yang dipilih.

Kode ini menyediakan tampilan sederhana dengan tombol yang memicu dialog pemilihan opsi. Ketika opsi dipilih, teks pada TextView akan diperbarui sesuai dengan opsi yang dipilih atau item menu yang diklik.
