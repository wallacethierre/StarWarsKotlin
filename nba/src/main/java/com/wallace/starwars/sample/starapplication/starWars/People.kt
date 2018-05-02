package com.wallace.starwars.sample.starapplication.starWars

/**
 * Created by wallacethierre on 26/04/18.
 */

data class PeopleResults (val results: List<Person>)
data class Person (
        val name: String,
        val height: String,
        val birth_year: String,
        val url: String,
        val gender: String
)