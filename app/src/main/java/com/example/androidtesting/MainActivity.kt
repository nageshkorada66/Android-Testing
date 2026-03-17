package com.example.androidtesting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidtesting.ui.theme.AndroidTestingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidTestingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Nagesh",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        color = Color.Green,
//        modifier = modifier
//    )
    Column() {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Row 1", Modifier.background(Color.Red).padding(20.dp))
            Text(text = "     ", Modifier.background(Color.White).padding(20.dp))
            Text(text = "Row 3", Modifier.background(Color.Green).padding(20.dp))
            Text(text = "Row 2", Modifier.background(Color.Blue).padding(20.dp))
        }
        Column(modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Column 1", Modifier.background(Color.Yellow).padding(20.dp))
            Text(text = "Column 2", Modifier.background(Color.DarkGray).padding(20.dp))
            Text(text = "Column 3", Modifier.background(Color.Magenta).padding(20.dp))
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidTestingTheme {
        Greeting("Android")
    }
}