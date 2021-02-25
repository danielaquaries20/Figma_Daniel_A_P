package com.example.figmadaniel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_profile.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        //Image Back
        ivBackEditProfile.onClick { onBackPressed() }

        //Button Simpan
        buttonSimpan.setOnClickListener {
            Toast.makeText(baseContext, "Profil Sudah Disimpan", Toast.LENGTH_SHORT).show()
        }

        //Button Edit Password
        buttonEditKataSandi.onClick {
            val intent = Intent(this@EditProfileActivity, EditPasswordActivity::class.java)
            startActivity(intent)
        }



    }
}