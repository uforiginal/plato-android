package com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help

import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import com.example.platoandroid.R

@Composable
fun DebuggingMyFirstComposableHint() {
  Column {
    Text(text = "The first thing to check: make sure your app built!")
    Text(text = "If there were any errors in your code the app may have failed to build.")
    Text(text = "At the bottom of Android Studio, look for the Build tab and click on it.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If there is any red text here, that is an error message and there is a good chance that is why you don't see your text.")
    Text(text = "Try to read the red text and see if you can find what it says the error is or ask for help if you're not sure.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If you don't see any red text and in the Build tab it says BUILD SUCCESSFUL - then congrats your app built fine! But we have a different problem to debug...")
    Text(text = "It's possible you put it in the wrong place, make sure its in the file named MainActivity.kt and looks like this:")
    SampleImage()
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If you still can't find the issue, go ahead and ask for help. Debugging is a skill you'll learn but it takes some practice so don't hesitate to ask for help while you learn.")
  }
}

@Composable
private fun SampleImage() {
  ResourcesCompat.getDrawable(
    LocalContext.current.resources,
    R.mipmap.first_text_sample_foreground,
    LocalContext.current.theme
  )?.let { drawable ->
    val bitmap = Bitmap.createBitmap(
      drawable.intrinsicWidth,
      drawable.intrinsicHeight,
      Bitmap.Config.ARGB_8888
    )
    val canvas = Canvas(bitmap)
    drawable.setBounds(0, 0, canvas.width, canvas.height)
    drawable.draw(canvas)
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.Start
    ) {
      Image(
        bitmap = bitmap.asImageBitmap(),
        "An image",
        modifier = Modifier.requiredSize(400.dp)
      )
    }
  }
}