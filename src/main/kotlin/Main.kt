fun main(args: Array<String>) {
    //Assign values to names array
    val names = arrayOf("Tarila", "David", "Isarah")
    val numbers = arrayOf(1, 2, 3)

    //Assign values to multi-lines Array
    val multipleIndex = arrayOf(arrayOf(4,5,6),
    arrayOf(7,8,9),
        arrayOf(10,11,12)
    )

    //Print the size of elements in the array
    println("Number of elements: ${names.size}")

    //Print the element of the array
    println("First element: ${names[0]}"+"\nSecond element: ${names[1]}"+"\nThird element: ${names[2]}")

    //Print values of multi lines array
    println("Second element of the second array: ${multipleIndex[1][1]}")

    //print the third character of index 0
    println("The third character of ${names[0]}: ${names[0][2]}")

    //print out the numbers of characters of index 0
    println("We have ${names[0].length} alphabets in ${names[0]}")
}
