package com.gogumac.thenote

import android.app.Application
import android.content.Context


class TheNote: Application() {
    init{
        instance=this
    }

    companion object{
        lateinit var instance:TheNote
        fun ApplicationContext(): Context {
            return instance.applicationContext
        }
    }
}