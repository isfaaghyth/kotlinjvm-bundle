package learn.base

import io.reactivex.disposables.CompositeDisposable
import learn.network.Routes
import retrofit2.HttpException

open class BasePresenter<V: BaseView> internal constructor(protected val routes: Routes,
                                                           protected val  composite: CompositeDisposable) : BasePresenterInt<V> {

    private lateinit var view: V

    override fun attachView(view: V) {
        this.view = view
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

    override fun handleError(error: Throwable) {
        if (error is HttpException) {
            when(error.code()) {
                408 -> view.onError("RTO")
                else -> view.onError("Gagal")
            }
        }
    }

}