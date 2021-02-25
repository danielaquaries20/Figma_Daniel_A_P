package com.example.figmadaniel.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.figmadaniel.BottomSheetKeluarAkun
import com.example.figmadaniel.EditProfileActivity
import com.example.figmadaniel.R
import kotlinx.android.synthetic.main.fragment_profil.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.support.v4.startActivity



class ProfilFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Bottomsheet Keluar Akun
        val bottomSheetKeluarAkun = BottomSheetKeluarAkun()

        buttonLogoutProfil.setOnClickListener {
            bottomSheetKeluarAkun.show(childFragmentManager, "BottomSheetDialog")

        }


        //Button Edit Profil
        buttonEditProfilProfil.onClick {
            val intent = Intent(activity, EditProfileActivity::class.java)
            startActivity(intent)
        }

    }


}