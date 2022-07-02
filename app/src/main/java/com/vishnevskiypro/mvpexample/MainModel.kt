package com.vishnevskiypro.mvpexample

import java.util.*

interface MainModel {

    fun data(dataCallback: DataCallback)

    class Base(private val timer: Timer) : MainModel {
        override fun data(dataCallback: DataCallback){
            timer.schedule(object : TimerTask(){
                override fun run() = dataCallback.returnData(R.string.hello)
            }, 5000)
        }
    }
}

interface DataCallback{
    fun returnData(data: Int)
}