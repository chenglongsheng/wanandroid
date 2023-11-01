package com.buyehou.wanandroid.network.di

import com.buyehou.wanandroid.network.NetWorkApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * @author buyehou
 */
@Module
@InstallIn(SingletonComponent::class)
object NetWorkModule {

    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .build()

    @Singleton
    @Provides
    fun provideNetWorkApi(okHttpClient: OkHttpClient): NetWorkApi =
        Retrofit.Builder()
            .baseUrl(NetWorkApi.HOST)
            .client(okHttpClient)
            .build()
            .create(NetWorkApi::class.java)

}