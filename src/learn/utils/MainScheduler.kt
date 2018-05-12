package learn.utils

import io.reactivex.schedulers.Schedulers

class MainScheduler<T>: SchedulerTransformer<T>(Schedulers.io(), Schedulers.newThread())