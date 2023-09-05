fun main(args: Array<String>) {
    //Assign values to names array
    val names = arrayOf("Tarila", "David", "Isarah")
    val numbers = arrayOf(1, 2, 3)

    //Use a for loop to print the indexes and element
    for (index in names.indices)
        println("Index: $index Element: ${names[index]}")

    //Use a for loop to print a multiplication times table
    for (i in 1 .. 12 )
        println("2 x $i = ${i*2}")
    for (i in 1..12)
        println("3 x $i = ${i*3}")
}
