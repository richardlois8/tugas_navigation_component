package com.rich.kelasnavigationcomponent.tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.rich.kelasnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_register.*


class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnRegister.setOnClickListener {
            if (etUsername.text.toString().isNotEmpty() && etName.text.toString().isNotEmpty() && etPassword.text.toString().isNotEmpty()) {
                Toast.makeText(context, "Registrasi Akun Berhasil", Toast.LENGTH_SHORT).show()
                Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_loginFragment)
            }else{
                Toast.makeText(context, "Registrasi Akun Gagal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}