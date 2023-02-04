package com.example.platoandroid.tutorial.model

import androidx.lifecycle.MutableLiveData
import com.example.platoandroid.tutorial.ui.displaysteps.DefaultTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.IntroTutorialStepBlock
import com.example.platoandroid.tutorial.ui.displaysteps.composebasics.LearningComposeBasicsTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.WelcomeTutorialStepBlock
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.ComposeStylesTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.eight_gradle.GradleTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.nine_filestructure.FileStructureTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.ViewModelsTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.StateTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.ten_activites.ActivitiesTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.ArchitechtureTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.TextFieldsTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.three_buttons.ButtonsTutorialStepUiState
import com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.DataTypesTutorialStepUiState

sealed class TutorialStep {
  open val id: String = DEFAULT_STEP_ID
  val subSteps: List<TutorialSubStep> get() = getUiState().getSubSteps()
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
    override val previousStep: TutorialStep = Intro(this)
    override fun getUiState(): TutorialStepUiState = LearningComposeBasicsTutorialStepUiState()
  }

  data class LearningComposeStyles(
    override val nextStep: TutorialStep = LearningDataTypes(),
    override val id: String = COMPOSE_STYLES_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningComposeBasics(this)
    override fun getUiState(): TutorialStepUiState = ComposeStylesTutorialStepUiState()
  }

  data class LearningDataTypes(
    override val nextStep: TutorialStep = LearningButtonHandlers(),
    override val id: String = DATA_TYPES_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningComposeBasics(this)
    override fun getUiState(): TutorialStepUiState = DataTypesTutorialStepUiState()
  }

  data class LearningButtonHandlers(
    override val nextStep: TutorialStep = LearningTextFields(),
    override val id: String = BUTTONS_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningDataTypes(this)
    override fun getUiState(): TutorialStepUiState = ButtonsTutorialStepUiState()
  }

  data class LearningTextFields(
    override val nextStep: TutorialStep = LearningState(),
    override val id: String = TEXT_FIELDS_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningButtonHandlers(this)
    override fun getUiState(): TutorialStepUiState = TextFieldsTutorialStepUiState()
  }

  data class LearningState(
    override val nextStep: TutorialStep = LearningViewModels(),
    override val id: String = STATE_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningTextFields(this)
    override fun getUiState(): TutorialStepUiState = StateTutorialStepUiState()
  }

  data class LearningViewModels(
    override val nextStep: TutorialStep = LearningArchitecture(),
    override val id: String = VIEW_MODELS_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningState(this)
    override fun getUiState(): TutorialStepUiState = ViewModelsTutorialStepUiState()
  }

  data class LearningArchitecture(
    override val nextStep: TutorialStep = LearningGradle(),
    override val id: String = ARCHITECTURE_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningTextFields(this)
    override fun getUiState(): TutorialStepUiState = ArchitechtureTutorialStepUiState()
  }

  data class LearningGradle(
    override val nextStep: TutorialStep = LearningFileStructure(),
    override val id: String = GRADLE_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningArchitecture(this)
    override fun getUiState(): TutorialStepUiState = GradleTutorialStepUiState()
  }

  data class LearningFileStructure(
    override val nextStep: TutorialStep = LearningActivities(),
    override val id: String = FILE_STRUCTURE_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningGradle(this)
    override fun getUiState(): TutorialStepUiState = FileStructureTutorialStepUiState()
  }

  data class LearningActivities(
    override val id: String = ACTIVITIES_STEP_ID,
  ) : TutorialStep() {
    override val previousStep: TutorialStep = LearningFileStructure(this)
    override fun getUiState(): TutorialStepUiState = ActivitiesTutorialStepUiState()
  }

  companion object {
    const val DEFAULT_STEP_ID = "DEFAULT_STEP_ID"
    const val WELCOME_STEP_ID = "WELCOME_STEP_ID"
    const val INTRO_STEP_ID = "INTRO_STEP_ID"
    const val COMPOSE_BASICS_STEP_ID = "COMPOSE_BASICS_STEP_ID"
    const val COMPOSE_STYLES_STEP_ID = "COMPOSE_STYLES_STEP_ID"
    const val DATA_TYPES_STEP_ID = "DATA_TYPES_STEP_ID"
    const val BUTTONS_STEP_ID = "BUTTONS_STEP_ID"
    const val STATE_STEP_ID = "STATE_STEP_ID"
    const val VIEW_MODELS_STEP_ID = "VIEW_MODELS_STEP_ID"
    const val TEXT_FIELDS_STEP_ID = "TEXT_FIELDS_STEP_ID"
    const val ARCHITECTURE_STEP_ID = "ARCHITECTURE_STEP_ID"
    const val GRADLE_STEP_ID = "GRADLE_STEP_ID"
    const val FILE_STRUCTURE_STEP_ID = "FILE_STRUCTURE_STEP_ID"
    const val ACTIVITIES_STEP_ID = "ACTIVITIES_STEP_ID"

    fun getFromId(
      id: String,
      subStepId: Int? = null
    ): TutorialStep {
      return when (id) {
        WELCOME_STEP_ID -> Welcome().withSubStep(subStepId)
        INTRO_STEP_ID -> Intro().withSubStep(subStepId)
        COMPOSE_BASICS_STEP_ID -> LearningComposeBasics().withSubStep(subStepId)
        COMPOSE_STYLES_STEP_ID -> LearningComposeStyles().withSubStep(subStepId)
        DATA_TYPES_STEP_ID -> LearningDataTypes().withSubStep(subStepId)
        BUTTONS_STEP_ID -> LearningButtonHandlers().withSubStep(subStepId)
        STATE_STEP_ID -> LearningState().withSubStep(subStepId)
        VIEW_MODELS_STEP_ID -> LearningViewModels().withSubStep(subStepId)
        TEXT_FIELDS_STEP_ID -> LearningTextFields().withSubStep(subStepId)
        ARCHITECTURE_STEP_ID -> LearningArchitecture().withSubStep(subStepId)
        GRADLE_STEP_ID -> LearningGradle().withSubStep(subStepId)
        FILE_STRUCTURE_STEP_ID -> LearningFileStructure().withSubStep(subStepId)
        ACTIVITIES_STEP_ID -> LearningActivities().withSubStep(subStepId)
        else -> Welcome()
      }
    }
  }
}