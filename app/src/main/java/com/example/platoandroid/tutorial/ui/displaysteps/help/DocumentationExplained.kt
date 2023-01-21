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
fun DocumentationExplained() {
  Column {
    Text(text = "Documentation in programming refers to any kind of information that helps people understand and use a particular software or program. It includes things like written explanations, diagrams, code examples, and tutorials.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "There are different types of documentation, such as:")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "• Technical documentation: This type of documentation provides detailed information about how the software works, how to install and set it up, how to use it, and how to troubleshoot any problems that may arise.", Modifier.padding(start = 16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "• User documentation: This type of documentation is intended for the end-users of the software and provides information on how to use the software, including tutorials and FAQs.", Modifier.padding(start = 16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "• Developer documentation: This type of documentation is intended for developers who will be working on the software. It includes information on how to build and modify the software, how to use its APIs, and how to contribute to the software's development.", Modifier.padding(start = 16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "• Code documentation: This type of documentation is included directly in the code and describes the purpose and usage of the code, and also helps other developers to understand the code when they read it.", Modifier.padding(start = 16.dp))
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Having good documentation is important for any software development project, it can help developers to understand the codebase, improve the development process and also help users to understand and use the software.")
    Spacer(modifier = Modifier.height(16.dp))
  }
}