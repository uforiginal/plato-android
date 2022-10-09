package com.example.platoandroid.tutorial.ui.displaysteps

import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.ui.TutorialStepCard

class WelcomeTutorialStepBlock: TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Congrats coder, you built the app!",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.subtitle2
      )
      Text(
        text = "That is the first step towards learning to develop Android apps! Are ready to get started learning about Android development?"
      )
      Button(onClick = { showNextStep() }) {
        Text(text = "Get started")
      }
    }
  }
}