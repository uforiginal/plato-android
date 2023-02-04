package com.example.platoandroid.tutorial.ui.displaysteps.four_textfields

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard

class TextFieldsTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "Text Fields") {
      Text(text = "todo")
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = emptyList()
}