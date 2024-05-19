// CodelineModule.kt
package me.codeline.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CodelineModule {

    @Provides
    @Singleton
    fun provideExampleDependency(): ExampleDependency {
        return ExampleDependency()
    }
}

// ExampleDependency.kt

