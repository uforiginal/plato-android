package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable

@Composable
fun HelpButton(prompt: String, onClick: () -> Unit) {
  Button(
    onClick = { onClick() },
    shape = CircleShape,
    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
  ) {
    Row() {
      Icon(
        imageVector = Icons.Filled.Star,
        contentDescription = "Help",
      )
      Text(text = prompt)
    }
  }
}