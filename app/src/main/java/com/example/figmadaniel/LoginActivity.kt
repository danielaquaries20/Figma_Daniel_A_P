package com.example.figmadaniel

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LoginActivity : AppCompatActivity() {
    private var isShowPassword = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        imageVisibleLogin.setOnClickListener {
            isShowPassword = !isShowPassword
            showPassword(isShowPassword)
        }
        showPassword(isShowPassword)

        textLupaKataSandiLogin.onClick {
            val intent = Intent(this@LoginActivity, LupaSandiActivity::class.java)
            startActivity(intent)
        }

        textRegisterLogin.onClick {
            val intent = Intent(this@LoginActivity, RegstrasiActivity::class.java)
            startActivity(intent)
        }

        val bottomSheetAltLoginLogin = BottomSheetAltLoginLogin()

        buttonAltLoginLogin.setOnClickListener {
            bottomSheetAltLoginLogin.show(supportFragmentManager, "BottomSheetDialog")
        }

        buttonLoginLogin.onClick {
            val intent = Intent(this@LoginActivity, BottomNavigationActivity::class.java)
            startActivity(intent)
        }

    }

    private fun showPassword(isShow: Boolean) {
        if (isShow) {
            // To show the password
            editTextPasswordLogin.transformationMethod =
                HideReturnsTransformationMethod.getInstance()
            imageVisibleLogin.setImageResource(R.drawable.ic_view_dis_mdpi)
        } else {
            // To hide the password
            editTextPasswordLogin.transformationMethod = PasswordTransformationMethod.getInstance()
            imageVisibleLogin.setImageResource(R.drawable.ic_view_en_mdpi)
        }
        // This line of code to put the pointer at the end of the password string
        editTextPasswordLogin.setSelection(editTextPasswordLogin.text.toString().length)
    }


}