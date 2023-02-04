package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HowToSearchAFileName() {
  Column {
    Text(text = "Double clicking 'Shift' will open a search window with tabs at the top you can select to search by class (the `Classes` tab), file name (the `Files` tab), or everything at once (the `All` tab).")
  }
}