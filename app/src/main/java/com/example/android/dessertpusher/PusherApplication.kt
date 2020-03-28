package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

/**
 * Created by Damian on 28.03.2020 14:39
 */
class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}