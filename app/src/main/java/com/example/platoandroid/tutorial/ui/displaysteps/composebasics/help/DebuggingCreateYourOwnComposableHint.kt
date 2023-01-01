package com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DebuggingCreateYourOwnComposableHint() {
  Column {
    Text(text = "Not to give too much of a hint, but here is the end goal of what you're looking for for the TodoListItem:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\nfun TodoListItem(taskName: String) {\n    Text(text = taskName)\n}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "What this does, is define a new function named TodoListItem, have it take a parameter named taskName that is a data type of String (basically text - think string of characters) and then adds the @Composable annotation to tell the compiler that this is a special function.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Note that we are putting a Text composable inside of this new composable function we created.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "This is one of the coolest things about compose, you can take very simple building blocks like this and stack them together to make more complex components you can reuse.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Once you have the TodoListItem composable created, you can add items to the TodoList component like this:")
    Text(
      text = "@Composable\nfun TodoList(title: String) {\n    Title(title = title)\n    TodoListItem(taskName = \"Learn Android!\")\n    TodoListItem(taskName = \"Build my own app\")\n}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
  }
}