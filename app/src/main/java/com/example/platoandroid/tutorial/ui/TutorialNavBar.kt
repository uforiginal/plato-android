package com.example.platoandroid.tutorial.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TutorialNavBar(onRestart: () -> Unit, onMenuClicked: () -> Unit, onBackPressed: () -> Unit) {
  Column() {
    TopAppBar(
      title = { Text("Learn Android") },
      navigationIcon = {
        IconButton(onClick = onBackPressed) {
          Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Back",
          )
        }
      },
      actions = {
        Button(
          onClick = { onRestart() },
          shape = CircleShape,
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Restart")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onMenuClicked() },
          shape = CircleShape,
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Menu")
        }
      }
    )
  }
}