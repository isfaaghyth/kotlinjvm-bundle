package learn.base

import learn.network.Routes

interface BasePresenterInt<V> {
    fun handleError(error: Throwable)
    fun getService(): Routes
    fun attachView(view: V)
    fun dettachView()
    fun view(): V
}