package learn.network

import learn.data.Github
import retrofit2.http.GET
import io.reactivex.Single

interface Routes {

    @GET("users/isfaaghyth")
    fun exampleRequest(): Single<Github>

}