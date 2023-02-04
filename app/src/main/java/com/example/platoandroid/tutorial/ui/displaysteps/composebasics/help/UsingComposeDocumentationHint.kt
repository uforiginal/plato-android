package com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun UsingComposeDocumentationHint() {
  Column {
    Text(text = "When you go to the listed URL, you'll see a header that says \"Components\" and list below that that has all the options.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "The very left column is the category of UI components, for example, you'll see Buttons on the very left that groups all the button options.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "In the middle column, you'll see individual component names in blue text. If you click on any of those, it will take you to more detailed documentation on how to implement that specific component.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "If you're struggling or having trouble picking a component to add, take a look at Checkbox.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "If you're still struggling, don't forget to ask for help :)")
  }
}