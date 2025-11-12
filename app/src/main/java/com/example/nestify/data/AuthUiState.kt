package com.example.nestify.data

data class AuthUiState(
    val email:String="",
    val password:String="",
    val loading:Boolean=false,
    val error:String?=null

)
