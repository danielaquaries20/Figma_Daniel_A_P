package com.example.figmadaniel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.figmadaniel.BottomSheetKeluarAkun
import com.example.figmadaniel.BottomsSheetUsulkanBahanPangan
import com.example.figmadaniel.R
import kotlinx.android.synthetic.main.fragment_daftar_usulan.*


class DaftarUsulanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daftar_usulan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Bottomsheet Usulkan Bahan Pangan
       val bottomsSheetUsulkanBahanPangan = BottomsSheetUsulkanBahanPangan()

        buttonUsulkanBahanPangan.setOnClickListener {
            bottomsSheetUsulkanBahanPangan.show(childFragmentManager, "BottomSheetDialog")
        }
    }

}