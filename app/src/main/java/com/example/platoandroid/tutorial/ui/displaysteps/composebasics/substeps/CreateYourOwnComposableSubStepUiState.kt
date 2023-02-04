package com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help.CreateYourOwnComposableHint
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToSearchAFileName

class CreateYourOwnComposableSubStepUiState : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Now that you know how to add composables, you're going to make one of your own.")
      Text(text = "We started an example for you called TodoList. To start, we are going to add the composeable we have already started for you to our MainActivity where you have added your other composables. Add the TodoList component to your test area by adding this code:")
      Text(
        text = "TodoList(title = \"My Todo List\")",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Text(text = "Adding this is not much different then when you added a Text or Button composable but since this is one we define in our own code, we are going to get to take a look inside of it.")
      Text(text = "Next, find the file named TodoList.kt where this is defined and follow the directions there.")
      HelpButton(prompt = "remind me how to find a file") {
        onHelpRequest { HowToSearchAFileName() }
      }
      Text(text = "If you get stuck with the directions in that file, use the \"I need a hint\" button.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { CreateYourOwnComposableHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I need a hint")
        }
      }
    }
  }
}