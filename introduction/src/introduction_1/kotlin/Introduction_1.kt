fun start(): String {
    return "OK"
}

fun main(args: Array<String>) {
    println(start())

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}