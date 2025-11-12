package com.example.nestify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nestify.screens.LoginScreen
import com.example.nestify.ui.theme.NestifyTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NestifyTheme {
                var loggedIn by remember { mutableStateOf(false) }


                if (!loggedIn) {
                    LoginScreen(
                        onLoginSuccess = { loggedIn = true }
                    )
                } else {
                    SuccessScreen()
                }
            }
        }
    }
}

@Composable
fun SuccessScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Text("✅ Logged in successfully!", style = MaterialTheme.typography.headlineSmall)
    }
}
