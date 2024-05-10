package com.pablodev.logininstagram.login.ui.data.network

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user:String, password:String) {
        return api.doLogin(user,password)
    }
}