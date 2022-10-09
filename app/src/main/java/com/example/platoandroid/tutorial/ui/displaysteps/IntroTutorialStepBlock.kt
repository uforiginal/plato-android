package com.example.platoandroid.tutorial.ui.displaysteps

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToSearchAFileName
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToSearchForCode

class IntroTutorialStepBlock : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "How does this work?",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.subtitle2
      )
      Text(
        text = "This tutorial will walk you through all the basic things you need to know to build your own app!"
      )
      Spacer(modifier = Modifier.height(4.dp))
      Text(
        text = "Follow the instruction given on each screen and keep an eye out for this icon:"
      )
      Icon(
        imageVector = Icons.Filled.Star,
        contentDescription = "Help",
      )
      Text(
        text = "any time you see it, it means you can click there to get some extra help. Let's test it out, try clicking the help buttons below for a refresher on how to find things in Android Studio."
      )
      Spacer(modifier = Modifier.height(4.dp))
      HelpButton(prompt = "how do I search a file name?") {
        onHelpRequest { HowToSearchAFileName() }
      }
      HelpButton(prompt = "how do I search for code?") {
        onHelpRequest { HowToSearchForCode() }
      }
      Button(onClick = { showNextStep() }) {
        Text(text = "Start step 1")
      }
    }
  }
}