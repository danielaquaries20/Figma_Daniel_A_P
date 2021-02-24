package com.example.figmadaniel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.figmadaniel.fragment.BahanPanganFragment
import com.example.figmadaniel.fragment.GiziIndividuFragment
import com.example.figmadaniel.fragment.GiziPopulasiFragment
import com.example.figmadaniel.fragment.ProfilFragment
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val giziIndividuFragment = GiziIndividuFragment()
        val bahanPanganFragment = BahanPanganFragment()
        val giziPopulasiFragment = GiziPopulasiFragment()
        val profilFragment = ProfilFragment()

        replaceFragment(bahanPanganFragment)

        bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.giziIndividu -> replaceFragment(giziIndividuFragment)
                R.id.bahanPangan -> replaceFragment(bahanPanganFragment)
                R.id.giziPopulasi -> replaceFragment(giziPopulasiFragment)
                R.id.profil -> replaceFragment(profilFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment)
            commit()
        }
    }
}