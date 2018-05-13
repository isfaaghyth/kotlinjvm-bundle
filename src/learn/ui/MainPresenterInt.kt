package learn.ui

import learn.base.BasePresenterInt

interface MainPresenterInt<V: MainView>: BasePresenterInt<V> {
    fun reqExample()
}