package learn.ui

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import learn.base.BasePresenter
import learn.network.Routes
import javax.inject.Inject

class MainPresenter @Inject internal constructor(view: MainView, routes: Routes, compositeDisposable: CompositeDisposable) :
        BasePresenter<MainView>(routes = routes, composite = compositeDisposable), MainPresenterInt<MainView> {

    init {
        super.attachView(view)
    }

    override fun reqExample() {
        view().showLoading()
        composite.add(getService().exampleRequest()
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
                ))
    }

}