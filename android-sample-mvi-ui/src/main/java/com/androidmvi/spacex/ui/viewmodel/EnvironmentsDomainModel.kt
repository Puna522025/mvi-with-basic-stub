package com.mobile.sw.environmentselection

import com.androidmvi.spacex.ui.viewmodel.EnvironmentGroup

data class EnvironmentsDomainModel(private val unsortedEnvironmentGroups: List<EnvironmentGroup>) {

    private companion object {
        const val STUB_ENVIRONMENT_GROUP = "STUB"
        const val APP_LINKS_ENVIRONMENT = "Universal/App Links"
    }

    val environmentGroups: List<EnvironmentGroup>
        get() = unsortedEnvironmentGroups.sortedByDescending { it.name }

    val filterStubGroupForAppLinks: List<EnvironmentGroup>
        get() = mutableListOf<EnvironmentGroup>().apply {
            environmentGroups.forEach { environmentGroup ->
                if (environmentGroup.name == STUB_ENVIRONMENT_GROUP) {
                    environmentGroup.environments = environmentGroup.environments.filter {
                        it.name == APP_LINKS_ENVIRONMENT
                    }
                }
                add(environmentGroup)
            }
        }
}
