package com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps

import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import com.example.platoandroid.R
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.help.ProjectFileStructurePaneHint
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToSearchAFileName
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatIsABestPractice

class ViewModelSupStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "We use these special classes to keep things like the state data isolated from the view.\n" +
        "Right now, all of the data for our todo list item is handled in the view itself.\n")
      Text(text = "That is fine for now because it’s pretty simple but as we add more complexity to the logic controlling our todo list, it’s going to get very hard to look at the code and understand what is going on.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "So when we add a viewmodel, we will be able to pull out all of the logic controlling the todo list data and keep it separate from the code that actually builds the UI itself.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ViewModelSupStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Here is a diagram to help you visualize how the ViewModel and view work together.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Notice it talks about a “Data Layer” & “UI Layer” - we will talk more about what those mean later on in the Architecture section.")
      // DataLayerDiagramImage()
      Text(text = "Look at the documentation to learn alittle more:")
      Text(
        text = "https://developer.android.com/topic/architecture/ui-layer/stateholders",
        color = MaterialTheme.colors.primaryVariant,
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }

  @Composable
  private fun DataLayerDiagramImage() {
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
}

class ViewModelSupStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "You may hear this referred to as “separation of concerns” as you code more. It’s always considered a best practice in programming that each element in your code should have one clearly defined purpose.")
      HelpButton("what is a best practice") {
        onHelpRequest { WhatIsABestPractice() }
      }
      Text(text = "In this case, the clearly defined purpose of our view will be to handle displaying the UI and the clearly defined purpose of our viewmodel will be to manage all of the data our view needs to build its UI.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Sounds good")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Tell me more")
        }
      }
    }
  }
}

class ViewModelSupStepFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "So let’s look at how we create a viewmodel - we will practice by adding a viewmodel for our Todo list.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Go back to the TodoList.kt file we have been working in.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Im there")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { HowToSearchAFileName() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "How to search")
        }
      }
    }
  }
}

class ViewModelSupStepFive : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "If you look in the pane on the left, you should see a listing of the files in this project.")
      HelpButton("I don't see this pane") {
        onHelpRequest { ProjectFileStructurePaneHint() }
      }
      Text(text = "Look for the TodoList.kt file in this list, you will notice it is under a folder called `ui`")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "I see that")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I don't see it")
        }
      }
    }
  }
}

class ViewModelSupStepSix : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Right mouse click on the `ui` folder. \nIn the menu, navigate to New -> Kotlin Class/File")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "A dialog will come up asking you for a new file name, type:")
      Text(text = "       TodoListViewModel", fontWeight = FontWeight.Bold)
      Text(text = "and click enter.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "I created the file")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Help")
        }
      }
    }
  }
}
