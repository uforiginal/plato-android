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
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help.DebuggingMyFirstComposableHint
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help.WhyCantIClickMyButtonHint
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton

class TryAComposablePartTwoSubStepUiState : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Congrats on adding your first composable!")
      Text(text = "Let's try adding a different component now.")
      Text(text = "Under the Text composable you just added, you're going to add a Button.")
      Text(text = "To do this, add this line:")
      Text(
        text = "Button(onClick = { /*TODO*/ }) {\n    /*CONTENT*/\n}",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Text(text = "Rebuild the app. You'll notice the button is blank - try removing the text that says /*CONTENT*/ and replacing it with another Text composable and rebuild to see what happens.")
      HelpButton(prompt = "why can't I click my button?") {
        onHelpRequest { WhyCantIClickMyButtonHint() }
      }
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { DebuggingMyFirstComposableHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I don't see my button")
        }
      }
    }
  }
}