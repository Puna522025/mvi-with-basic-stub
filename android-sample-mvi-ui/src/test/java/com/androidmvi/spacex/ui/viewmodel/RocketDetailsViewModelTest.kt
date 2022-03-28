package com.androidmvi.spacex.ui.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.androidmvi.spacex.network.domain.GetRocketDetailsDomainModel
import com.androidmvi.spacex.network.usecase.RocketDetailsUseCase
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.reactivex.Single
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class RocketDetailsViewModelTest {
    @Rule
    @JvmField
    var instantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @MockK
    lateinit var rocketDetailsUseCase: RocketDetailsUseCase

    @MockK
    lateinit var rocketDetailsDomainModel: GetRocketDetailsDomainModel

    private lateinit var rocketDetailsViewModel: RocketDetailsViewModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)

        rocketDetailsViewModel = RocketDetailsViewModel(rocketDetailsUseCase)
    }

    @Test
    fun `return data when api is successful`() {

        every { rocketDetailsUseCase.getRocketDetails(ID) } returns Single.just(listOf(rocketDetailsDomainModel))
        rocketDetailsViewModel.getRocketDetails(ID)

        val stateData: StateData<List<GetRocketDetailsDomainModel>>? =
            rocketDetailsViewModel.getRocketDetailsViewModelObservable().value

        assertThat(stateData).isNotNull
    }

    @Test
    fun `return error when api failed`() {

        every { rocketDetailsUseCase.getRocketDetails(ID) } returns Single.error(Throwable())
        rocketDetailsViewModel.getRocketDetails(ID)

        val stateData: StateData<List<GetRocketDetailsDomainModel>>? =
            rocketDetailsViewModel.getRocketDetailsViewModelObservable().value

        assertThat(stateData).isNotNull
    }

    companion object {
        private const val ID = "1234"
    }
}