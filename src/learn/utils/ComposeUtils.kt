package learn.utils

object ComposeUtils {
    fun <T> set(): MainScheduler<T> = MainScheduler()
}