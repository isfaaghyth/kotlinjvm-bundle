package learn.base

import io.reactivex.disposables.CompositeDisposable
import learn.network.Routes

class BasePresenter<V: BaseView>: BasePresenterInt<V> {

    private lateinit var view: V
    private lateinit var routes: Routes
    private lateinit var composite: CompositeDisposable

    override fun attachView(view: V) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dettachView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun view(): V {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}