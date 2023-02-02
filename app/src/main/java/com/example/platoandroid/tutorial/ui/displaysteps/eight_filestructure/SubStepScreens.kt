package com.example.platoandroid.tutorial.ui.displaysteps.eight_filestructure

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard

class FileStructureSupStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "File Structure") {
      Text(text = "On the left hand side of Android Studio, you should see a pane that shows all of the files and folders that make up your app. You can open and close this pane by clicking the tab that says “Project” on the far left.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You’ll notice the primary top level directory is called “app” - everything we build within our project will live somewhere within this directory.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The other folder you’ll notice at the top level with app contains gradle scripts. You don’t need to worry too much about those right now but if you want to learn more, you can check out gradles documentation: https://docs.gradle.org/current/userguide/userguide.html")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class FileStructureSupStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "File Structure") {
      Text(text = "If you havnt already, expand the “app” directory by clicking the arrow next to it. You should see a lot more directories that live underneath it. ")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "There are two we care about: “java” and “res”")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class FileStructureSupStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "File Structure") {
      Text(text = "The “res” directory you wont use as often but it holds any resources your app needs to utilize including text you want to be able to translate, icons, graphics. ")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We won’t use this much for the sake of the sample app but you should know that thats the place to look for those sorts of things!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class FileStructureSupStepFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "File Structure") {
      Text(text = "The “java” directory is the main one we care about. That is where our main project files will live.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Click the arrow next to “java” to expand that directory section.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class FileStructureSupStepFive : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "File Structure") {
      Text(text = "Under the java directory you will likely see 3 other directories - 2 highlighted in green and one not.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The ones highlighted in green are for testing. Testing is really important when you are building a production app but we won’t focus on testing in this sample app.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Use the arrow beside the directory that is NOT highlighted to expand that section.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class FileStructureSupStepSix : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "File Structure") {
      Text(text = "This is the heart of your app, this is where most all of the files relating to your project will live.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Most notably, in this directory you will see the MainActivity.kt file, this main entrypoint into our app and where the code you write will pick up from.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}
