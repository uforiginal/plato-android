package com.example.platoandroid.tutorial.ui.displaysteps.five_state

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
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepEight
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepEleven
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepFive
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepFour
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepNine
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepOne
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepSeven
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepSix
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepTen
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepThree
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps.StateSubStepTwo

class StateTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "What is State?") {
      Text(text = "State in an app is any value that can change over time.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "When we talk about “State” in mobile development - think about the current “State” of the app. ")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "For example, if you have an app that lets a user roll a dice and that dice is currently displaying a face with 2 dots, the “state” of the dice's value may be represented as 2.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "As with the dice example, state is a value that can be changed as certain actions take place within the app but always represents what the current value the app should be reflecting is.")
      Spacer(modifier = Modifier.height(8.dp))
      Button(onClick = { showNextStep() }) {
        Text(text = "How do we fix this?")
      }
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    StateSubStepOne(),
    StateSubStepTwo(),
    StateSubStepThree(),
    StateSubStepFour(),
    StateSubStepFive(),
    StateSubStepSix(),
    StateSubStepSeven(),
    StateSubStepEight(),
    StateSubStepNine(),
    StateSubStepTen(),
    StateSubStepEleven(),
  )
}