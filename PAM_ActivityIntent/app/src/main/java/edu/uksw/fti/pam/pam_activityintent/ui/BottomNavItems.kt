package edu.uksw.fti.pam.pam_activityintent.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItems (
    val title : String,
    val icon : ImageVector,
    val screen_route : String
        ){
        object Home: BottomNavItems("Home", Icons.Default.Home, "home")
        object Article: BottomNavItems("Mutation", Icons.Default.Menu, "article")
        object Qris: BottomNavItems(" ",Icons.Default.Search,  "qris")
        object Pesan: BottomNavItems("Activity", Icons.Default.Email, "pesan")
        object Profile: BottomNavItems("Profile", Icons.Default.Person, "profile")
}