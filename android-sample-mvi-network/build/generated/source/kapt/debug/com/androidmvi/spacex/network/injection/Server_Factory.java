// Generated by Dagger (https://dagger.dev).
package com.androidmvi.spacex.network.injection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Server_Factory implements Factory<Server> {
  @Override
  public Server get() {
    return newInstance();
  }

  public static Server_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Server newInstance() {
    return new Server();
  }

  private static final class InstanceHolder {
    private static final Server_Factory INSTANCE = new Server_Factory();
  }
}
