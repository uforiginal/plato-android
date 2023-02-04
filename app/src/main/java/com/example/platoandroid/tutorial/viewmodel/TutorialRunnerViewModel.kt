package com.example.platoandroid.tutorial.viewmodel

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.platoandroid.tutorial.model.TutorialStep
import com.example.platoandroid.tutorial.model.TutorialStep.Companion.WELCOME_STEP_ID
import com.example.platoandroid.tutorial.model.TutorialStep.Companion.getFromId
import com.example.platoandroid.tutorial.model.TutorialStep.Welcome

class TutorialRunnerViewModel(
  private val sharedPreferences: SharedPreferences,
  private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
  private var _currentTutorialStep: MutableLiveData<TutorialStep> =
    sharedPreferences.getString(LAST_TUTORIAL_STEP_SHARED_PREFS_KEY, WELCOME_STEP_ID)?.let {
      // Split the string to check for sub step index
      val primaryAndSupStepIds = it.split(":")
      if (primaryAndSupStepIds.size > 1) {
        MutableLiveData(getFromId(primaryAndSupStepIds[0], primaryAndSupStepIds[1].toIntOrNull()))
      } else {
        MutableLiveData(getFromId(it))
      }
    } ?: MutableLiveData(Welcome())

  val currentTutorialStep: MutableLiveData<TutorialStep>
    get() = _currentTutorialStep

  fun goToNextStep() {
    if (_currentTutorialStep.value?.advance() != true) {
      _currentTutorialStep.value = _currentTutorialStep.value?.nextStep
      setCurrentTutorialStepId(_currentTutorialStep.value?.id, null)
    } else setCurrentTutorialStepId(
      _currentTutorialStep.value?.id, _currentTutorialStep.value?.getCurrentSubStepIndex()
    )
  }

  fun goToPreviousStep() {
    if (_currentTutorialStep.value?.goBack() != true) {
      _currentTutorialStep.value?.previousStep?.let {
        _currentTutorialStep.value = it
        setCurrentTutorialStepId(_currentTutorialStep.value?.id, null)
      }
    } else setCurrentTutorialStepId(
      _currentTutorialStep.value?.id, _currentTutorialStep.value?.getCurrentSubStepIndex()
    )
  }

  fun resetTutorial() {
    _currentTutorialStep.value = Welcome()
    setCurrentTutorialStepId(_currentTutorialStep.value?.id, null)
  }

  fun goToStepWithKey(key: String) {
    _currentTutorialStep.value = getFromId(key)
    setCurrentTutorialStepId(key, null)
  }

  private fun setCurrentTutorialStepId(id: String?, subStepId: String?) {
    id?.let {
      saveLastStep(it, subStepId)
    }
  }

  private fun saveLastStep(tutorialStepId: String, subStepId: String?) {
    val saveStepIdData = subStepId?.let { "$tutorialStepId:$it" } ?: tutorialStepId
    sharedPreferences.edit().putString(LAST_TUTORIAL_STEP_SHARED_PREFS_KEY, saveStepIdData).apply()
  }

  companion object {
    const val LAST_TUTORIAL_STEP_SHARED_PREFS_KEY = "LAST_TUTORIAL_STEP_SHARED_PREFS_KEY"
  }
}