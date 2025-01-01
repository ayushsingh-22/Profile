package com.example.profileSection.repository

import com.example.profileSection.auth.ProfileState

interface ProfileRepository {
    suspend fun getProfile(): ProfileState
    suspend fun updateProfile(profile: ProfileState)
}
