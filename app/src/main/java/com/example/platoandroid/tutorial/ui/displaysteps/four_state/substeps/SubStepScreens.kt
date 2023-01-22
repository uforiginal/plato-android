package com.example.platoandroid.tutorial.ui.displaysteps.four_state.substeps

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.help.IfStatementsExplained
import com.example.platoandroid.tutorial.ui.displaysteps.help.MutableStateOverview
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatIsABoolean
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatIsAVariable

class StateSubStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "We are going to try using state in our Todo List.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "First, we want to represent the state of a Todo item.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Each item on our todo list can be either “Open” or “Complete”.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We will represent this state using a variable named isComplete that can be either true or false for each todo item.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Let's try it")
        }
      }
    }
  }
}

class StateSubStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "Inside the composable function called TodoListItem, add a variable called isComplete of type Boolean.")
      HelpButton("remind me what a variable is") {
        onHelpRequest { WhatIsAVariable() }
      }
      HelpButton("remind me what a boolean is") {
        onHelpRequest { WhatIsABoolean() }
      }
      Text(text = "This would look like:")
      Text(text = "   var isComplete: Boolean = false", fontWeight = FontWeight.Bold)
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "For now, we will always make it false but later on we will make this dynamic.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Got it")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I need more help")
        }
      }
    }
  }
}

class StateSubStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "Now let's use the variable we created. Add an if statement that checks isCompleted around the check mark icon.")
      HelpButton("remind me how to use if statements") {
        onHelpRequest { IfStatementsExplained() }
      }
      Text(text = "This tells the computer that we only want to render the checkmark icon when isComplete is true.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Try rebuilding the app, since we defaulted isComplete to false, you should not see the checkmarks anymore.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I still see the checkmarks")
        }
      }
    }
  }
}

class StateSubStepFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "Now, in the onclick function brackets of your complete button, add this line to set isComplete to true:")
      Text(text = "      isComplete = true", fontWeight = Companion.Bold)
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Rebuild this app & try clicking complete.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "It’s not working")
        }
      }
    }
  }
}

class StateSubStepFive : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "When you click the button, nothing happens. That is expected right now but let’s look at why.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class StateSubStepSix : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "Our current solution will work for the first render, but if we change the isComplete value while running the app (by clicking complete), it will not change whether or not the check mark shows.\n" +
        "To fix this, we can use something in Compose called “remember” & “MutableState”.\n")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To use these for your isComplete variable, update your variable definition to look like this:")
      Text(
        text = "var isComplete = \n     remember { mutableStateOf(true) }",
        fontWeight = Companion.Bold,
        overflow = TextOverflow.Visible,
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Continue")
        }
      }
    }
  }
}

class StateSubStepSeven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "“remember” is a tool android provides to make sure we don’t try to recalculate the state value too many times. The MutableState inside the remember brackets is a special data type that holds a value and tells our view to re-render any time that value it holds is updated.")
      HelpButton("learn more about MutableState") {
        onHelpRequest { MutableStateOverview() }
      }
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class StateSubStepEight : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "You may see some red squiggles under the two usages of isComplete after moving it to this new type. This is because isComplete is no longer a Boolean, it is of type MutableState.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To access the Boolean value that is wrapped by MutableState, we need to call value on isComplete")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "After updating that, rebuild the app and try to click complete.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "It works now!")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Still not working")
        }
      }
    }
  }
}

class StateSubStepNine : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "This new approach we have for holding our isComplete value still has a problem though.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This would work well if we had a todo list we only wanted to keep as long as we kept the app open but it will not work if we want our todo list to last for many days.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Why not?")
        }
      }
    }
  }
}

class StateSubStepTen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "When our app gets restarted or closed in the background, using remember & MutableState will reset our isComplete value.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Click complete on a few of your todo items and try rebuilding the app to see this happen.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we fix this?")
        }
      }
    }
  }
}

class StateSubStepEleven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "The solution to this is something called SavedStateHandle & SharedPreferences.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We are going to spend some time looking at these two concepts but first we are going to look at something called Viewmodels.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Let's talk about ViewModels")
        }
      }
    }
  }
}
