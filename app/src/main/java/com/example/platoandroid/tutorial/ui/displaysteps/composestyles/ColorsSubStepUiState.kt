package com.example.platoandroid.tutorial.ui.displaysteps.composestyles

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
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton

class ColorsSubStepUiState : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "The first thing we'll look at is colors.")
      Text(text = "Find the file named Color.kt")
      Text(text = "This is the file where you can define colors you want to reuse in your app using hex codes.")
      HelpButton(prompt = "what are hex code colors") {
        onHelpRequest {  }
      }
      Text(text = "Try adding a new color to that file with your own hex code something like:")
      Text(
        text = "val MyColor = Color(0xFFXXXXXX)",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Text(text = "Replace the X's with your chosen hex code and name the value whatever you want.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest {  } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Tell me more about colors")
        }
      }
    }
  }
}