package pl.mrozok.kotlinpresentation.has

class Streams {

    fun evenNumbers(): List<String> {
        return arrayOf(4, 5, 2, 10, 8, 7, 3, 24, 15, 12)
                .filter { i -> i % 2 == 0 }
                .sorted()
                .map { i -> i.toString() }
    }
}