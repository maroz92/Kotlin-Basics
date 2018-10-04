package pl.mrozok.kotlinpresentation.has

import android.content.Intent

/*
*
*   # run
*   # with
*   # apply
*   # let
*   # also
*
* */

class ApplyRun {

    fun test(intent: Intent) {
        intent.extras?.run {
            putString("key", "value")
            putInt("number", 123)
            putBoolean("condition", true)
        }
    }
}