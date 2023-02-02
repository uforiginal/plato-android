package com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepEight
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepFive
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepFour
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepOne
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepSeven
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepSix
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepThree
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepTwo

class ArchitechtureTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "What do you think of when you think about Architecture?")
      Text(text = "You probably think of the way something is built or structured, right?")
      Text(text = "Architecture in the context of software development has to do with the way code is structured.")
      Button(onClick = { showNextStep() }) {
        Text(text = "Next")
      }
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    ArchitectureSupStepOne(),
    ArchitectureSupStepTwo(),
    ArchitectureSupStepThree(),
    ArchitectureSupStepFour(),
    ArchitectureSupStepFive(),
    ArchitectureSupStepSix(),
    ArchitectureSupStepSeven(),
    ArchitectureSupStepEight(),
  )
}