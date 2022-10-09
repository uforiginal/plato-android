package com.example.platoandroid.tutorial.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TutorialStepCard(title: String? = null, content: @Composable () -> Unit) {
  Surface(
    shape = RoundedCornerShape(16.dp),
    elevation = 1.dp,
    modifier = Modifier.fillMaxWidth(),
    color = MaterialTheme.colors.surface
  ) {
    Column(
      modifier = Modifier.padding(all = 16.dp)
    ) {
      title?.let {
        Text(
          text = it,
          color = MaterialTheme.colors.secondaryVariant,
          style = MaterialTheme.typography.subtitle2
        )
      }
      content()
    }
  }
}