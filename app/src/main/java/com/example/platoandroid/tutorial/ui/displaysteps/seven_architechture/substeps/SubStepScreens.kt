package com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard

class ArchitectureSupStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "In software development, Architecture is a fancy word we use to talk about the patterns we use to structure the code in our app.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "An android app is like a big puzzle with many different pieces. The architecture pattern is a way to organize all of those pieces so that it's easy to understand and work on the app.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class ArchitectureSupStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "The architecture pattern for our app, designs where the code for our UI is going to live, where the code for managing different kinds of data will live and how that code should interact with each other to make sure we end up with an app stable & looks nice.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "By using a pattern, it makes it easier for developers to understand how the different parts of the app work together, and it makes it easier to add or change features of the app without breaking anything else.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "That makes sense")
        }
      }
    }
  }
}

class ArchitectureSupStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "There are many different Architecture patterns that can be used depending on the needs of your app but for most apps, android recommends a Layered Architecture pattern.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You can reference Android Architecture Documentation as we go through the next few steps:")
      Text(text = "https://developer.android.com/topic/architecture")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "What is Layered Architecture?")
        }
      }
    }
  }
}

class ArchitectureSupStepFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "We call it “Layered” because it separates our code into 2 or 3 layers with different purposes. \n" +
        "The three layers are:\n")
      Spacer(modifier = Modifier.height(8.dp))
      // TODO: Image here
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "What do each of these layers do?")
        }
      }
    }
  }
}

class ArchitectureSupStepFive : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "It's like building a cake with different layers, each layer has a specific purpose and responsibility. The purpose of the main layers in the android app architecture are:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "1. UI layer: This is the top layer, it's responsible for what the user sees on the screen. It's like the icing on the cake.")
      Text(text = "2. Domain layer: This layer is responsible for handling the main tasks of the app. It's like the cake batter that holds the cake together.")
      Text(text = "3. Data access layer: This layer is responsible for getting and storing data. It's like the ingredients of the cake.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Tell me more.")
        }
      }
    }
  }
}

class ArchitectureSupStepSix : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "The UI layer, also known as the presentation layer, is the top layer of the android layered architecture pattern. It's like the icing on the cake, it's responsible for what the user sees and interacts with on the screen.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "It's responsible for:\n")
      Text(text = "* Displaying data to the user.")
      Text(text = "* Handling user input and events.")
      Text(text = "* Communicating with the domain layer to perform the app's main tasks.")
      Text(text = "* Updating the UI to reflect the state of the app.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The UI layer is usually implemented using Android's UI widgets and classes like Activities, Fragments, and Views. It communicates with the domain layer through a set of interfaces, which allows the developer to change the UI without affecting the business logic of the app.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "It's important to have a well-designed UI layer to ensure that the app is easy to use, and visually appealing to the user. It also should be designed to be responsive and accessible for all users.")
      Spacer(modifier = Modifier.height(8.dp))
      // TODO: Image here
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Take a look at Android documentation about the UI Layer to learn more: https://developer.android.com/topic/architecture/ui-layer")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Let's look at the data layer")
        }
      }
    }
  }
}

class ArchitectureSupStepSeven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "The data layer in the android layered architecture is responsible for handling all the data that the app uses. It's like the foundation of the cake, it holds all the ingredients together.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "It's responsible for:\n")
      Text(text = "* Storing and retrieving data from different sources like databases, cloud services, shared preferences, etc.")
      Text(text = "* Caching data for faster access.")
      Text(text = "* Managing data consistency, data integrity, and security.")
      Text(text = "* Providing data to the business logic layer, which can use it to perform the app's main tasks.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The data layer is usually implemented using different libraries and technologies like SQLite, Room, Firebase, Retrofit, etc. The data layer communicates with the other layers of the app through a set of interfaces, which allows the developer to change the data source or technology without affecting the rest of the app.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "It's important to have a well-designed data layer to ensure that the app runs smoothly and efficiently, and to protect the data from any potential issues like data loss or security breaches.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Take a look at Androids documentation to learn more about the Data Layer:\n" +
        "https://developer.android.com/topic/architecture/data-layer\n")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Let's look at the domain layer")
        }
      }
    }
  }
}

class ArchitectureSupStepEight : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "In the android layered architecture pattern, the domain layer is responsible for representing the business logic of the app, it's like the cake batter that holds the cake together. It's the layer between the presentation and data layers.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "It's responsible for:\n")
      Text(text = "* Defining the app's main use cases.")
      Text(text = "* Handling the app's business rules and logic.")
      Text(text = "* Interacting with the data layer to retrieve and store data.")
      Text(text = "* Providing a clear and stable API for the presentation layer to use.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The domain layer is usually implemented using classes and interfaces, it's independent of the presentation and data layers, meaning that it doesn't depend on any specific UI or data source. This allows the developer to change the presentation or data layers without affecting the business logic of the app.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "It's important to have a well-designed domain layer to ensure that the app is easy to understand, maintain and extend, and to separate the business logic of the app from the data and presentation layers.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Take a look at Androids documentation to learn more about the Domain Layer:\n" +
        "https://developer.android.com/topic/architecture/domain-layer\n")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "I have a basic grasp on architecture")
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
