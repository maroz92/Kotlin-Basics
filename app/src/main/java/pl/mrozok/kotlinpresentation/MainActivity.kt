package pl.mrozok.kotlinpresentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/*
*
*   # Android extension
*
* */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnClickListener()
    }

    private fun setOnClickListener() {

    }
}
