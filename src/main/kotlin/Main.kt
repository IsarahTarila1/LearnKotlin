fun main(args: Array<String>) {
    val userName: String = "Tarila"
    val userAge: Int = 16
    val exampleRawString = """Florian
        |Tarila
        |
    """.trimMargin()
    print(exampleRawString)
    print("Hello World! $userName. I am $userAge years old.")
}