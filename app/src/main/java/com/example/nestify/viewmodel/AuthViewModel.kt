package com.example.nestify.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nestify.data.AuthUiState
import com.example.nestify.data.SupabaseClient
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.auth.providers.builtin.Email

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AuthViewModel : ViewModel() {

    // Holds login screen UI state (email, password, loading, error)
    private val _uiState = MutableStateFlow(AuthUiState())
    val uiState: StateFlow<AuthUiState> = _uiState

    // Called when user types in the email field
    fun onEmailChange(email: String) {
        _uiState.value = _uiState.value.copy(email = email)
    }

    // Called when user types in the password field
    fun onPasswordChange(password: String) {
        _uiState.value = _uiState.value.copy(password = password)
    }

    // Triggered when user presses "Login"
    fun login(onSuccess: () -> Unit) {
        viewModelScope.launch {
            try {
                // Step 1: set loading state
                _uiState.value = _uiState.value.copy(loading = true, error = null)

                // Step 2: access Supabase client
                val client = SupabaseClient.client

                // Step 3: perform login
                client.auth.signInWith(Email) {
                    email = _uiState.value.email
                    password = _uiState.value.password
                }

                // Step 4: login successful
                _uiState.value = _uiState.value.copy(loading = false)
                onSuccess()

            } catch (e: Exception) {
                // Step 5: handle any login errors
                _uiState.value = _uiState.value.copy(
                    loading = false,
                    error = e.message ?: "Login failed"
                )
            }
        }
    }
}
