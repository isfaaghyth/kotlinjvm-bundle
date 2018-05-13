package learn.ui

import learn.base.BaseActivity
import learn.data.Github
import learn.di.component.AppComponent
import javax.inject.Inject

class MainActivity: BaseActivity<MainView>(), MainView {

    @Inject
    internal lateinit var presenter: MainPresenterInt<MainView>

    private lateinit var component: AppComponent

    fun content() {
        presenter.reqExample()
    }

    override fun result(github: Github) {
        println(github.login)
    }

}