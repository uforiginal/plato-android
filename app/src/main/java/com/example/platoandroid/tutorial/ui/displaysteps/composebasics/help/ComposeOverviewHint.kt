package com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ComposeOverviewHint() {
  Column {
    Text(text = "Android Jetpack Compose is a new UI toolkit for building Android apps. It is based on a declarative programming model, which means that you describe what the UI should look like, and the framework takes care of actually creating it.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "One of the main goals of Jetpack Compose is to make the UI development more efficient, expressive, and easier to understand. It allows developers to create the UI using composable functions, which are reusable building blocks of the UI. Each composable function takes some inputs, and it returns a part of the UI as output. This makes it easy to create and update the UI based on the app's state.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Jetpack Compose also provides a rich set of pre-built UI elements like buttons, text, images, and animations, that can be easily composed to build complex and beautiful UI.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Another important feature of Jetpack Compose is its integration with the existing Android ecosystem, it works with the existing Android view hierarchy, and it can also be used with the existing Android XML layouts, this allows developers to use it gradually in their projects.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Jetpack Compose is still in the early stages of development, but it's expected to be the main way of building the UI of Android apps in the future, it also will simplify the development process, improve the performance and make the code more readable and maintainable.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Don't worry if you don't totally understand compose yet (that's expected!) - the next step will walk you through some hands on practice using compose. Sometimes just jumping in and doing it is the best way to learn but also rember you can always ask for help if you get too stuck!")
  }
}