package com.example.codelabsbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.codelabsbasics.ui.theme.CodelabsBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodelabsBasicsTheme {
                MyApp()
            }
        }
    }
}
@Composable
fun MyApp(names: List<String> = listOf("World", "Compose")){
    Surface (color = MaterialTheme.colorScheme.background ){
        Column {
            for (name in names) {
                Greeting( name)
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color  = MaterialTheme.colorScheme.primary) {
        Column(modifier = modifier.padding(24.dp).fillMaxWidth(1f)){
            Text(text = "Hello,")
            Text(text = name)
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingPreview() {
    CodelabsBasicsTheme {
        MyApp()
    }
}