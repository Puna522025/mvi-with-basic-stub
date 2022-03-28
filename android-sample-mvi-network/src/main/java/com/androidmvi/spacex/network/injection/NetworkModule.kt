package com.androidmvi.network.injection;

import android.content.Context
import android.content.SharedPreferences
import android.text.TextUtils
import androidx.preference.PreferenceManager
import com.androidmvi.spacex.network.Constants
import com.androidmvi.spacex.network.api.SpaceXApi
import com.androidmvi.spacex.network.injection.QaApiUrlConfig
import com.androidmvi.spacex.network.injection.StubInterceptor
import com.com.androidmvi.spacex.network.BuildConfig
import com.fasterxml.jackson.databind.ObjectMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    private const val BASE_URL = "https://api.spacexdata.com/v4/"

    private lateinit var mQaApiUrlConfig: QaApiUrlConfig

    private fun plainOkHttpBuilder(
        qaApiUrlConfig: QaApiUrlConfig,
        sharedPreferences: SharedPreferences,
        context: Context
    ): OkHttpClient.Builder {
        val builder: OkHttpClient.Builder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
                .setLevel(HttpLoggingInterceptor.Level.HEADERS)
            builder.addInterceptor(httpLoggingInterceptor)
            if(isStub(mQaApiUrlConfig)){
                builder.addInterceptor(
                    StubInterceptor(
                        sharedPreferences,
                        context
                    )
                )
            }
        }
        return builder
    }

    @Provides
    @Singleton
    fun getOkHttpClient(qaApiUrlConfig: QaApiUrlConfig,
                        sharedPreferences: SharedPreferences,
                        @ApplicationContext context: Context): OkHttpClient {
        return plainOkHttpBuilder(mQaApiUrlConfig, sharedPreferences, context).build()
    }

    @Provides
    @Singleton
    fun getSpaceXAPI(retrofit: Retrofit): SpaceXApi {
        return retrofit.create(SpaceXApi::class.java)
    }

    @JvmStatic
    fun setQAConfig(qaApiUrlConfig: QaApiUrlConfig){
        mQaApiUrlConfig = qaApiUrlConfig;
    }

    @Provides
    @Singleton
    fun getRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    fun getSharedPreference(@ApplicationContext context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    private fun isStub(apiUrlConfig: QaApiUrlConfig): Boolean {
        val authBaseUrl: String = mQaApiUrlConfig.getAuthBaseUrl()
        return !TextUtils.isEmpty(authBaseUrl) && authBaseUrl.toLowerCase()
            .contains(Constants.STUB.toLowerCase())
    }
}