//https://medium.com/@techPbAI/kotlin-tips-and-tricks-5-features-to-make-your-code-more-concise-and-expressive-46ff6839ed30
data class Person(val name: String, val age: Int, val address: String)

fun person(block: PersonBuilder.() -> Unit): Person {
    val builder = PersonBuilder()
    builder.block()
    return builder.build()
}

class PersonBuilder {
    var name: String = ""
    var age: Int = 0
    var address: String = ""

    fun build(): Person {
        return Person(name, age, address)
    }
}

val alice = person {
    name = "Alice"
    age = 20
    address = "Somewhere"
}

fun main() {
    println(alice)
}
