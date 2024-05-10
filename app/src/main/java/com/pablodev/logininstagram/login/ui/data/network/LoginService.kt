package com.pablodev.logininstagram.login.ui.data.network

import com.pablodev.logininstagram.core.network.RetrofitHelper
import com.pablodev.logininstagram.login.ui.data.network.response.LoginResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.create

class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user:String, password:String){
        withContext(Dispatchers.IO){
            val response = retrofit.create(LoginClient::class.java).doLogin(user, password)
            response.body()?.success?:false
        }
    }
}