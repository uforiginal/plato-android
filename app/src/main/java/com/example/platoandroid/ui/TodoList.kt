package com.example.platoandroid.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.data.TodoListItem

/**
 * TodoList & Title below are examples of custom composables.
 * Below them, where the "Create a new composable here" comment is,
 * you are going to practice adding another custom composable.
 *
 * You'll notice TodoList & Title mostly look like normal functions except
 * for one thing - they both say "@Composable" at the top.
 *
 * Words that start with @ sign above classes or functions are what we
 * call "annotations". Think about what the word annotation means outside
 * of programming - for instance, an annotation on an image, is just an
 * explanation of what that image is. Its pretty much the same thing here.
 * When we "annotate" a function (in this case as @Composable) we are telling
 * Android Studio that this function is not just a normal function,
 * it's a special one whose purpose is to be a UI building block.
 *
 * Below the "Create a new composable here" comment line below, create a function
 * named TodoListRow and annotate it as @Composable to tell the Android Studio
 * it will be another one of our UI building blocks.
 *
 * After you do that, add a parameter to the function called taskName that is
 * of type String. Remember a parameter is just a value that function takes in.
 * As an example, TodoList & Title both define a parameter of "title: String".
 * Also remember that String is just the fancy term we use for text. Think of it
 * as "a string of characters".
 *
 * Next, once you have the TodoListRow composable created, and it takes in
 * a parameter of taskName, we need to do something with that taskName. For
 * now, we are just going to set it to display as normal text. Inside of your
 * TodoListRow composable, add a Text composable where text = taskName.
 *
 * Since we are going to want our content to layout horizontally, let's also wrap
 * that Text composable in a "Row" composable. This will look like:
 *
 * Row {
 *  Text(text = taskName)
 * }
 *
 * Compose has two layout composables you will use alot, those are Row (like we
 * just used) and Column. Anything in a Row, will layout horizontal and anything
 * in a Column, will layout vertically.
 *
 * We also want a way to indicate if a task is done or not so we will add a checkmark
 * to the Row as well. Inside the Row brackets and above the Text composable, add an
 * Icon composable by adding this code:
 *
 * Icon(
 *  imageVector = Icons.Filled.CheckCircle,
 *  contentDescription = "Checkmark",
 * )
 *
 * Add a few of your TodoListRow composables inside of the TodoList
 * composable. You can give them made up taskNames for now as we will handle
 * letting the user input those values later on. Rebuild the app to see how row items
 * turned out.
 *
 * You'll notice that the checkmark Icon and the task names are pretty close together.
 * We can fix this by adding a Spacer composable. In between the Icon and the Text composable,
 * add this code:
 *
 * Spacer(modifier = Modifier.width(12.dp))
 *
 * Don't worry about what a Modifier is right now, we will look more at that later on.
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
