package com.example.platoandroid.tutorial.ui.displaysteps.composestyles

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

class ThemesSubStepUiState : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Later, we will add these colors to specific components but we can also use these colors to create 'Themes' for  our app.")
      Text(text = "Find the file named Theme.kt")
      Text(text = "You'll see both a LightColorPalette & DarkColorPalette that let you set different default colors for light & dark mode.")
      Text(text = "In the LightColorPalette, change the value of 'primary' to be set to your color you just added.")
      Text(text = "Rebuild the app and see what happens!")
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