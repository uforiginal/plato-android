package com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Why don't I see my changes?
@Composable
fun StepFourHint() {
  Column {
    Text(text = "The first thing to check is always if your app built successfully.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Look in the build tab for a message of BUILD SUCCESSFUL - if you don't see that, you probably need to look through the build errors to see what happened.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If you do see BUILD SUCCESSFUL, you probably have an error in you code. Your todo list row code should currently look like:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "@Composable\n" +
      "fun TodoListRow(taskName: String) {\n" +
      "  Row(\n" +
      "    modifier = Modifier.height(64.dp)\n" +
      "  ) {\n" +
      "    Text(text = taskName)\n" +
      "  }\n" +
      "}")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If your code looks right, but you are still having issues, don't forget to ask for help!")
    Spacer(modifier = Modifier.height(8.dp))
  }
}