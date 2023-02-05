package com.example.platoandroid.tutorial.ui.displaysteps.composebasics.substeps

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard

class ComposeBasicsSubStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Your todo list is looking good!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Coming up, were going to look at adding some styles to make our todo list a little better but first lets think about what other pieces our todo list might need.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The first thing you may notice is there is no way for a user to add new items, lets add some components to let a user add new todo items to the list.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Let's do it")
        }
      }
    }
  }
}

class ComposeBasicsSubStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "We will add a text field to enter in a new task name and a button to click to create the todo item.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We will put this at the bottom of your todo list and can use a TextField & Button composable to build the pieces.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "See if you can guess where the TextField & Button should go in your code - rebuild your app and see if you got it right!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Once you get it or if you get too stuck, click next to verify you added it to the right place.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ComposeBasicsSubStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "You should have added the TextField & Button in your TodoList.kt file inside of the TodoList composable at the bottom of the Column. This should now look like:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "@Composable\n" +
          "fun TodoList(title: String) {\n" +
          "  Column(\n" +
          "    modifier = Modifier.padding(12.dp)\n" +
          "  ) {\n" +
          "    Title(title = title)\n" +
          "    // We need to add some to-do items here below vvv\n" +
          "    TodoListRow(taskName = \"thing one\")\n" +
          "    TodoListRow(taskName = \"thing two\")\n" +
          "    TodoListRow(taskName = \"thing three\")\n" +
          "    TodoListRow(taskName = \"thing four\")\n" +
          "    // ^^^ Add to-do list items above\n" +
          "    TextField(value = \"\", onValueChange = {})\n" +
          "    Button(onClick = { /*TODO*/ }) {\n" +
          "      Text(text = \"Add Item\")\n" +
          "    }\n" +
          "  }\n" +
          "}",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ComposeBasicsSubStepFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Did yours look the same?")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Don't worry if it didn't, you'll have more chances to practice your skills!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Right now, you'll notice that our text field is stacked on top of the button. It would probably look better if they were side by side.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ComposeBasicsSubStepFive : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "It's your turn to try your skills again!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "See if you can figure out how to make the TextField & the Button be side by side instead of stacked.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Rebuild the app to check your solution and then click next to check your code!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ComposeBasicsSubStepSix : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Did you put your TextField & Button in a row? Your code should now look like this:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "@Composable\n" +
          "fun TodoList(title: String) {\n" +
          "  Column(\n" +
          "    modifier = Modifier.padding(12.dp)\n" +
          "  ) {\n" +
          "    Title(title = title)\n" +
          "    // We need to add some to-do items here below vvv\n" +
          "    TodoListRow(taskName = \"thing one\")\n" +
          "    TodoListRow(taskName = \"thing two\")\n" +
          "    TodoListRow(taskName = \"thing three\")\n" +
          "    TodoListRow(taskName = \"thing four\")\n" +
          "    // ^^^ Add to-do list items above\n" +
          "    Row {\n" +
          "      TextField(value = \"new item\", onValueChange = {})\n" +
          "      Button(onClick = { /*TODO*/ }) {\n" +
          "        Text(text = \"Add Item\")\n" +
          "      }\n" +
          "    }\n" +
          "  }\n" +
          "}",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ComposeBasicsSubStepSeven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "The next thing you might notice is that our TextField is touching the Button.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "See if you can add a Spacer to add some space between the TextField and the Button.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Rebuild to see if it worked and then click next to check your solution.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ComposeBasicsSubStepEight : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Did your? Your code should now look like this:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "@Composable\n" +
          "fun TodoList(title: String) {\n" +
          "  Column(\n" +
          "    modifier = Modifier.padding(12.dp)\n" +
          "  ) {\n" +
          "    Title(title = title)\n" +
          "    // We need to add some to-do items here below vvv\n" +
          "    TodoListRow(taskName = \"thing one\")\n" +
          "    TodoListRow(taskName = \"thing two\")\n" +
          "    TodoListRow(taskName = \"thing three\")\n" +
          "    TodoListRow(taskName = \"thing four\")\n" +
          "    // ^^^ Add to-do list items above\n" +
          "    Row {\n" +
          "      TextField(value = \"new item\", onValueChange = {})\n" +
          "      Spacer(modifier = Modifier.width(12.dp))\n" +
          "      Button(onClick = { /*TODO*/ }) {\n" +
          "        Text(text = \"Add Item\")\n" +
          "      }\n" +
          "    }\n" +
          "  }\n" +
          "}",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ComposeBasicsSubStepNine : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "It's looking good!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Before we move on to adding styles, lets add one more component to our todo list.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This time, let's add a divider that will show up at the bottom of every row item in our todo list. Compose has a component called Divider we can use for that. See if you can find where to add the Divider so it shows up at the bottom of every row.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ComposeBasicsSubStepTen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Did you get it? This time, you should have changed TodoListRow instead of TodoList so TodoListRow should now look like:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "@Composable\n" +
          "fun TodoListRow(taskName: String) {\n" +
          "  Row() {\n" +
          "    Icon(\n" +
          "      imageVector = Icons.Filled.CheckCircle,\n" +
          "      contentDescription = \"Checkmark\",\n" +
          "    )\n" +
          "    Spacer(modifier = Modifier.width(12.dp))\n" +
          "    Text(text = taskName)\n" +
          "  }\n" +
          "  Divider()\n" +
          "}",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Why did we change TodoListRow this time?")
        }
      }
    }
  }
}

class ComposeBasicsSubStepEleven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Jetpack Compose",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "We changed TodoListRow this time because the divider is an attribute we want to be part of every row.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Our composables are individual components we are packaging together. Everytime we add a TodoListRow, we want it to already come with that divider - we dont want to have to add a separate Divider composable every time we add a TodoListRow.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}
