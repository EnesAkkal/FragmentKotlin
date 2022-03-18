package com.enesakkal.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun firstFragment (view : View) {

        val fragmentManager = supportFragmentManager
        //Yapacağımız işlemleri başlatmak için fragmentTransaction yapısını oluşturuyoruz.
        // bu da fragmentManager dan geliyor olup beginTransaction ile işleme başlıyoruz.
        val fragmentTransaction = fragmentManager.beginTransaction()


        //Aşağıda ilk fragmanımızı oluşturduk. blankFragment'dan bir obje oluşturduk.Blankfragment bizim bir layoutumuz.
        val firstFragment = BlankFragment()
        //Replace ile değiştireceğiz.Parantezi açınca bizden bir container isteyecek (Yani içersinde barındırmak ) Kim gösterecek fragmanları bize ? framelayout yazdık.
        //İkinci kısımda ne gösterecek onu soruyor virgülden sonra firstFragment oldugu ıcın onu yazdık.ö
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()


    }

    fun secondFragment (view : View) {

        val fragmentManager = supportFragmentManager

        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()


    }


}