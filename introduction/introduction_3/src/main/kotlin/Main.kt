fun joinOptions(options: Collection<String>) = options.joinToString(", ", "[", "]")

fun main(args: Array<String>) {
    println(joinOptions(arrayListOf("a", "b", "c")))
}