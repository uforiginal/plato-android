package com.example.platoandroid.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

/**
 * ViewModel's generally manage state and business logic for a single
 * screen. If you find you have one view model being shared between
 * multiple screens, you should consider moving that logic to your "domain"
 * layer and having it be used by several ViewModels that each belong to
 * a single screen.
 *
 * Notice that this class extends a class called ViewModel.
 * ViewModel is a class provided by Android hat gives us access
 * to lots of tools that help us manage state and data more
 * easily.
 *
 * Note: remember, when we say a class "implements" or "extends"
 * another class, it means the other class is an interface (a
 * pre-defined set of functionality our class must support) or an
 * open class that will let our class have access to additional
 * functionality it provides.
 */
class TodoListViewModel(
  // val savedStateHandle: SavedStateHandle,
) : ViewModel() {
  /**
   * This is the body of our view model where all the logic will live.
   */
}