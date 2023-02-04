package com.example.platoandroid.tutorial.ui.displaysteps.eight_gradle

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
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToSearchAFileName

class GradleSupStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "App Lifecycle") {
      Text(text = "We use a tool called gradle to manage our dependencies. Gradle also does many other things for our android app but managing our dependencies is the one we are going to focus on.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "When we want to depend on an external library, we add the path for it to our build.gradle file.")
      Text(text = "Note: your project may have multiple build.gradle files, you are looking for the one under the app directory.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Search for this file (build.gradle)")
      HelpButton(prompt = "how to search for a file") {
        onHelpRequest { HowToSearchAFileName() }
      }
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class GradleSupStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "App Lifecycle") {
      Text(text = "In this file, within the `dependencies {}` block, you will see a number of dependencies already added. These have been added for you for this project but when you create your own, you will need to add them yourself.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Read through the comments in that file to understand what the different dependencies are for and some best practices about working with gradle files. ")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Also spend some time looking through Androids official documentation on compose libraries: https://developer.android.com/jetpack/androidx/explorer")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}