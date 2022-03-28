package com.androidmvi.spacex.ui.injection

import android.content.Context
import androidx.lifecycle.ViewModel
import com.androidmvi.spacex.network.repository.RocketsListRepository
import com.androidmvi.spacex.network.usecase.RocketDetailsUseCase
import com.androidmvi.spacex.ui.viewmodel.EnvironnmentViewModel
import com.androidmvi.spacex.ui.viewmodel.RocketDetailsViewModel
import com.androidmvi.spacex.ui.viewmodel.RocketListViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@InstallIn(SingletonComponent::class)
@Module
object ViewModuleInjects {

    @Provides
    @IntoMap
    @ViewModelKey(RocketListViewModel::class)
    fun rocketListViewModel(
        repository: RocketsListRepository
    ): ViewModel {
        return RocketListViewModel(repository)
    }

    @Provides
    @IntoMap
    @ViewModelKey(RocketDetailsViewModel::class)
    fun rocketDetailsViewModel(
        rocketListUseCase: RocketDetailsUseCase
    ): ViewModel {
        return RocketDetailsViewModel(rocketListUseCase)
    }

    @Provides
    @IntoMap
    @ViewModelKey(EnvironnmentViewModel::class)
    fun environnmentViewModel(): ViewModel {
        return EnvironnmentViewModel()
    }
}