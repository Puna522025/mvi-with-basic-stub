// Generated by Dagger (https://dagger.dev).
package com.androidmvi.network.injection;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_GetSharedPreferenceFactory implements Factory<SharedPreferences> {
  private final Provider<Context> contextProvider;

  public NetworkModule_GetSharedPreferenceFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return getSharedPreference(contextProvider.get());
  }

  public static NetworkModule_GetSharedPreferenceFactory create(Provider<Context> contextProvider) {
    return new NetworkModule_GetSharedPreferenceFactory(contextProvider);
  }

  public static SharedPreferences getSharedPreference(Context context) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.getSharedPreference(context));
  }
}
