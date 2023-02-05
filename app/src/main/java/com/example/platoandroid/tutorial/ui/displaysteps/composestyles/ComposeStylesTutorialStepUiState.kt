package com.example.platoandroid.tutorial.ui.displaysteps.composestyles

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesEight
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesEightHalf
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesEleven
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesFive
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesFour
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesFourHalf
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesNine
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesOne
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesSeven
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesSix
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesTen
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesThirteen
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesThree
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesTwelve
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps.StylesTwo

class ComposeStylesTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Right now our todo list looks kind of bland.")
      Text(text = "So next, we're going to learn how to fix that by using styles.")
      Spacer(modifier = Modifier.width(16.dp))
      Button(onClick = { showNextStep() }) {
        Text(text = "Sounds good! Let's get started")
      }
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    StylesOne(),
    StylesTwo(),
    StylesThree(),
    StylesFour(),
    StylesFourHalf(),
    StylesFive(),
    StylesSix(),
    StylesSeven(),
    StylesEight(),
    StylesEightHalf(),
    StylesNine(),
    StylesTen(),
    StylesEleven(),
    StylesTwelve(),
    StylesThirteen(),
  )
}