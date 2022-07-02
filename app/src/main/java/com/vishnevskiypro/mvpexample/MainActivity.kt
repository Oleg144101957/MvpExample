package com.vishnevskiypro.mvpexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import java.util.*

class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter.Base(MainModel.Base(Timer()))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.helloButton).setOnClickListener{
            presenter.start()
        }
        presenter.attachView(this)
    }

    override fun showHello(data: Int) {
        Snackbar.make(
            findViewById(R.id.container),
            data,
            Snackbar.LENGTH_LONG ).show()
    }
}