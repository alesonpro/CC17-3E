fun main() {
    // declare the age of the person
    val myAge = 24
    // declare the number of layers
    val numLayers = 5
    printCakeCandles(myAge)
    printCakeTop(myAge)
    printCakeBottom(myAge, numLayers)
}

fun printCakeCandles(age: Int) {
    print("")
    repeat(age) {
        print(",")
    }
    println()

    print("")
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("#")
        }
        println()
    }
}


