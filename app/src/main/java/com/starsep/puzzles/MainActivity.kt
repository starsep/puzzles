package com.starsep.puzzles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.starsep.puzzles.ui.theme.PuzzlesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PuzzlesTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    PuzzlesMenu()
                }
            }
        }
    }
}

@Composable
fun PuzzlesMenu() {
    Column(modifier = Modifier.verticalScroll(state = ScrollState(0))) {
        Puzzles.map {
            PuzzleMenuItem(it)
        }
    }
}

@Composable
fun PuzzleMenuItem(puzzle: Puzzle) {
    Text(stringResource(id = puzzle.nameId))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PuzzlesTheme {
        PuzzlesMenu()
    }
}