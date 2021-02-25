package com.example.figmadaniel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.figmadaniel.fragment.GiziIndividuFragment
import kotlinx.android.synthetic.main.activity_informasi_individu_step2.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.toast

class InformasiIndividuStep2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_individu_step2)

        //Image Back
        ivBackInfoIndividu2.onClick { onBackPressed() }

        //Button Batal
        buttonBatalInformasiIndividu2.onClick { onBackPressed() }

        //Button Konfirmasi
        buttonKonfirmasiInfiIndividu2.setOnClickListener {
            Toast.makeText(baseContext, "Telah Konfirmasi", Toast.LENGTH_SHORT).show()
        }


    }
}