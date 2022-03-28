package com.androidmvi;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = SpaceXApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface SpaceXApplication_GeneratedInjector {
  void injectSpaceXApplication(SpaceXApplication spaceXApplication);
}
