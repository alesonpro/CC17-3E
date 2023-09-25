fun main() {
    
    val name = "Aleson"
    val age = 20
    var year = 365
    val border = "==%%"
    val timesToRepeat = 7
 	printBorder(border, timesToRepeat)
    print("Happy Birthday ${name}! \n")
    printBorder(border, timesToRepeat)
    print("I am ${age} years old \n")
    print("${age} is the best age to learn Kotlin! \n")
    
    //Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
    var finalAge = age * year
    print("You are ${finalAge} days old")
}

fun printBorder(border:String, timesToRepeat:Int){
    repeat(timesToRepeat){
        print(border)
    }
    println()
}