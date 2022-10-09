package com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ComposeOverviewAdditionalInfo() {
  Column {
    Text(text = "Some more about compose..")
    Text(text = "Don't worry if you don't totally understand compose yet (that's expected!) - the next step will walk you through some hands on practice using compose. Sometimes just jumping in and doing it is the best way to learn but also rember you can always ask for help if you get too stuck!")
  }
}