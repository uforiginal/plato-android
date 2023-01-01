package com.example.platoandroid.tutorial.ui.displaysteps.buttonsandstate

import androidx.compose.runtime.Composable
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.ui.TutorialStepCard

class ButtonsAndStateStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Buttons & State") {
      
    }
  }
}