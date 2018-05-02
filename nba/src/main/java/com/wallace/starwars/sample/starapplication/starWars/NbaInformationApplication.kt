package com.wallace.starwars.sample.starapplication.starWars

import android.app.Application
import com.wallace.starwars.sample.starapplication.starWars.communication.RetrofitInitializer

/**
 * Created by wallacethierre on 26/04/18.
 */
class NbaInformationApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        RetrofitInitializer()
    }
}