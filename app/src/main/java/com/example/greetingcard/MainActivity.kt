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
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) {innerPadding -> 24.dp}
                    Greeting(
                        name = "Android")
                        /* Un élément Modifier permet d'améliorer ou de décorer
                        un composable. Vous pouvez utiliser le modificateur padding,
                         qui applique un espace autour de l'élément (dans ce cas,
                         il s'agit d'ajouter de l'espace autour du texte).
                         Pour ce faire, utilisez la fonction Modifier.padding().
                         Ex : modifier = Modifier.padding(24.dp)
                         Ajout des imports obligatoires */
                }
            }
        }
    }
// Partie 3 - Créer votre première application Android
    /* Modifier le texte et la couleur de l'arrière-plan
    @Composable
    fun Greeting(name: String) {
        Surface(color = Color.Blue) {
            Text(text = "Hi, my name is $name!")
        }
    }*/
// Partie 4 - Ajouter une marge intérieure de 24dp
@Composable
fun Greeting(name: String) {
    Surface(color = Color.Magenta) {
        Text(text = "Hi, my name is $name!", modifier = Modifier.padding(24.dp))

    }
}



    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        GreetingCardTheme {
            Greeting("Wall-E")
        }
    }
