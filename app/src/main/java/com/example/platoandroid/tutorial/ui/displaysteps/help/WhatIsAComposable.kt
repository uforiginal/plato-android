package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WhatIsAComposable() {
  Column {
    Text(text = "In Android, Jetpack Compose is a new way of building the UI of an app. It uses a declarative programming approach, which means that you describe what the UI should look like, and the framework takes care of actually creating it.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "A composable is a building block of the UI, similar to a function in programming. It takes some inputs, and it returns a part of the UI as output. Each composable can be composed of other composables, hence the name \"composable.\"")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "For example, a composable that creates a button might take the text that should be displayed on the button, and the function to be called when the button is pressed, as inputs. It would then return a button with that text and that function as output.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Composables are reusable, which means that you can use them in multiple parts of the app, and you can also create your own custom composables.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Composables also have their own lifecycle, meaning that they can be created, updated, and destroyed as the user interacts with the app.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "By using composables, developers can build their UI in a more efficient and maintainable way. They can also take advantage of the declarative programming approach to make it easier to reason about the state and behavior of the app.")
    Spacer(modifier = Modifier.height(16.dp))
  }
}