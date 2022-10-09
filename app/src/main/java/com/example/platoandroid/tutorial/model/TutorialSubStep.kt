package com.example.platoandroid.tutorial.model

import androidx.annotation.NavigationRes
import androidx.compose.runtime.Composable

interface TutorialSubStep

interface TutorialSubStepBlockState: TutorialSubStep {
  @Composable
  fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit)
}

interface TutorialSubStepFragment: TutorialSubStep {
  val navigationRes: NavigationRes
}