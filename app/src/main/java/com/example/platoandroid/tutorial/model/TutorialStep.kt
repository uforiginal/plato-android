package com.example.platoandroid.tutorial.model

import androidx.lifecycle.MutableLiveData
import com.example.platoandroid.tutorial.ui.displaysteps.DefaultTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.IntroTutorialStepBlock
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.LearningComposeBasicsTutorialStepBlock
import com.example.platoandroid.tutorial.ui.displaysteps.WelcomeTutorialStepBlock
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.ComposeOverviewSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.CreateYourOwnComposableSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.UsingComposeDocumentationSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.TryAComposablePartTwoSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.TryAComposableSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.ColorsSubStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.ComposeStylesTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.ThemesSubStepUiState

sealed class TutorialStep {
  open val id: String = DEFAULT_STEP_ID
  open val subSteps: List<TutorialSubStep> = emptyList()
  private var currentSubStepIndex: Int = -1
  private var _currentSubStep: MutableLiveData<TutorialSubStep?> = MutableLiveData(null)
  val currentSubStep: MutableLiveData<TutorialSubStep?>
    get() = _currentSubStep
  open val nextStep: TutorialStep? = null
  open val previousStep: TutorialStep? = null
  open fun getUiState(): TutorialStepUiState = DefaultTutorialStepUiState()

  fun advance(): Boolean {
    val nextStepIndex = currentSubStepIndex + 1
    if (subSteps.size > nextStepIndex) {
      currentSubStepIndex = nextStepIndex
      _currentSubStep.value = subSteps[currentSubStepIndex]
      return true
    }
    _currentSubStep.value = null
      return false
  }

  fun goBack(): Boolean {
    val previousStepIndex = currentSubStepIndex - 1
    if (previousStepIndex >= 0 && subSteps.size > previousStepIndex) {
      currentSubStepIndex = previousStepIndex
      _currentSubStep.value = subSteps[currentSubStepIndex]
      return true
    }
    _currentSubStep.value = null
    return false
  }

  fun getCurrentSubStepIndex(): String? {
    return if (currentSubStepIndex >= 0) currentSubStepIndex.toString() else null
  }

  fun withSubStep(stepIndex: Int?): TutorialStep = this.apply {
    stepIndex?.let { setCurrentSubStep(it) }
  }

  private fun setCurrentSubStep(stepIndex: Int) {
    if (subSteps.size > stepIndex) {
      currentSubStepIndex = stepIndex
      _currentSubStep.value = subSteps[currentSubStepIndex]
      return
    }
    _currentSubStep.value = null
  }

  data class Welcome(
    override val nextStep: TutorialStep = Intro(),
    override val id: String = WELCOME_STEP_ID,
  ) : TutorialStep() {
    override fun getUiState(): TutorialStepUiState = WelcomeTutorialStepBlock()
  }

  data class Intro(
    override val nextStep: TutorialStep = LearningComposeBasics(),
    override val id: String = INTRO_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = Welcome(this)
    override fun getUiState(): TutorialStepUiState = IntroTutorialStepBlock()
  }

  data class LearningComposeBasics(
    override val nextStep: TutorialStep = LearningComposeStyles(),
    override val id: String = COMPOSE_BASICS_STEP_ID,
  ) : TutorialStep() {
    override val subSteps: List<TutorialSubStep> = listOf(
      ComposeOverviewSubStepUiState(),
      TryAComposableSubStepUiState(),
      TryAComposablePartTwoSubStepUiState(),
      UsingComposeDocumentationSubStepUiState(),
      CreateYourOwnComposableSubStepUiState(),
    )
    override val previousStep: TutorialStep = Intro(this)
    override fun getUiState(): TutorialStepUiState = LearningComposeBasicsTutorialStepBlock()
  }

  data class LearningComposeStyles(
    override val nextStep: TutorialStep = LearningButtonHandlers(),
    override val id: String = COMPOSE_STYLES_STEP_ID,
  ) : TutorialStep() {
    override val subSteps: List<TutorialSubStep> = listOf(
      ColorsSubStepUiState(),
      ThemesSubStepUiState(),
    )
    override val previousStep: TutorialStep = LearningComposeBasics(this)
    override fun getUiState(): TutorialStepUiState = ComposeStylesTutorialStepUiState()
  }

  data class LearningButtonHandlers(
    override val nextStep: TutorialStep = LearningViewModels(),
    override val id: String = BUTTONS_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningComposeStyles(this)
    override fun getUiState(): TutorialStepUiState = WelcomeTutorialStepBlock()
  }

  data class LearningViewModels(
    override val nextStep: TutorialStep = LearningTextFields(),
    override val id: String = VIEW_MODELS_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningButtonHandlers(this)
    override fun getUiState(): TutorialStepUiState = WelcomeTutorialStepBlock()
  }

  data class LearningTextFields(
    override val nextStep: TutorialStep = LearningActivities(),
    override val id: String = TEXT_FIELDS_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningViewModels(this)
    override fun getUiState(): TutorialStepUiState = WelcomeTutorialStepBlock()
  }

  data class LearningActivities(
    override val nextStep: TutorialStep = LearningArchitecture(),
    override val id: String = ACTIVITIES_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningTextFields(this)
    override fun getUiState(): TutorialStepUiState = WelcomeTutorialStepBlock()
  }

  data class LearningArchitecture(
    override val id: String = ARCHITECTURE_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningActivities(this)
    override fun getUiState(): TutorialStepUiState = WelcomeTutorialStepBlock()
  }

  companion object {
    const val DEFAULT_STEP_ID = "DEFAULT_STEP_ID"
    const val WELCOME_STEP_ID = "WELCOME_STEP_ID"
    const val INTRO_STEP_ID = "INTRO_STEP_ID"
    const val COMPOSE_BASICS_STEP_ID = "COMPOSE_BASICS_STEP_ID"
    const val COMPOSE_STYLES_STEP_ID = "COMPOSE_STYLES_STEP_ID"
    const val BUTTONS_STEP_ID = "BUTTONS_STEP_ID"
    const val VIEW_MODELS_STEP_ID = "VIEW_MODELS_STEP_ID "
    const val TEXT_FIELDS_STEP_ID = "TEXT_FIELDS_STEP_ID"
    const val FILE_STRUCTURE_STEP_ID = "FILE_STRUCTURE_STEP_ID"
    const val ACTIVITIES_STEP_ID = "ACTIVITIES_STEP_ID"
    const val ARCHITECTURE_STEP_ID = "ARCHITECTURE_STEP_ID"

    fun getFromId(
      id: String,
      subStepId: Int? = null
    ): TutorialStep {
      return when (id) {
        WELCOME_STEP_ID -> Welcome().withSubStep(subStepId)
        INTRO_STEP_ID -> Intro().withSubStep(subStepId)
        COMPOSE_BASICS_STEP_ID -> LearningComposeBasics().withSubStep(subStepId)
        COMPOSE_STYLES_STEP_ID -> LearningComposeStyles().withSubStep(subStepId)
        BUTTONS_STEP_ID -> LearningButtonHandlers().withSubStep(subStepId)
        VIEW_MODELS_STEP_ID -> LearningViewModels().withSubStep(subStepId)
        TEXT_FIELDS_STEP_ID -> LearningTextFields().withSubStep(subStepId)
        ACTIVITIES_STEP_ID -> LearningActivities().withSubStep(subStepId)
        ARCHITECTURE_STEP_ID -> LearningArchitecture().withSubStep(subStepId)
        else -> Welcome()
      }
    }
  }
}