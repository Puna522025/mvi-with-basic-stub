package com.androidmvi.spacex.network.repository

import com.androidmvi.spacex.network.domain.GetRocketsDomainModel
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class RocketsListRepositoryTest {
    private lateinit var rocketsListRepository: RocketsListRepository

    @MockK
    lateinit var rocketsDomainModel: GetRocketsDomainModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)

        rocketsListRepository = RocketsListRepository()
    }

    @Test
    fun `get list of rocket domain model`() {
        val list = arrayListOf(rocketsDomainModel)
        rocketsListRepository.setListOfRockets(list)
        assertThat(rocketsListRepository.getListOfRockets).isEqualTo(list)
    }

    @Test
    fun `return empty if not list not set`() {
        assertThat(rocketsListRepository.getListOfRockets).isEmpty()
    }
}