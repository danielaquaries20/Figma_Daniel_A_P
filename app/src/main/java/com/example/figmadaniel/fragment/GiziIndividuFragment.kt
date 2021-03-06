package com.example.figmadaniel.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.figmadaniel.InformasiIndividuStep1Activity
import com.example.figmadaniel.R
import kotlinx.android.synthetic.main.fragment_gizi_individu.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.support.v4.startActivity



class GiziIndividuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gizi_individu, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Button Tambah Individu
        buttonTambahIndividu.onClick {
            val intent = Intent(activity, InformasiIndividuStep1Activity::class.java)
            startActivity(intent)
        }
    }


}