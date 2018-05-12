package learn.base

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(message: String)
}