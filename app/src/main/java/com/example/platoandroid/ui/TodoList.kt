package com.example.platoandroid.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

/**
 * TodoList & Title here are examples of custom composables.
 * Below them, where the "Create a new composable here" comment is,
 * you are going to practice adding another custom composable.
 *
 * You'll notice TodoList & Title mostly look like normal functions except
 * for one thing - they both say "@Composable" at the top.
 *
 * Words that start with @ sign above classes or functions are what we
 * call "annotations". Think about what the word annotation means outside
 * of programming - for instance an annotation on an image, is just an
 * explanation of what that image is. Its pretty much the same thing here.
 * When we "annotate" a function (in this case as @Composable) we are telling
 * the compiler (the thing that gets your code ready to run) that this function
 * is not just a normal function, it's a special one whose purpose is to be
 * a UI building block.
 *
 * Below the "Create a new composable here" comment line, create a function
 * named TodoListItem and annotate it as @Composable to tell the compiler
 * it will be another one of our UI building blocks.
 *
 * After you do that, add a parameter to the function called taskName that is
 * of type String. Remember a parameter is just a value that function takes in.
 * As an example, TodoList & Title both define a parameter of "title: String".
 * Also remember that String is just the fancy term we use for text. Think of it
 * as "a string of characters".
 *
 * Next, once you have the TodoListItem composable created, and it takes in
 * a parameter of taskName, we need to do something with that taskName. For
 * now, we are just going to set it to display as normal text. Inside of your
 * TodoListItem composable, add a Text composable where text = taskName.
 *
 * Finally, add a few of your TodoListItem composables inside of the TodoList
 * composable.
 */
@Composable
fun TodoList(title: String) {
  Title(title = title)
  // We need to add some to-do items here below vvv

  // ^^^ Add to-do list items above
}

@Composable
fun Title(title: String) {
  Text(text = "$title")
}

// Create a new composable here vvv
