package com.example.profileSection.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.profileSection.auth.ProfileScreen
import com.example.profileSection.auth.EditProfileScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "profileScreen") {
        composable("profileScreen") {
            ProfileScreen(navController)
        }
        composable("editProfile") {
            EditProfileScreen(navController)
        }
    }
}
