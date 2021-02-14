package com.example.figmadaniel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottomsheet_kirim_email_lupasandi.*

class BottomSheetKirimEmailLupaSandi : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottomsheet_kirim_email_lupasandi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonKirimLupaSandiBottom.setOnClickListener {
            Toast.makeText(context, "Sudah Terkirim", Toast.LENGTH_SHORT).show()
        }
    }
}