fun main(args: Array<String>) {
    val x = 1
	when (x) {
		1 -> println("one")
        2, 3 -> println("two or three")
	    else -> {
            println("unknown")
        }
    }
}
