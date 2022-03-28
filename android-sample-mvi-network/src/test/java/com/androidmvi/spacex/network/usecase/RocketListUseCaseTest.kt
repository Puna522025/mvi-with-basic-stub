package com.androidmvi.spacex.network.usecase

import com.androidmvi.spacex.network.RxImmediateSchedulerRule
import com.androidmvi.spacex.network.api.SpaceXApi
import com.androidmvi.spacex.network.dto.Engines
import com.androidmvi.spacex.network.dto.GetRocketsResponse
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.reactivex.Single
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RocketListUseCaseTest {

    @get:Rule
    var testSchedulerRule = RxImmediateSchedulerRule()

    @MockK
    lateinit var spaceXApi: SpaceXApi

    private lateinit var rocketListUseCase: RocketListUseCase

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)

        rocketListUseCase = RocketListUseCase(spaceXApi)
    }

    @Test
    fun `return rocket list if api is successful `() {
        every { spaceXApi.getSpaceXRockets() } returns Single.just(TEST_RESPONSE)
        val list = rocketListUseCase.getRocketList().test().values()[0]
        assertThat(list.size).isEqualTo(1)
        assertThat(list[0].id).isEqualTo(ID)
    }

    @Test
    fun `return error if api is unsuccessful `() {
        val error = Throwable()
        every { spaceXApi.getSpaceXRockets() } returns Single.error(error)

        rocketListUseCase.getRocketList().test().assertError(error)
    }

    companion object {
        private const val ID = "1234"
        private const val NAME = "NAME"

        private val TEST_RESPONSE = listOf(
            GetRocketsResponse(
                ID, NAME, "COUNTRRY", true, Engines(1),
                "Description", listOf<String>("")
            )
        )
    }
}