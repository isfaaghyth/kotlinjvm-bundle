package learn.ui

import io.reactivex.schedulers.Schedulers
import learn.base.BasePresenter

class MainPresenter(view: MainView): BasePresenter<MainView>(), MainPresenterInt {

    init {
        super.attachView(view)
    }

    override fun reqExample() {
        view().showLoading()
        subscribe(
                getService().exampleRequest()
                        .observeOn(Schedulers.io())
                        .subscribe(
                                { res -> kotlin.run {
                                    view().hideLoading()
                                    view().result(res)
                                } },
                                { err -> err.message?.let {
                                    view().hideLoading()
                                    view().onError(it)
                                } }
                        )
        )
    }

}