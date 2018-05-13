package learn.di.component

import dagger.Component
import learn.di.module.AppModule
import learn.ui.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun inject(activity: MainActivity)
}