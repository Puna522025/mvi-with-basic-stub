package com.androidmvi.spacex.network.usecase

import com.androidmvi.spacex.network.RxImmediateSchedulerRule
import com.androidmvi.spacex.network.api.SpaceXApi
import com.androidmvi.spacex.network.dto.GetDetailsResponse
import com.androidmvi.spacex.network.dto.GetRocketDetailsResponse
import com.androidmvi.spacex.network.dto.Links
import com.androidmvi.spacex.network.dto.Patch
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.reactivex.Single
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.util.*

class RocketDetailsUseCaseTest {

    @get:Rule
    var testSchedulerRule = RxImmediateSchedulerRule()

    @MockK
    lateinit var spaceXApi: SpaceXApi

    private lateinit var rocketDetailsUseCase: RocketDetailsUseCase

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)

        rocketDetailsUseCase = RocketDetailsUseCase(spaceXApi)
    }

    @Test
    fun `return rocket details if api is successful `() {

        every { spaceXApi.getRocketDetails(any()) } returns Single.just(TEST_RESPONSE)
        val list = rocketDetailsUseCase.getRocketDetails(ID).test().values()[0]

        assertThat(list.size).isEqualTo(5)
    }

    @Test
    fun `return error if api is unsuccessful `() {
        val error = Throwable()
        every { spaceXApi.getRocketDetails(any()) } returns Single.error(error)

        rocketDetailsUseCase.getRocketDetails(ID).test().assertError(error)
    }

    companion object {
        private const val ID = "1234"
        private const val NAME = "NAME"

        private val TEST_RESPONSE = GetDetailsResponse(
            listOf(
                GetRocketDetailsResponse(
                    NAME,
                    true,
                    Date(),
                    Links(
                        Patch("")
                    )
                ),
                GetRocketDetailsResponse(
                    NAME,
                    true,
                    Date(),
                    Links(
                        Patch("")
                    )
                ),
                GetRocketDetailsResponse(
                    NAME,
                    true,
                    Date(),
                    Links(
                        Patch("")
                    )
                ),
                GetRocketDetailsResponse(
                    NAME,
                    true,
                    Date(),
                    Links(
                        Patch("")
                    )
                )
            )
        )
    }
}