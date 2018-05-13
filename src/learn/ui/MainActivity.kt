package learn.ui

import learn.base.BaseActivity
import learn.data.Github

class MainActivity: BaseActivity<MainView>(), MainView {

    private val presenter: MainPresenterInt

    init {
        presenter = MainPresenter(this)
    }

    fun content() {
        presenter.reqExample()
    }

    override fun result(github: Github) {
        println(github.login)
    }

}