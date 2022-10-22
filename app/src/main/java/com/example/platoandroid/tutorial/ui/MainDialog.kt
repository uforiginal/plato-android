package com.example.platoandroid.tutorial.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainDialog(title: String, content: @Composable () -> Unit, onDismiss: () -> Unit) {
  Card(
    modifier = Modifier
      .fillMaxHeight(0.9f)
      .fillMaxWidth(1f),
    shape = RoundedCornerShape(8.dp)
  ) {
    Column(
      modifier = Modifier
        .padding(all = 16.dp)
        .verticalScroll(rememberScrollState()),
    ) {
      Text(
        text = title,
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.subtitle2
      )
      content()
      Button(onClick = onDismiss) {
        Text(text = "Done")
      }
    }
  }
}