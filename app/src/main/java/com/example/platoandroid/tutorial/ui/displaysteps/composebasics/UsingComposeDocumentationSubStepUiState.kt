package com.example.platoandroid.tutorial.ui.displaysteps.composebasics

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help.UsingComposeDocumentationHint
import com.example.platoandroid.tutorial.ui.displaysteps.help.DocumentationExplained
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton

class UsingComposeDocumentationSubStepUiState : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Now that you've added 2 basic compose components, its time for you to pick some components yourself to add.")
      Spacer(modifier = Modifier.width(8.dp))
      Text(text = "To do this, type this URL in a browser, it will take you to compose component documentation.")
      Text(
        text = "https://tinyurl.com/compose-components",
        color = MaterialTheme.colors.primaryVariant,
      )
      HelpButton(prompt = "What is documentation?") { onHelpRequest { DocumentationExplained() } }
      Text(text = "Pick some that look interesting to you and try following the documentation to add them to your test area.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { UsingComposeDocumentationHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I'm having trouble")
        }
      }
    }
  }
}