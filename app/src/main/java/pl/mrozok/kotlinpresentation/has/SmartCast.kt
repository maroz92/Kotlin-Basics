package pl.mrozok.kotlinpresentation.has

import android.view.View
import android.widget.TextView

class SmartCast {

    fun example(view: View?) {
        if (view is TextView) {
            view.text = "Hello Proget!"
        }
    }
}