package com.example.figmadaniel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_informasi_individu_step1.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity

class InformasiIndividuStep1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_individu_step1)

        //Image Back
        ivBackInfoIndividu1.onClick { onBackPressed() }

        //Button Batal
        buttonBatalOnfoIndividu1.onClick { onBackPressed() }

        //Button Lanjut Step 2
        buttonLanjutStep2.onClick {
            val intent = Intent(this@InformasiIndividuStep1Activity, InformasiIndividuStep2Activity::class.java)
            startActivity(intent)
        }



    }
}