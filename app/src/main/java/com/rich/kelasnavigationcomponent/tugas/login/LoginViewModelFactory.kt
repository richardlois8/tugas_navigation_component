package com.rich.kelasnavigationcomponent.tugas.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rich.kelasnavigationcomponent.tugas.data.LoginDataSource
import com.rich.kelasnavigationcomponent.tugas.data.LoginRepository

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class LoginViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                loginRepository = LoginRepository(
                    dataSource = LoginDataSource()
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}