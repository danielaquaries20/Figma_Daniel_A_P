package com.example.figmadaniel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottomsheet_altlogin_login.*

class BottomSheetAltLoginLogin : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottomsheet_altlogin_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        linearButtonGoogleLogin.setOnClickListener {
            Toast.makeText(context, "Google Login", Toast.LENGTH_SHORT).show()
        }

        linearButtonFacebookLogin.setOnClickListener {
            Toast.makeText(context, "Facebook Login", Toast.LENGTH_SHORT).show()
        }

    }
}

