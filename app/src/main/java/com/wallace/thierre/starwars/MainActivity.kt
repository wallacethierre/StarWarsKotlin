package com.wallace.thierre.starwars

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wallace.starwars.sample.starapplication.starWars.PeopleResults
import com.wallace.starwars.sample.starapplication.starWars.communication.RetrofitInitializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val call = RetrofitInitializer().StarWarsApi().listPeople()
        call.enqueue(
                object : Callback<PeopleResults> {

                    override fun onResponse(call: Call<PeopleResults>?, response: Response<PeopleResults>?) {
                        response?.body()?.let {
                            val people = it.results
                            Log.i("DJACA", "Response value: " + (people.toString()))

                            //To change body of created functions use File | Settings | File Templates.
                        }
                    }

                    override fun onFailure(call: Call<PeopleResults>?, t: Throwable?) {
                        Log.e("DJACA", "Request Error: " + t!!.printStackTrace().toString(), t)
                        //To change body of created functions use File | Settings | File Templates.
                    }

                })

    }
}
