package com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WhyCantIClickMyButtonHint() {
  Column {
    Text(text = "Don't worry that your button doesn't do anything yet!")
    Spacer(modifier = Modifier.width(8.dp))
    Text(text = "We'll come back to that at a later step. Where we left the text 'TODO' is where a button click would be handled but we need to learn some more things first before we can hook that up.")
    Spacer(modifier = Modifier.width(8.dp))
    Text(text = "As long as you see the button show up in your test area, you're good to move on :)")
  }
}