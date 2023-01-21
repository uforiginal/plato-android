package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WhatIsAVariable() {
  Column {
    Text(text = "A variable in Kotlin is like a container that holds a value. Think of it like a box that you can put something inside of, like a number or a word. The box has a name, like \"x\" or \"y\", so you can easily find it and use it later.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "You can make a box that you can change the things inside of it later, this is called a variable. And you can also make a box that you can only look at the things inside of it, but can't change it, this is called a constant.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Variables can be declared using the \"var\" or \"val\" keyword, with \"var\" indicating that the value of the variable can be changed, and \"val\" indicating that it is a read-only variable. ")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "For example, you can make a variable named \"age\" and put the number \"13\" inside of it. Later on, you can change the number inside to \"14\". But if you make a constant named \"name\" and put the word \"John\" inside, you can't change it later.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "var age = 13 // age is a variable with an initial value of 13")
    Text(text = "age = 14 // the value of age is now 14")
    Text(text = "val name = \"John\" // name is a read-only variable with a value of \"John\"")
  }
}