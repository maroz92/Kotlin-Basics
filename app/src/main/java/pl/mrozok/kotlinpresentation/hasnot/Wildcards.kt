package pl.mrozok.kotlinpresentation.hasnot

class Wildcards {

    interface Producer<out T> {
        fun produce(): T
    }

    interface Consumer<in T> {
        fun consume(param: T)
    }
}