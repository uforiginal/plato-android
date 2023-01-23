package com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes

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
import com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.subssteps.DataTypesSubStepOne
import com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.subssteps.DataTypesSubStepThree
import com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.subssteps.DataTypesSubStepTwo

class DataTypesTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "Data Types") {
      Text(text = "Let’s take a look at data types.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We have already worked a lot with simple data types like String, Int, Boolean")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "But it can also be helpful to create custom data types to represent objects in our app.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we use custom data types?")
        }
      }
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    DataTypesSubStepOne(),
    DataTypesSubStepTwo(),
    DataTypesSubStepThree(),
  )
}