package learn.ui

import learn.base.BasePresenter

class MainPresenter(view: MainView): BasePresenter<MainView>() {

    init {
        super.attachView(view)
    }

    fun reqExample() {

    }

}