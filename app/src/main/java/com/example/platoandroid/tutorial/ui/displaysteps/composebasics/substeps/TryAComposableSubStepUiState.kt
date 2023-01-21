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
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToBuildTheApp
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToSearchForCode

class TryAComposableSubStepUiState : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      // Long term, this tutorial code should be extracted to a library, but for now, to not
      // interfere in the directive to search, we want to break up this string with other
      // characters so it doesn't confuse their search.
      Text(text = "Search for this text in the project: 'Ad" + "d your first composable here'")
      HelpButton(prompt = "remind me how to search for code") {
        onHelpRequest { HowToSearchForCode() }
      }
      Text(text = "Did you find it? When you do, below the comment, type the following:")
      Text(
        text = "Text(text = \"Hello World!\")",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Text(text = "Then rebuild the app. When you do, you'll see your new text below! Click \"Next\" once you see it.")
      HelpButton(prompt = "remind me how to build the app") {
        onHelpRequest { HowToBuildTheApp() }
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
          Text(text = "I don't see my text")
        }
      }
    }
  }
}