package com.example.platoandroid.ui

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.MainDialog
import com.example.platoandroid.tutorial.ui.TutorialNavBar
import com.example.platoandroid.tutorial.viewmodel.TutorialRunnerViewModel

@Composable
fun TutorialBlock() {
  val tutorialViewModel: TutorialRunnerViewModel = viewModel {
    val application = checkNotNull(get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY))
    val savedStateHandle = createSavedStateHandle()
    TutorialRunnerViewModel(
      application.getSharedPreferences("TUTORIAL_SAVED_STEPS", Context.MODE_PRIVATE),
      savedStateHandle
    )
  }
  val tutorialStep by tutorialViewModel.currentTutorialStep.observeAsState()
  val tutorialSubStep by tutorialViewModel.currentTutorialStep.value!!.currentSubStep.observeAsState()
  val dialogState: MutableState<(@Composable () -> Unit)?> = remember {
    mutableStateOf(null)
  }

  // Code to Show and Dismiss Dialog
  if (dialogState.value != null) {
    Dialog(
      onDismissRequest = { dialogState.value = null },
      content = {
        MainDialog(title = "Help", content = dialogState.value ?: {}) {
          dialogState.value = null
        }
      },
      properties = DialogProperties(
        dismissOnBackPress = true,
        dismissOnClickOutside = true
      )
    )
  }

  Column {
    TutorialNavBar(onRestart = { tutorialViewModel.resetTutorial() }, onMenuClicked = {}) { tutorialViewModel.goToPreviousStep() }
    Column(
      modifier = Modifier.padding(all = 16.dp)
    ) {
      when (tutorialSubStep) {
        is TutorialSubStepBlockState -> (tutorialSubStep as TutorialSubStepBlockState).displayBlock(onHelpRequest = {request -> dialogState.value = request}) { tutorialViewModel.goToNextStep() }
        else -> tutorialStep?.getUiState()?.displayBlock(onHelpRequest = {request -> dialogState.value = request}) { tutorialViewModel.goToNextStep() }
      }
    }
    Spacer(modifier = Modifier.height(4.dp))
  }
}