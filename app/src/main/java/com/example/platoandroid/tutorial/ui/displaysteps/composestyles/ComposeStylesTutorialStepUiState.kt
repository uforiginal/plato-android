package com.example.platoandroid.tutorial.ui.displaysteps.composestyles

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.ui.TutorialStepCard

class ComposeStylesTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Right now our todo list looks kind of bland.")
      Text(text = "So next, we're going to learn how to fix that by using styles.")
      Spacer(modifier = Modifier.width(16.dp))
      Button(onClick = { showNextStep() }) {
        Text(text = "Sounds good! Let's get started")
      }
    }
  }
}