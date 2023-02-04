package com.example.platoandroid.tutorial.ui.displaysteps.ten_activites

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

class LifecycleSupStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "App Lifecycle") {
      Text(text = "App Lifecycle is the set of states your Android app can be in. These are:\n")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "1. Starting: This is when you first open the app and it starts running.")
      Text(text = "2. Running: This is when you are actually using the app and it's doing what it's supposed to do.")
      Text(text = "3. Pausing: This is when you go to a different app or do something else on your phone, but the app is still open in the background.")
      Text(text = "4. Stopping: This is when you completely close the app and it's not running anymore.")
      Text(text = "5. Restarting: This is when you go back to the app after you've stopped or closed it.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class LifecycleSupStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Activity Lifecycle") {
      Text(text = "Within your android app, there are subsections we call `Activities`.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Unlike other programs, mobile applications may start from many entry points.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "For example, have you ever clicked a link on your phone and it opens in the app at a certain place? That is possible because of Activities.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class LifecycleSupStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Activity Lifecycle") {
      Text(text = "Activities have a lifecycle too. They move through different states that are:\n")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "1. onCreate(): This is when the activity is first created and all the initial setup is done.")
      Text(text = "2. onStart(): This is when the activity becomes visible to the user.")
      Text(text = "3. onResume(): This is when the activity is in the foreground and the user can interact with it.")
      Text(text = "4. onPause(): This is when the user navigates away from the activity, but the activity is still running in the background.")
      Text(text = "5. onStop(): This is when the activity is no longer visible to the user and it's not running in the foreground.")
      Text(text = "6. onDestroy(): This is when the activity is closed and it's not running anymore.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You can learn more about Activities from android's documentation:")
      Text(text = "https://developer.android.com/guide/components/activities/intro-activities")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "What do each of these layers do?")
        }
      }
    }
  }
}
