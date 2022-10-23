package com.example.platoandroid.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// These are the colors that will apply when in dark mode
private val DarkColorPalette = darkColors(
  primary = Purple200,
  primaryVariant = Purple700,
  secondary = Teal200,
  background = Color.DarkGray,
  onPrimary = Color.White,
)

// These are the colors that will apply when in light mode
private val LightColorPalette = lightColors(
  primary = MutedTone, // <<<<<<< Hint, hint, here's the one you want to change! Replace 'MutedTone'
  primaryVariant = FunOrange,
  secondary = PrimaryBlue,
  secondaryVariant = VariantBlue,
  background = Color.White,
  surface = Color.White,
  onPrimary = MutedToneAccent,
  onSecondary = Color.Black,
  onBackground = Color.Black,
  onSurface = Color.Black,
)

@Composable
fun PlatoAndroidTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit
) {
  val colors = if (darkTheme) {
    DarkColorPalette
  } else {
    LightColorPalette
  }

  MaterialTheme(
    colors = colors,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}