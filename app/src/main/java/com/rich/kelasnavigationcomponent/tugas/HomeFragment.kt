package com.rich.kelasnavigationcomponent.tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.rich.kelasnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val username = arguments?.getString("username")
        tvHello.text = "Halo, $username"

        btnHitung.setOnClickListener {
            val tahun = etTahun.text.toString().toInt()
            val umur = 2022 - tahun

            val data = Bundle()
            data.putInt("umur", umur)
            data.putString("username", username)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_umurFragment, data)
        }

        btnProfil.setOnClickListener{
            val dataUsername = Bundle()
            dataUsername.putString("username", username)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_profileFragment2,dataUsername)
        }
    }
}