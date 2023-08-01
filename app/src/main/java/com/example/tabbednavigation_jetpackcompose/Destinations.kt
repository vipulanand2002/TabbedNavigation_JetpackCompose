package com.example.tabbednavigation_jetpackcompose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations {
    val route: String
    val icon: ImageVector
    val title: String
}
object Home:Destinations{
    override val route: String= "Home"
    override val icon: ImageVector=Icons.Filled.Home
    override val title: String="Home"
}

object Settings:Destinations{
    override val route: String= "Settings"
    override val icon: ImageVector=Icons.Filled.Settings
    override val title: String="Settings"
}