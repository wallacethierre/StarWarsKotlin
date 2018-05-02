package com.wallace.starwars.sample.starapplication.starWars.communication

import com.wallace.starwars.sample.starapplication.starWars.PeopleResults
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by wallacethierre on 26/04/18.
 */
interface StarWarsApi {
    @GET("people")
    fun listPeople() : Call<PeopleResults>
}