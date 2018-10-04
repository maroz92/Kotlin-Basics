package pl.mrozok.kotlinpresentation.has

class Ranges {

    fun rangesExample(number: Int) {
        when (number) {
            -10 -> println("")
            -20, -21, -22 -> println("")
            in -5..5 -> println("")
            else -> println("")
        }
    }
}