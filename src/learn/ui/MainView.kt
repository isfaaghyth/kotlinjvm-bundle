package learn.ui

import learn.base.BaseView
import learn.data.Github

interface MainView: BaseView {
    fun result(github: Github)
}