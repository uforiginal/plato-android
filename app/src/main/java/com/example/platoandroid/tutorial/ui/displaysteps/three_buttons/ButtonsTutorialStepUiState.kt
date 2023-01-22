package com.example.platoandroid.tutorial.ui.displaysteps.three_buttons

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.three_buttons.substeps.ButtonsSubStepOne
import com.example.platoandroid.tutorial.ui.displaysteps.three_buttons.substeps.ButtonsSubStepTwo

class ButtonsTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "Working with Buttons") {
      Text(text = "Let’s loop back to buttons now.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We added a button to the end of our todo list rows to mark the task as completed but right now it doesn’t do anything.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we fix this?")
        }
      }
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    ButtonsSubStepOne(),
    ButtonsSubStepTwo(),
  )
}