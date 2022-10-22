package com.example.platoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.platoandroid.ui.TutorialBlock
import com.example.platoandroid.ui.theme.PlatoAndroidTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      PlatoAndroidTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          Column {
            TutorialBlock()

            /**
             * Add your first composable here
             * >> Hey you found it! Nice job!
             * Whenever you see these *s or the double // lines, it means the
             * text that follows it is a comment. This text won't run like code,
             * it's just so you can leave helpful notes like this one :)
             */
            // YOUR TEST AREA vvv

            // ^^^^^ add above ^^^^^
            // ^^^ YOUR TEST AREA
          }
        }
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  PlatoAndroidTheme {}
}