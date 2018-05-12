package learn.base

interface BasePresenterInt<V> {
    fun attachView(view: V)
    fun dettachView()
    fun view(): V
}