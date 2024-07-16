package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingcard.ui.theme.GreetingCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Nathalie",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
// Partie 3 - Créer votre première application Android
    // Modifier le texte et la couleur de l'arrière-plan
    @Composable
    fun Greeting(name: String) {
        Surface(color = Color.Blue) {
            Text(text = "Hi, my name is $name!")
        }
    }



    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        GreetingCardTheme {
            Greeting("Nathalie")
        }
    }
}