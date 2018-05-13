package learn.di.module

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import learn.network.Network
import learn.network.Routes
import learn.ui.MainPresenter
import learn.ui.MainPresenterInt
import learn.ui.MainView

@Module
class AppModule {

    @Provides
    fun provideMainPresenter(presenter: MainPresenter): MainPresenterInt<MainView> = presenter

    @Provides
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    fun provideRoutes(): Routes = Network.builder.create(Routes::class.java)

}