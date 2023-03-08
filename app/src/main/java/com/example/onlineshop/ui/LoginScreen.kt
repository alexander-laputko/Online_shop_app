package com.example.onlineshop.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.onlineshop.ui.theme.OnlineShopTheme

@Composable
fun LoginScreen() {
    Text(
        text = "Welcome Back",
        fontWeight = FontWeight.Bold
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview() {
    OnlineShopTheme {
        LoginScreen()
    }
}

