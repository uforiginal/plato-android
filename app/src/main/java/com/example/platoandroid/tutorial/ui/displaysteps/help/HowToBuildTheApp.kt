package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HowToBuildTheApp() {
  Column {
    Text(text = "Building an Android app to an emulator in Android Studio is a simple process that can be done in a few steps:")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "1. Open Android Studio and open your project.", Modifier.padding(start = 16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "2. In the toolbar at the top of the screen, select the emulator you want to use from the drop-down list of available devices. If you don't have any emulators set up, you can create one by going to \"Tools\" > \"AVD Manager\"", Modifier.padding(start = 16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "3. Click on the \"Run\" button, or use the shortcut \"Shift + F10\" to start the build process. This will compile your code and package it into an APK file.", Modifier.padding(start = 16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "4. The emulator will start up and your app will be installed on it.", Modifier.padding(start = 16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "5. After the installation, the app will launch automatically on the emulator.", Modifier.padding(start = 16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "You can also use the \"Debug\" option instead of \"Run\" if you want to test the app with the ability to debug it, this way you can set breakpoints, inspect variables, and use other debugging tools provided by Android Studio.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Note that the first time you build an app and run it on an emulator, it may take some time to start up, but subsequent runs should be faster.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "It's important to note that to build and run an app on an emulator or a device you need to have the proper SDK and build tools installed, also you may need to configure your emulator to match the target version and device characteristics of your app.")
    Spacer(modifier = Modifier.height(16.dp))
  }
}