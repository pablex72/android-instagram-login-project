package com.pablodev.logininstagram.login.ui.domain

import com.pablodev.logininstagram.login.ui.data.network.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: LoginRepository){
//    private val repository = LoginRepository()

    suspend operator fun invoke(user:String, password:String):Boolean {
        return repository.doLogin(user,password)
    }
}