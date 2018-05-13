package learn.ui

import learn.base.BasePresenterInt

interface MainPresenterInt: BasePresenterInt<MainView> {
    fun reqExample()
}