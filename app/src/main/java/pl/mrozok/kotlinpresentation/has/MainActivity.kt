package pl.mrozok.kotlinpresentation.has

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import pl.mrozok.kotlinpresentation.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        button.setOnClickListener {
            text_view.text = "Hello world!"
        }
    }
}
