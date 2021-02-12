package com.example.figmadaniel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_regstrasi.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class RegstrasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regstrasi)

        imageBackRegister.onClick { onBackPressed() }

        textLoginRegistrasi.onClick {
            val intent = Intent(this@RegstrasiActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}