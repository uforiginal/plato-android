package com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.subssteps

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToSearchAFileName

class DataTypesSubStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Data Types") {
      Text(
        text = "For example, in our Todo List we are building, each item has a few values associated with it like:\n" +
          "taskName, isCompleted status, dueDate, etc."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "It will be helpful if we can wrap all of these values into one data type representing a todo list item.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we do this?")
        }
      }
    }
  }
}

class DataTypesSubStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Data Types") {
      Text(
        text = "We can do this using a data class."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We have a data class already started to represent your todo list item called TodoListItem - try using the class search option to find this file.")
      HelpButton("how to search for a class") {
        onHelpRequest { HowToSearchAFileName() }
      }
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we do this?")
        }
      }
    }
  }
}

class DataTypesSubStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Data Types") {
      Text(
        text = "Read through the comments in the TodoListItem file and follow the instructions to add the additional needed values to the data class."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Completed it!")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I need help")
        }
      }
    }
  }
}