package com.example.platoandroid.tutorial.model

import androidx.compose.runtime.Composable

interface TutorialStepUiState {
  @Composable
  fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit)

  fun getSubSteps() : List<TutorialSubStep>
}