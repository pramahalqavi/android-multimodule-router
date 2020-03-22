package com.example.myapplication.injection

import com.example.feature01.Activity01A
import com.example.myapplication.MainActivity
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
    fun inject(activity: Activity01A)
    fun inject(activity: MainActivity)
    fun inject(activity: RouterImpl)
}