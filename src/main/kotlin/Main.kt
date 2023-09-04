fun main(args: Array<String>) {
    //Assign variables
    var firstNumber = 8
    val secondNumber = 5
    //Print result for the following arithmetic task
    println("First Number + Second  Number = ${firstNumber+secondNumber}")

    println("First Number - Second  Number = ${firstNumber-secondNumber}")

    println("First Number / Second  Number = ${firstNumber/secondNumber}")

    println("First Number % Second  Number = ${firstNumber%secondNumber}")

    println("First Number * Second  Number = ${firstNumber*secondNumber}")

    //Printing out the statements
    firstNumber+=2
    println("first Number += 2 = $firstNumber")

    firstNumber-=2
    println("first Number -= 2 = $firstNumber")

    firstNumber*=2
    println("first Number *= 2 = $firstNumber")

    firstNumber/=2
    println("first Number /= 2 = $firstNumber")

    firstNumber%=2
    println("first Number %= 2 = $firstNumber")
}