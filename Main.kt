fun main() {
    println("Hello, world!")
    
    val customers = 10
    println("There are $customers customers")
}

fun main() {
    // Tipe Data Dasar
    val d: Int
    d = 3
    val e: String = "hello"

    // List
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // Set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)

    // Map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
}

fun main() {
    // If
    val d: Int
    val check = true
    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    // When
    val obj = "Hello"
    val result = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println(result)
}
