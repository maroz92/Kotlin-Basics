package pl.mrozok.kotlinpresentation.has

class DefaultArguments {

    fun overloadedFunction(value1: String = "first",
                           value2: String = "second",
                           value3: String = "third") {
    }

    fun functionTest() {
        overloadedFunction()
        overloadedFunction("not first")
        overloadedFunction("not first", "not second")
        overloadedFunction(value2 = "magic!")
    }
}