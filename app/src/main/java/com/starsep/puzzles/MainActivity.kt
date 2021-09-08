package com.starsep.puzzles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.starsep.puzzles.ui.theme.PuzzlesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PuzzlesTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Puzzles()
                }
            }
        }
    }
}

@Composable
fun Puzzles() {
    Text(text = "Puzzles2!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PuzzlesTheme {
        Puzzles()
    }
}