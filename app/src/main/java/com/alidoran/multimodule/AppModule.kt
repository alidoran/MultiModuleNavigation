package com.alidoran.multimodule

import com.alidoran.base_library.ModuleNavigator
import com.alidoran.multimodule.AddressGenerator.generateAddressList
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun providesAddressString(): List<ModuleNavigator.ActivityAddress> = generateAddressList()
}