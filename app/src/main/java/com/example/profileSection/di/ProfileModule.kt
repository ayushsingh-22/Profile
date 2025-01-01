package com.example.profileSection.di

import com.example.profileSection.repository.ProfileRepository
import com.example.profileSection.repository.ProfileRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ProfileModule {

    @Provides
    @Singleton
    fun provideProfileRepository(): ProfileRepository {
        return ProfileRepositoryImpl() // Provide the implementation of ProfileRepository
    }
}
