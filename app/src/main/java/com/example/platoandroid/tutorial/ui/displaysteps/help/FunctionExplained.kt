package com.example.platoandroid.tutorial.ui.displaysteps.help

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
fun FunctionExplained() {
  Column {
    Text(text = "You can think of a function as a small container of code.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "We use functions to group together lines of code to perform a certain \"function\" or task that we can re-use.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "In Kotlin, we write a function like this:")
    Spacer(modifier = Modifier.height(16.dp))
    Text(
      text = "fun myFunction(): ReturnType {}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "To break that down, the first word 'fun' stands for 'FUNction' and this is how we tell the compiler (fancy word for the thing that makes our code able to run) that we are creating a function.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "The second part: `myFunction()` is the name of the function. It can be named whatever you want but can't have spaces. Because of that, we usually indicate a new word by capitalizing the first letter.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "The () after myFunction are what we call the constructor, you can just think of it as the place to provide any information we need to 'construct' the function.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "The part after the : defines what the function returns. This could be a number, some text, or anything else. A function does not need to have a return type.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "In between the {} are where the actually code that is contained by the function goes.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "If we wanted to create a function that adds 2 numbers it would look like:")
    Spacer(modifier = Modifier.height(16.dp))
    Text(
      text = "fun add(numberOne: Int, numberTwo: Int): Int {\n    return numberOne + numberTwo\n}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
  }
}