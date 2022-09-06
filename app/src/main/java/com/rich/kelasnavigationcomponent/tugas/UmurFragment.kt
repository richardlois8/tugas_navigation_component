package com.rich.kelasnavigationcomponent.tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rich.kelasnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_umur.*

class UmurFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_umur, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val umur = arguments?.getInt("umur")
        val username = arguments?.getString("username")
        tvUmur.text = umur.toString()
        tvUsername.text = "Halo, $username"
    }
}