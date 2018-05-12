package learn.ui

import learn.base.BasePresenter
import learn.data.Github
import learn.utils.ComposeUtils

class MainPresenter(view: MainView): BasePresenter<MainView>() {

    init {
        super.attachView(view)
    }

    fun reqExample() {
        subscribe(
                getService().exampleRequest()
                        .compose(ComposeUtils.set<Github>())
                        .subscribe(
                                { res -> view().result(res) },
                                { err -> err.message?.let { view().onError(it) } }
                        )
        )
    }

}