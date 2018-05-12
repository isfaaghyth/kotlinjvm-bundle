package learn.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import learn.network.Network
import learn.network.Routes

class BasePresenter<V: BaseView>: BasePresenterInt<V> {

    private lateinit var view: V
    private lateinit var routes: Routes
    private lateinit var composite: CompositeDisposable

    override fun attachView(view: V) {
        this.view = view
        routes = Network.builder.create(Routes::class.java)
    }

    override fun dettachView() {
        composite.clear()
    }

    override fun getService(): Routes {
        return routes
    }

    override fun view(): V {
        return view
    }

    override fun subscribe(disposable: Disposable) {
        composite = CompositeDisposable()
        composite.add(disposable)
    }

    override fun handleError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}