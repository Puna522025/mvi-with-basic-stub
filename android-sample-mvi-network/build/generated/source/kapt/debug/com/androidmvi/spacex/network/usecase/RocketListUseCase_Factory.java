// Generated by Dagger (https://dagger.dev).
package com.androidmvi.spacex.network.usecase;

import com.androidmvi.spacex.network.api.SpaceXApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RocketListUseCase_Factory implements Factory<RocketListUseCase> {
  private final Provider<SpaceXApi> spaceXApiProvider;

  public RocketListUseCase_Factory(Provider<SpaceXApi> spaceXApiProvider) {
    this.spaceXApiProvider = spaceXApiProvider;
  }

  @Override
  public RocketListUseCase get() {
    return newInstance(spaceXApiProvider.get());
  }

  public static RocketListUseCase_Factory create(Provider<SpaceXApi> spaceXApiProvider) {
    return new RocketListUseCase_Factory(spaceXApiProvider);
  }

  public static RocketListUseCase newInstance(SpaceXApi spaceXApi) {
    return new RocketListUseCase(spaceXApi);
  }
}
