package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AndroidLibraryExplainedPreview() {
  Column {
    Text(text = "Think of a real life library. It's a big collection of books you can borrow to use yourself right?")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "A library in programming is similar, it's a collection of tools someone else built that you can borrow to use yourself.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "We will get into more detail about what that means later, but for now don't worry if you don't understand all of details of what a library is.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "The biggest thing you'll want to note for now is that since these are things you're borrowing from someone else, we have to tell our app where to get those things from.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Think a real life library again, to find a book your looking for, you may look at signs on the walls to find where it located so you can retrieve it.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "When the computer looks to borrow a tool from a library like compose that someone else built, we call that \"importing\" the borrowed thing and we have to tell it where to import it from.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "At the top of most files in this project, you'll see a number of lines that start with the word import.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "These are all examples of this and the text that follows the word \"import\" is the directions for the computer of where the borrowed thing is coming from, similar to the signs in a library that tell you where to find a book.")
  }
}