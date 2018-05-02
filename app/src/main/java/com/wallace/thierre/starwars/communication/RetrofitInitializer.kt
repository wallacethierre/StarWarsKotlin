package com.wallace.starwars.sample.starapplication.starWars.communication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by wallacethierre on 26/04/18.
 */
class RetrofitInitializer {


    private val retrofit = Retrofit.Builder()
            .baseUrl("https://swapi.co/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    fun StarWarsApi() = retrofit.create(StarWarsApi::class.java)
}