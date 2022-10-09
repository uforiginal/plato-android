package com.example.platoandroid.tutorial.ui.displaysteps.composebasics

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.help.DocumentationExplained
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton

class LearnMoreAboutComposeSubStepUiState : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Now that you've added 2 basic compose components, its time for you to pick some components of your own to add.")
      Text(text = "To do this, copy this URL and paste in a browser, it will take you to compose componant documentation.")
      HelpButton(prompt = "What is documentation?") { onHelpRequest { DocumentationExplained() } }
      Text(text = "Pick some that look interesting to you and try adding them to your test area.")
    }
  }
}