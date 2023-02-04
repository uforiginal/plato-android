package com.example.platoandroid.tutorial.ui.displaysteps.eight_gradle

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.help.AndroidLibraryExplainedPreview
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton

class GradleTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "Gradle & Dependency Management") {
      Text(text = "We're going to spend some time talking about dependencies. Remember we mentioned before about using Android Libraries - libraries are things we depend on and we have to have a way to manage these dependencies.")
      Spacer(modifier = Modifier.height(8.dp))
      HelpButton(prompt = "what are android libraries?") {
        onHelpRequest { AndroidLibraryExplainedPreview() }
      }
      Spacer(modifier = Modifier.height(8.dp))
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    GradleSupStepOne(),
    GradleSupStepTwo(),
  )
}