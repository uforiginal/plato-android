package com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

// Tell me more about alignment
@Composable
fun StepSixHint() {
  Column {
    Text(text = "@Composable\n" +
      "fun TodoListRow(taskName: String) {\n" +
      "  Row(\n" +
      "    modifier = Modifier.height(64.dp),\n" +
      "    verticalAlignment = Alignment.CenterVertically,\n" +
      "  ) {\n" +
      "    Text(text = taskName)\n" +
      "  }\n" +
      "}")
  }
}
