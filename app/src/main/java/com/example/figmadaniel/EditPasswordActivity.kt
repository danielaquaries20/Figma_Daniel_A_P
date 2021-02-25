package com.example.figmadaniel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.figmadaniel.fragment.ProfilFragment
import kotlinx.android.synthetic.main.activity_edit_password.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class EditPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_password)

        //Image Back
        ivBackEditPassword.onClick { onBackPressed() }

        //Button Simpan Password
        buttonSimpanKataSandi.setOnClickListener {
            Toast.makeText(baseContext, "Password Telah Disimpan", Toast.LENGTH_SHORT).show()
        }



    }
}