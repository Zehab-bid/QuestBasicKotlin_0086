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

// Fungsi ditulis di luar main()
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    // Loops (For)
    for (number in 1..5) {
        print(number)
    }
    println()

    // Functions
    println(sum(1, 2))
    
    // Named & Default arguments
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessageWithPrefix("Hello")

    // Lambda expressions
    println({ string: String -> string.uppercase() }("hello"))
}

// Deklarasi kelas di luar main()
class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    // Create instance & Access properties
    val contact = Contact(1, "mary@gmail.com")
    println(contact.email)
    
    contact.email = "jane@gmail.com"
    println(contact.email)
    
    // Member functions
    contact.printId()
}
