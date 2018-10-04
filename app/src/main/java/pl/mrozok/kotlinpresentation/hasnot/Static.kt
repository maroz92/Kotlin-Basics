package pl.mrozok.kotlinpresentation.hasnot

import java.util.*

class Static {

    companion object {
        const val MY_FAVORITE_NUMBER: Int = 333

        val NON_STATIC_DATE: Date = Date()

        @JvmField
        val STATIC_DATE: Date = Date()

        fun nonStaticMethod() {}

        @JvmStatic
        fun staticMethod() {
        }
    }
}