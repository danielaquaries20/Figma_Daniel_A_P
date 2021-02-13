package com.example.figmadaniel

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LoginActivity : AppCompatActivity() {
    var isShowPassword = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textLupaKataSandiLogin.onClick {
            val intent = Intent(this@LoginActivity, LupaSandiActivity::class.java)
            startActivity(intent)
        }

        textRegisterLogin.onClick {
            val intent = Intent(this@LoginActivity, RegstrasiActivity::class.java)
            startActivity(intent)
        }

        imageVisibleLogin.onClick {
            if (isShowPassword) {
                editTextPasswordLogin.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
            } else {
                editTextPasswordLogin.transformationMethod =
                    PasswordTransformationMethod.getInstance()
            }
        }


    }
}