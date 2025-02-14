package com.orryfrasetyo.recipeoriapp.di

import com.orryfrasetyo.recipeoriapp.core.domain.usecase.RecipeInteractor
import com.orryfrasetyo.recipeoriapp.core.domain.usecase.RecipeUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun provideRecipeUseCase(recipeInteractor: RecipeInteractor): RecipeUseCase
}