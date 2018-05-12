package learn.base

import io.reactivex.disposables.Disposable
import learn.network.Routes

interface BasePresenterInt<V> {
    fun subscribe(disposable: Disposable)
    fun handleError(error: Throwable)
    fun getService(): Routes
    fun attachView(view: V)
    fun dettachView()
    fun view(): V
}