package com.vishnevskiypro.mvpexample

interface MainPresenter {

    fun start()

    fun attachView(mainView: MainView)

    class Base(private val model: MainModel) : MainPresenter {

        private var view: MainView = MainView.Empty()

        override fun start() = model.data(object : DataCallback {
                override fun returnData(data: Int) = view.showHello(data)
        })

        override fun attachView(mainView: MainView) {
            view = mainView
        }
    }
}