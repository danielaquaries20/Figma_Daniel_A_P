package com.example.figmadaniel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textLupaKataSandiLogin.onClick {
            val intent = Intent(this@LoginActivity, LupaSandiActivity::class.java )
            startActivity(intent)
        }

        textRegisterLogin.onClick {
            val intent = Intent(this@LoginActivity, RegstrasiActivity::class.java)
            startActivity(intent)
        }


    }
}