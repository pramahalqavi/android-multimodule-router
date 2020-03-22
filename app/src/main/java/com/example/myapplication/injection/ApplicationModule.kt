package com.example.myapplication.injection

import com.example.myapplication.RouterImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {
    @Provides
    @ApplicationScope
    fun provideRouter(): RouterImpl {
        return RouterImpl()
    }
}