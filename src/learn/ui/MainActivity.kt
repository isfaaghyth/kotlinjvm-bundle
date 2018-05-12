package learn.ui

import learn.base.BaseActivity
import learn.data.Github

class MainActivity: BaseActivity<MainView>(), MainView {

    init {
        presenter = MainPresenter(this)
    }

    companion object {
        fun content(main: MainActivity) {
            (main.presenter as MainPresenter).reqExample()
        }
    }

    override fun result(github: Github) {
        println(github.login)
    }

}