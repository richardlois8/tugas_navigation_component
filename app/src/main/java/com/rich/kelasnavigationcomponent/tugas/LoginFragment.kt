package com.rich.kelasnavigationcomponent.tugas

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.rich.kelasnavigationcomponent.databinding.FragmentLoginBinding

import com.rich.kelasnavigationcomponent.R
import com.rich.kelasnavigationcomponent.tugas.login.LoginViewModel
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    private lateinit var loginViewModel: LoginViewModel
    private var _binding: FragmentLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnLogin.setOnClickListener {
            if(etUsername.text.toString() != "" && etPassword.text.toString() != ""){
                val username = Bundle()
                username.putString("username", etUsername.text.toString())
                Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_homeFragment, username)
            }else{
                Toast.makeText(context, "Username atau Password Kosong", Toast.LENGTH_SHORT).show()
            }
        }

        tvLupaPass.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_lupaPassFragment)
        }

        tvRegister.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }

        btnCustServ.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_custServFragment)
        }

        btnHelp.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_helpFragment)
        }
    }

}