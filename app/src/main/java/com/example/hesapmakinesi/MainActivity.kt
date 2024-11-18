package com.example.hesapmakinesi

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun topla(view: View) {
        val sayi1=findViewById<EditText>(R.id.editTextNumberSigned).text.toString().toInt()
        val sayi2=findViewById<EditText>(R.id.editTextNumberSigned2).text.toString().toInt()
        val sonuc=findViewById<TextView>(R.id.textView3)
        val toplam=sayi1+sayi2
        sonuc.setText("Sonuç:"+toplam.toString())
    }

    fun carpma(view: View) {
        val sayi1=findViewById<EditText>(R.id.editTextNumberSigned).text.toString().toInt()
        val sayi2=findViewById<EditText>(R.id.editTextNumberSigned2).text.toString().toInt()
        val sonuc=findViewById<TextView>(R.id.textView3)
        val toplam=sayi1*sayi2
        sonuc.setText("Sonuç:"+toplam.toString())
    }
    fun bolme(view: View) {
        val sayi1=findViewById<EditText>(R.id.editTextNumberSigned).text.toString().toInt()
        val sayi2=findViewById<EditText>(R.id.editTextNumberSigned2).text.toString().toInt()
        val sonuc=findViewById<TextView>(R.id.textView3)
        val toplam=sayi1/sayi2
        sonuc.setText("Sonuç:"+toplam.toString())
    }
    fun cikar(view: View) {
        val sayi1=findViewById<EditText>(R.id.editTextNumberSigned).text.toString().toInt()
        val sayi2=findViewById<EditText>(R.id.editTextNumberSigned2).text.toString().toInt()
        val sonuc=findViewById<TextView>(R.id.textView3)
        val toplam=sayi1-sayi2
        sonuc.setText("Sonuç:"+toplam.toString())
    }
}