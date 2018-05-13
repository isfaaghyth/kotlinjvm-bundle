package learn.ui

import learn.base.BasePresenter
import learn.data.Github
import learn.utils.ComposeUtils

class MainPresenter(view: MainView): BasePresenter<MainView>(), MainPresenterInt {

    init {
        super.attachView(view)
    }

    override fun reqExample() {
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