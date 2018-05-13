package learn.ui

import io.reactivex.disposables.CompositeDisposable
import learn.base.BaseActivity
import learn.data.Github
import learn.network.Network
import learn.network.Routes

class MainActivity: BaseActivity<MainView>(), MainView {

    var presenter: MainPresenterInt<MainView> = MainPresenter(this, Network.builder.create(Routes::class.java), CompositeDisposable())

    fun content() {
        presenter.reqExample()
    }

    override fun result(github: Github) {
        println("RESULT => ${github.login}")
    }

}