package com.androidmvi.network.injection;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/androidmvi/network/injection/NetworkModule;", "", "()V", "BASE_URL", "", "mQaApiUrlConfig", "Lcom/androidmvi/spacex/network/injection/QaApiUrlConfig;", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "qaApiUrlConfig", "sharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "getRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "getSharedPreference", "getSpaceXAPI", "Lcom/androidmvi/spacex/network/api/SpaceXApi;", "retrofit", "isStub", "", "apiUrlConfig", "plainOkHttpBuilder", "Lokhttp3/OkHttpClient$Builder;", "setQAConfig", "", "android-sample-mvi-network_debug"})
@dagger.Module()
public final class NetworkModule {
    private static final java.lang.String BASE_URL = "https://api.spacexdata.com/v4/";
    private static com.androidmvi.spacex.network.injection.QaApiUrlConfig mQaApiUrlConfig;
    @org.jetbrains.annotations.NotNull()
    public static final com.androidmvi.network.injection.NetworkModule INSTANCE = null;
    
    private final okhttp3.OkHttpClient.Builder plainOkHttpBuilder(com.androidmvi.spacex.network.injection.QaApiUrlConfig qaApiUrlConfig, android.content.SharedPreferences sharedPreferences, android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient getOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.injection.QaApiUrlConfig qaApiUrlConfig, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.androidmvi.spacex.network.api.SpaceXApi getSpaceXAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public static final void setQAConfig(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.injection.QaApiUrlConfig qaApiUrlConfig) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit getRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences getSharedPreference(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    private final boolean isStub(com.androidmvi.spacex.network.injection.QaApiUrlConfig apiUrlConfig) {
        return false;
    }
    
    private NetworkModule() {
        super();
    }
}