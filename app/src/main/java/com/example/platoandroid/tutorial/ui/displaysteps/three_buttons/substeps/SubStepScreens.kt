package com.example.platoandroid.tutorial.ui.displaysteps.three_buttons.substeps

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton

class ButtonsSubStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Buttons") {
      Text(
        text = "When you constructed your button, you noticed there was a required function that had to be provided in the Button constructor. "
      )
      Text(text = "This function is the on click callback.")
      Text(text = "This means when the button is clicked, anything within that function will be executed.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Sounds good")
        }
      }
    }
  }
}

class ButtonsSubStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Buttons") {
      Text(
        text = "When you constructed your button, you noticed there was a required function that had to be provided in the Button constructor. "
      )
      Text(text = "This function is the on click callback.")
      Text(text = "This means when the button is clicked, anything within that function will be executed.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Sounds good")
        }
      }
    }
  }
}