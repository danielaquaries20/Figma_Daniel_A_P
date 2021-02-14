package com.example.figmadaniel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lupa_sandi.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LupaSandiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_sandi)

        imageBackLupaSandi.onClick { onBackPressed() }

        val bottomSheetKirimEmailLupaSandi = BottomSheetKirimEmailLupaSandi()

        buttonKirimLupaSandi.setOnClickListener {
            bottomSheetKirimEmailLupaSandi.show(supportFragmentManager, "Bottom Sheet Dialog")
        }
    }
}