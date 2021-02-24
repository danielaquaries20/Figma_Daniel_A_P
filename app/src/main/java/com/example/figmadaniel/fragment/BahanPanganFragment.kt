package com.example.figmadaniel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.example.figmadaniel.R
import com.example.figmadaniel.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_bahan_pangan.*
import org.jetbrains.anko.sdk27.coroutines.onClick


class BahanPanganFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bahan_pangan, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentAdapter = ViewPagerAdapter(childFragmentManager)
        fragmentAdapter.addFragment(DaftarBahanPanganFragment(), "Daftar Bahan Pangan")
        fragmentAdapter.addFragment(DaftarUsulanFragment(), "Daftar Usulan")
        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

    }


}