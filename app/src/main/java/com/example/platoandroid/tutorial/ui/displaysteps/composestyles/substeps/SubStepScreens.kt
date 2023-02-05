package com.example.platoandroid.tutorial.ui.displaysteps.composestyles.substeps

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help.ColorNotUpdatingHint
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help.FindingWhatPropertiesACompoableHas
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help.StepFourHint
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help.StepSixHint
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help.StepTwelveHint
import com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help.WhatAreColorHexCodes
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatDoesDpMean
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatIsAComposable
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatIsAConstructor
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatIsAnExtensionFunction

class StylesOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(
        text = "In Compose, most composables have something we call “Modifiers”"
      )
      HelpButton("remind me what composables are") {
        onHelpRequest { WhatIsAComposable() }
      }
      Text(text = "Modifiers are a data type that lets us modify the look of a composable.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Keep the documentation on Modifiers handy as we go through the next few steps:")
      Text(
        text = "https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier",
        color = MaterialTheme.colors.primaryVariant,
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Cool, how do we use them?")
        }
      }
    }
  }
}

class StylesTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      // Text(
      //   text = "To create a new modifier, you need to pick at least one element you want to modify and then on the class name Modifier, call the appropriate extension function."
      // )
      // HelpButton("what is an extension function?") {
      //   onHelpRequest { WhatIsAnExtensionFunction() }
      // }
      // Text(
      //   text = "There are some fancy reasons why we can call a function directly on this class name without invoking an instance of the Modifier class, but we aren’t going to get into that now.There are some fancy reasons why we can call a function directly on this class name without invoking an instance of the Modifier class, but we aren’t going to get into that now."
      // )
      // Text(
      //   text = "You can visit Androids documentation if you want to understand more about that."
      // )
      Text(text = "To create a modifier, you will write something that looks like:")
      Text(
        text = "       Modifier.width(16.dp)",
        fontWeight = Companion.Bold,
        color = MaterialTheme.colors.primaryVariant,
      )
      Text(text = "In this case, this modifier modifies the width of the composable to be 16 dp")
      HelpButton("what does dp mean?") {
        onHelpRequest { WhatDoesDpMean() }
      }
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How can we modify multiple values?")
        }
      }
    }
  }
}

class StylesThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      // Text(
      //   text = "In the previous example, we called the “width” extension function. You’ll remember that function return something - in this case, the modifier extension functions return the modifier itself."
      // )
      // Spacer(modifier = Modifier.height(8.dp))
      // Text(
      //   text = "Because of this, we can call another extension function on the end of another function because if will be calling the function on the object that was returned by the previous one."
      // )
      // Spacer(modifier = Modifier.height(8.dp))
      // Text(
      //   text = "If that confuses you - don’t worry too much about it. The important take away is you can write something like this:"
      // )
      Text(text = "If want to modify multiple things about a composable, we can `chain` the modifier values like this:")
      Text(
        text = "Modifier.width(16.dp).height(12.dp).background(Color.Gray)",
        color = MaterialTheme.colors.primaryVariant,
        fontWeight = Companion.Bold,
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This will modify the width AND height AND background color.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Cool")
        }
      }
    }
  }
}

class StylesFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(
        text = "Let’s practice using modifiers. Let’s add a standard height to our todo list rows."
      )
      Text(
        text = "Add a constructor to your Row composable (that you added inside of TodoListRow) and inside the constructor set the modifier value like this:"
      )
      Text(
        text = "Row(modifier = Modifier.height(64.dp))",
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colors.primaryVariant,
      )
      Text(
        text = "You can change the height value to whatever you prefer - rebuild the app to see how it changes when you change the value."
      )
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "What next?")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepFourHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I don’t see any change")
        }
      }
    }
  }
}

class StylesFourHalf : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Your todo list is coming together!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You'll notice our rows are touching the left edge of the screen - that doesn't look very good so let's use a modifier to add some padding.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "In the constructor for the Column around our entire todo list in the TodoList composable, add a modifier that looks like this:"
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Column(\n" +
        "    modifier = Modifier.padding(12.dp)\n" +
        "  )")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class StylesFive : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(
        text = "Our Row height is better now but the rows still look a bit off. To fix this we are going to look at some other style changes we can make outside of modifiers."
      )
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Ok")
        }
      }
    }
  }
}

class StylesSix : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(
        text = "In addition to modifiers, composables also have special style options that are specific to each composable depending on its intended purpose."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "One of these additional style options for Rows and Columns is alignment.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "We used Row composables to build our todo list item rows and you can see that all the items in the row are pulled up to the top of the row rather than centered."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "We would say in this case that the vertical alignment of the Row is top justified."
      )
      Text(text = "It would probably look better if we made it center justified.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Lets do it")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepSixHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Tell me more about alignment")
        }
      }
    }
  }
}

class StylesSeven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(
        text = "In the constructor of Row, set the value of verticalAlignment to Alignment.CenterVertically"
      )
      Text(text = "This looks like:")
      Text(text = "     Row(", fontWeight = FontWeight.Bold, color = MaterialTheme.colors.primaryVariant)
      Text(text = "         modifier = Modifier.height(64.dp),", fontWeight = FontWeight.Bold, color = MaterialTheme.colors.primaryVariant)
      Text(text = "         verticalAlignment = Alignment.CenterVertically,", fontWeight = FontWeight.Bold, color = MaterialTheme.colors.primaryVariant)
      Text(text = "     )", fontWeight = FontWeight.Bold, color = MaterialTheme.colors.primaryVariant)
      Text(text = "Rebuild the app and see how it changes.")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Nothing changed")
        }
      }
    }
  }
}

class StylesEight : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Color is another important aspect of style, let's look at how we use colors.")
      Text(text = "Find the file named Color.kt")
      Text(
        text = "This is the file where you can define colors you want to reuse in your app using hex codes."
      )
      HelpButton("what are hex code colors") {
        onHelpRequest { WhatAreColorHexCodes() }
      }
      Text(text = "Try adding a new color to that file with your own hex code something like:")
      Text(text = "     val MyColor = Color(0xFFXXXXXX)", fontWeight = FontWeight.Bold)
      Text(
        text = "Replace the X's with your chosen hex code and name the value whatever you want."
      )
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class StylesEightHalf : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Now we want to apply the color we just created somewhere.")
      Text(text = "You can either apply the color directly to a composable - or we can set the color to many components at once by using something called `Themes`")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Themes let us set us set individual composables to use a category of color rather than a specific color. This allows us to change the color value of a theme category and all of the components using that theme will change at once.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To test this, open the file named Theme.kt")
      Text(text = "Look for the LightColorPalette and set the `primary` param to your MyColor value you just created.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Rebuild the app and see what things change color!")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class StylesNine : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Did you see the colors change?")
      HelpButton("didn’t see any colors change?") {
        onHelpRequest { ColorNotUpdatingHint() }
      }
      Text(
        text = "If you look through the code to find the composable that creates the title bar, you’ll see that it uses “primary” as its color - that’s why it changed when you updated what color primary was set to."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "This is why Themes can make our lives much easier - if you have main colors you want your app to use and you have 20 things in your app that are set to that color using its hex value directly, if you decide you want to change that color you will have to update every hex value in all 20 places. "
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "If you use a theme, and make all 20 of those things use whatever color primary is set to, then if you want to change that color, you only need to update it once."
      )
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class StylesTen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Let’s practice using colors.")
      Text(text = "Going back to your Todo list items, we want to make the checkmark icon green.")
      Text(text = "Icons have a property called “tint” that takes a color value.")
      HelpButton("how do I find what properties a composable has?") {
        onHelpRequest { FindingWhatPropertiesACompoableHas() }
      }
      Text(
        text = "In the constructor of Icon, after the parameters that are already provided, assign the property “tint” to MaterialTheme.colors.primary"
      )
      HelpButton("remind me what a constructor is") {
        onHelpRequest { WhatIsAConstructor() }
      }
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Done")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { /** TODO */ } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I’m stuck")
        }
      }
    }
  }
}

class StylesEleven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Rebuild the app. Is your Icon the primary color now?")
      HelpButton("my icon color didn't change") {
        onHelpRequest { ColorNotUpdatingHint() }
      }
      Text(
        text = "We still want it to be green though so go back to your Color.kt file and add this color to the file:"
      )
      Text(text = "     val CheckMarkGreen = Color(0xFF008000)", fontWeight = FontWeight.Bold)
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class StylesTwelve : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Go back to your TodoListRow.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Set the tint value to CheckMarkGreen")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "The text will probably be red, if you hover over the red word, you will see a menu pop up with the option to import. Click import when this pops up."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Rebuild the app. Is your checkmark green now?")
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Yes")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepTwelveHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "No")
        }
      }
    }
  }
}

class StylesThirteen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Adding Styles") {
      Text(text = "Nice! Your todo list is looking better!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Let's look at some text styles next we can use to make the title text on our todo list look more like a title.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "To do this, find the Title composable in your TodoList.kt file and update the Text composable to look like this:"
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Text(\n" +
        "    text = \"\$title\",\n" +
        "    style = MaterialTheme.typography.h3,\n" +
        "  )")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Rebuild the app and see how the title changes.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}
