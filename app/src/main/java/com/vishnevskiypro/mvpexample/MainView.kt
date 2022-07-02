package com.vishnevskiypro.mvpexample

import androidx.annotation.StringRes

interface MainView {

    fun showHello(data: Int)

    class Empty : MainView{
        override fun showHello(@StringRes data: Int) = Unit
    }
}