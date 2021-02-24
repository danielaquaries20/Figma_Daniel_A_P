package com.example.figmadaniel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.figmadaniel.BottomSheetTambahPopulasi
import com.example.figmadaniel.R
import kotlinx.android.synthetic.main.bottomsheet_tambah_populasi.*


/**
 * A simple [Fragment] subclass.
 */
class GiziPopulasiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gizi_populasi, container, false)
    }



}