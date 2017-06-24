fun main(args: Array<String>) {
	for (x in arrayOf(1,2,3)) {
        println(x)
    }
    println("-------------------")
    val names = listOf("foo", "bar", "baz")
    for (name in names) {
        println(name)
    }
    println("-------------------")
    for (i in 1..10 step 2) {
        println(i)
    }
}
