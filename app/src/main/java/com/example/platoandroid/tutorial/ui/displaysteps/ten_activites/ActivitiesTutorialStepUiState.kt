package com.example.platoandroid.tutorial.ui.displaysteps.ten_activites

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard

class ActivitiesTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "App Lifecycle") {
      Text(text = "Now we are going to take some time to look at App & Activity lifecycle.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You probably won't need to know the detail of App & Activity lifecycle for your first app but it's important to be aware of the general states your app can be in.")
      Spacer(modifier = Modifier.height(8.dp))
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    LifecycleSupStepOne(),
    LifecycleSupStepTwo(),
    LifecycleSupStepThree(),
  )
}