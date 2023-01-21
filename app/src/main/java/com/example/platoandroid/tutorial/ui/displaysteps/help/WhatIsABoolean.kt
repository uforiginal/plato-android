package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WhatIsABoolean() {
  Column {
    Text(text = "Booleans in programming are like a light switch. They can only have two values, true or false, just like a switch can only be turned on or off.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "For example, you can use a Boolean to check if someone is older than 18 or not, or check if a number is even or odd.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Booleans are very useful because they allow you to make decisions in your program. You can use them to check if a certain condition is true or false, and then make different things happen depending on the result.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "For example, you can use a Boolean to check if a player has won or lost a game and then show the appropriate message.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "It's like a yes or no question, the answer can only be true or false, and you can use that answer to make different things happen in the program.")
    Spacer(modifier = Modifier.height(16.dp))
  }
}