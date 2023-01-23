package com.example.myproject.ui.view.loginScreen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myproject.data.AuthRepository
import com.example.myproject.util.Resource
import com.google.firebase.auth.AuthCredential
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: AuthRepository
) : ViewModel() {
    val _loginState = Channel<LoginState>()
    val loginState = _loginState.receiveAsFlow()

    val _googleState = mutableStateOf(GoogleLoginState())
    val googleLoginState: State<GoogleLoginState> = _googleState

    fun googleLogin(credential: AuthCredential) = viewModelScope.launch {
        repository.googleSignIn(credential).collect { result ->

            when (result) {

                is Resource.Success -> {
                    _googleState.value = GoogleLoginState(success = result.data)
                }
                is Resource.Loading -> {
                    _googleState.value = GoogleLoginState(loading = true)
                }
                is Resource.Error -> {
                    _googleState.value = GoogleLoginState(error = result.message!!)
                }
            }

        }
    }

    fun loginUser(email: String, password: String) = viewModelScope.launch {
        repository.loginUser(email, password).collect { result ->
            when (result) {
                is Resource.Success -> {
                    _loginState.send(LoginState(isSuccess = "Sign In Success "))
                }
                is Resource.Loading -> {
                    _loginState.send(LoginState(isLoading = true))
                }
                is Resource.Error -> {

                    _loginState.send(LoginState(isError = result.message))
                }
            }

        }
    }
}