package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HowToSearchForCode() {
  Column {
    Text(text = "If you are using a mac:")
    Text(text = "The Cmd + Shift + F keyboard shortcut will let you search for any text in the project.")
    Spacer(modifier = Modifier.height(12.dp))
    Text(text = "If you are using Windows:")
    Text(text = "The Control + Shift + F keyboard shortcut will let you search for any text in the project.")
  }
}