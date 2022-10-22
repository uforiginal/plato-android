package com.example.platoandroid.tutorial.ui.displaysteps.composebasics

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help.ComposeOverviewHint
import com.example.platoandroid.tutorial.ui.displaysteps.help.AndroidLibraryExplainedPreview
import com.example.platoandroid.tutorial.ui.displaysteps.help.FunctionExplained
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton

class ComposeOverviewSubStepUiState : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    // val annotatedLinkString: AnnotatedString = buildAnnotatedString {
    //
    // }
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "To build UI for Android, we use something called Jetpack Compose (or sometimes we call it just Compose).")
      Spacer(modifier = Modifier.height(4.dp))
      Text(text = "Compose is an android library  that lets you build views using 'Compose components'. These components are just building blocks you use to build your apps UI.")
      HelpButton(prompt = "what is an android library") { onHelpRequest { AndroidLibraryExplainedPreview() } }
      Text(text = "Another term we use to describe these components is 'Composable functions'.")
      Spacer(modifier = Modifier.height(4.dp))
      Text(text = "That is because these components (or Composable functions) are functions that 'return' a UI element.")
      HelpButton(prompt = "remind me what a function is") { onHelpRequest { FunctionExplained() } }
      Spacer(modifier = Modifier.height(4.dp))
      Text(text = "Some of these are provided by Android, for example to add Text, you can use the Text component:")
      Text(
        text = "Text(text = 'some text')",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.caption,
        modifier = Modifier.padding(start = 16.dp)
      )
      Text(text = "Adding this will display `some text` on the screen. Ready to try this for yourself?")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Yes! Let's go")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { ComposeOverviewHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "No, I'm confused")
        }
      }
    }
  }
}
