package com.example.myapplication.injection

import com.example.feature01.Activity01A
import com.example.myapplication.ActivityAppA
import com.example.myapplication.RouterImpl
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    @Component.Factory
    interface Builder {
        fun build(appModule: ApplicationModule): ApplicationComponent
    }
    fun router(): RouterImpl
    fun inject(activity: ActivityAppA)
    fun inject(activity: RouterImpl)
}