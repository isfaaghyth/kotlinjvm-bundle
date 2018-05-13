package learn.base

open class BaseActivity<V>: BaseView {

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