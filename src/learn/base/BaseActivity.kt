package learn.base

open class BaseActivity<V>: BaseView {

    override fun showLoading() {
        println("Please wait...")
    }

    override fun hideLoading() {
        println("done!")
    }

    override fun onError(message: String) {
        println("error: $message")
    }

}