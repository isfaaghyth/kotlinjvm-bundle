package learn.base

open abstract class BaseActivity<V>: BaseView {

    protected lateinit var presenter: BasePresenterInt<V>

    override fun showLoading() {
        println("showLoading();")
    }

    override fun hideLoading() {
        println("hideLoading();")
    }

    override fun onError(message: String) {
        println("error: $message")
    }

}