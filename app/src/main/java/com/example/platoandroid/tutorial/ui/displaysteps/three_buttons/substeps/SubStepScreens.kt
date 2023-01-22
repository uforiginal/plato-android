package com.example.platoandroid.tutorial.ui.displaysteps.three_buttons.substeps

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This function is the on click callback.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This means when the button is clicked, anything within that function will be executed.")
      Spacer(modifier = Modifier.height(8.dp))
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
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This function is the on click callback.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This means when the button is clicked, anything within that function will be executed.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Sounds good")
        }
      }
    }
  }
}