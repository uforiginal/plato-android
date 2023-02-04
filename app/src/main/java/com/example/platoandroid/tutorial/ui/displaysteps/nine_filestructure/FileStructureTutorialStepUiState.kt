package com.example.platoandroid.tutorial.ui.displaysteps.nine_filestructure

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

class FileStructureTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "File Structure") {
      Text(text = "When we talk about File Structure, we just mean how the files needed for our app are organized between folders.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We talked a little bit about how files are organized when we talked about architecture, but now we are going to take a broader look at how the WHOLE app is structured.")
      Button(onClick = { showNextStep() }) {
        Text(text = "Sounds good")
      }
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    FileStructureSupStepOne(),
    FileStructureSupStepTwo(),
    FileStructureSupStepThree(),
    FileStructureSupStepFour(),
    FileStructureSupStepFive(),
    FileStructureSupStepSix(),
  )
}